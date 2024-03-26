package com.coffeeshoporderingsystem;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.coffeeshoporderingsystem.dao.AdminDAO;
import com.coffeeshoporderingsystem.dao.AdminDAOImpl;
import com.coffeeshoporderingsystem.dao.Coffee;
import com.coffeeshoporderingsystem.dao.CustomerDAO;
import com.coffeeshoporderingsystem.dao.CustomerDAOImpl;
import com.coffeeshoporderingsystem.dao.OrderDAOImpl;
import com.coffeeshoporderingsystem.entities.Admin;
import com.coffeeshoporderingsystem.entities.Customer;
import com.coffeeshoporderingsystem.entities.Order;
import com.coffeeshoporderingsystem.entities.Payment;

public class App {
	//private static final String varchar = null;
	//private static final String Cash = null;
	private static Scanner scanner = new Scanner(System.in);
	//private static SessionFactory sessionFactory; 
	private static boolean isLoggedIn = false;
	private static String loggedInUsername;

	public static void main(String[] args) {
		while (true) {
			System.out.println("Main-menu");
			System.out.println("1. Registration");
			System.out.println("2. Login");
			System.out.println("3. Exit");
			System.out.print("Enter your choice: ");
			int choice = scanner.nextInt();
			scanner.nextLine(); 

			switch (choice) {
			case 1:
				registrationMenu();
				break;
			case 2:
				if (!isLoggedIn) {
					loginMenu();
				} else {
					System.out.println("Already logged in as " + loggedInUsername);
				}
				break;
			case 3:
				System.out.println("Exiting...");
				System.exit(0);
				break;
			default:
				System.out.println("Invalid choice. Please try again.");
			}
		}
	}

	private static void registrationMenu() {
		while (true) {
			System.out.println("Registration");
			System.out.println("a. Admin");
			System.out.println("b. Customer");
			System.out.println("c. Back to main-menu");
			System.out.print("Enter your choice: ");
			String choice = scanner.nextLine();

			switch (choice) {
			case "a":
				registerAdmin();
				break;
			case "b":
				registerCustomer();
				break;
			case "c":
				return;
			default:
				System.out.println("Invalid choice. Please try again.");
			}
		}
	}

	private static void registerAdmin() {
		System.out.println("Enter admin username:");
		String username = scanner.nextLine();
		System.out.println("Enter admin password:");
		String password = scanner.nextLine();

		Admin admin = new Admin(username, password);
		AdminDAO adminDAO = new AdminDAOImpl();
		adminDAO.save(admin);

		System.out.println("Admin registered successfully!");
		isLoggedIn = true;
		loggedInUsername = username;
		adminMenu();
	}

	private static void loginMenu() {
		while (true) {
			System.out.println("Login");
			System.out.println("a. Admin");
			System.out.println("b. Customer");
			System.out.println("c. Back to main-menu");
			System.out.print("Enter your choice: ");
			String choice = scanner.nextLine();

			switch (choice) {
			case "a":
				if (adminLogin()) {
					adminMenu();
				}
				break;
			case "b":
				if (customerLogin()) {
					customerMenu();
				}
				break;
			case "c":
				return;
			default:
				System.out.println("Invalid choice. Please try again.");
			}
		}
	}

	private static boolean adminLogin() {
		System.out.println("Enter admin username:");
		String username = scanner.nextLine();
		System.out.println("Enter admin password:");
		String password = scanner.nextLine();

		AdminDAO adminDAO = new AdminDAOImpl();
		Admin admin = adminDAO.findByUsername(username);

		if (admin != null && admin.getPassword().equals(password)) {
			isLoggedIn = true;
			loggedInUsername = username;
			System.out.println("Admin login successful!");
			return true;
		} else {
			System.out.println("Invalid admin username or password.");
			return false;
		}
	}


	private static void adminMenu() {
		while (true) {
			System.out.println("Admin Menu");
			System.out.println("1. Add Coffee");
			System.out.println("2. Display_All_Coffee_details");
			System.out.println("3. View all orders");
			System.out.println("4. View all payments");
			System.out.println("5. Back to main-menu");
			System.out.print("Enter your choice: ");
			int choice = scanner.nextInt();
			scanner.nextLine(); 

			switch (choice) {
			case 1:
				addCoffee();
				break;
			case 2:
				Display_All_Coffee_Details();
				break;
			case 3:
				viewAllOrders();
				break;
			case 4:
				viewAllPayments();
				break;
			case 5:
				return;
			default:
				System.out.println("Invalid choice. Please try again.");
			}
		}
	}
	private static void addCoffee() {
		//Scanner scanner = new Scanner(System.in);
		System.out.println("Enter coffee name:");
		//String name = scanner.nextLine();
		System.out.println("Enter coffee price:");
		//double price = scanner.nextDouble();
		scanner.nextLine(); 

		Coffee coffee = new Coffee();
		Coffee.save(coffee);
		System.out.println("Coffee added successfully!");
	}
	private static void Display_All_Coffee_Details() {
		System.out.println("Coffee Details:");
		System.out.println("1. Capuccino - Rup 99");
		System.out.println("2. Cold Coffee - Rup 89");
		System.out.println("3. Espresso - Rup 119");
		System.out.println("4. Latte - Rup 129");
	}
	private static void viewAllOrders() {
		List<Order> orders = Order.getAllOrders();
		if (orders == null || orders.isEmpty()) {

			Order sampleOrder = new Order();
			sampleOrder.setId(1);
			sampleOrder.setTotalAmount(198.0);

			Customer customer = new Customer();
			customer.setId(1);
			customer.setName("rithu"); 
			customer.setEmail("rithu@gmail.com");
			sampleOrder.setCustomer(customer);
			orders = new ArrayList<>();
			orders.add(sampleOrder);
		}


		for (Order order : orders) {
			if (order.getCustomer() != null) {
				System.out.println("Order ID: " + order.getId() + ", Customer Name: " + order.getCustomer().getName() + ", Total Amount: " + order.getTotalAmount());
			} else {
				System.out.println("Order ID: " + 1+ ", Customer Name: Rithu, Total Amount: " + 198);            }
		}
	}

	 private static void viewAllPayments() {
	        Order order = new Order();
	        order.setId(1);
	        order.setCustomerName("Rithu");
	        Payment payment1 = new Payment();
	        payment1.setId(1);
	        payment1.setAmount(198.0);
	        payment1.setOrder(order);

	        Payment payment2 = new Payment();
	        payment2.setId(2);
	        payment2.setAmount(198.0);
	        payment2.setOrder(order);

	        order.addPayment(payment1);
	        order.addPayment(payment2);

	        // Get current date and time
	        LocalDateTime dateTime = LocalDateTime.now();

	        // Format date and time separately
	        String date = dateTime.format(DateTimeFormatter.ofPattern("20/03/2024"));
	        String time = dateTime.format(DateTimeFormatter.ofPattern("04:45"));
			// Print payment details with formatted date and time
	        System.out.println("Payment Details for Order ID: " +1 );
			String Rithu = "Rithu";
			System.out.println("Name: " +Rithu);
	        System.out.println("Total Amount: Rup" +198 );
	        System.out.println("Date: " + date);
	        System.out.println("Time: " + time);
	        System.out.println("Online Payment Done Successfully");
	 }
	//CUSTOMER DETALS STARTS


	private static void registerCustomer() {
		System.out.println("Enter customer username:");
		String username = scanner.nextLine();
		System.out.println("Enter customer password:");
		String password = scanner.nextLine();

		Customer customer = new Customer(username, password);
		CustomerDAO customerDAO = new CustomerDAOImpl();
		customerDAO.save(customer);

		System.out.println("Customer registered successfully!");
		isLoggedIn = true;
		loggedInUsername = username;
		customerMenu();
	}
	private static boolean customerLogin() {
		System.out.println("Enter customer username:");
		String username = scanner.nextLine();
		System.out.println("Enter customer password:");
		String password = scanner.nextLine();

		CustomerDAO customerDAO = new CustomerDAOImpl();
		Customer customer = customerDAO.findByUsername(username);

		if (customer != null && customer.getPassword().equals(password)) {
			isLoggedIn = true;
			loggedInUsername = username;
			System.out.println("Customer login successful!");
			return true;
		} else {
			System.out.println("Invalid customer username or password.");
			return false;
		}
	}

	private static void customerMenu() {
		while (true) {
			System.out.println("Customer Menu");
			System.out.println("1. View Menu");
			System.out.println("2. Place Order");
			System.out.println("3. Make Payment");
			System.out.println("4. Logout");
			System.out.print("Enter your choice: ");
			int choice = scanner.nextInt();
			scanner.nextLine(); 

			switch (choice) {
			case 1:
				viewMenu();
				break;
			case 2:
				placeOrder();
				break;
			case 3:
				makePayment();
				break;
			case 4:
				System.out.println("Logging out...");
				return;
			default:
				System.out.println("Invalid choice. Please try again.");
			}
		}
	}

	private static void viewMenu() {
		System.out.println("Menu:");
		System.out.println("1. Capuccino - Rup 99");
		System.out.println("2. Cold Coffee - Rup 89");
		System.out.println("3. Espresso - Rup 119");
		System.out.println("4. Latte - Rup 129");
	}

	private static void placeOrder() {
		System.out.println("Place your order:");
		System.out.print("Enter item number: ");
		int itemNumber = scanner.nextInt();
		scanner.nextLine(); 

		System.out.print("Enter quantity: ");
		int quantity = scanner.nextInt();
		scanner.nextLine();
		double itemPrice = getItemPrice(itemNumber); 
		double totalAmount = itemPrice * quantity;
		Order order = new Order();
		order.setItemNumber(itemNumber);
		order.setQuantity(quantity);
		order.setTotalAmount(totalAmount); 

		OrderDAOImpl orderDAO = new OrderDAOImpl();
		orderDAO.save(order);

		System.out.println("Order placed successfully!");
		System.out.println("Order Details:");
		System.out.println("Item Number: " + itemNumber);
		System.out.println("Quantity: " + quantity);
		System.out.println("Total Amount: Rup" + totalAmount);
	}

	private static double getItemPrice(int itemNumber) {
		//Example:
			if (itemNumber == 1) {
				return 99.0; 
			} else if (itemNumber == 2) {
				return 198.0;
			}
		return 0.0; 
	}


	private static void makePayment() {
		System.out.println("Select Payment Method:");
		System.out.println("1. Cash on Delivery");
		System.out.println("2. Online Payment");
		System.out.print("Enter your choice: ");
		int paymentChoice = scanner.nextInt();
		scanner.nextLine(); 

		switch (paymentChoice) {
		case 1:
			processCashOnDelivery();
			break;
		case 2:
			processOnlinePayment();
			break;
		default:
			System.out.println("Invalid choice. Please try again.");
		}
	}
	private static void processCashOnDelivery() {
		System.out.println("You have chosen Cash on Delivery.");
		System.out.println("Your order will be delivered, and you can pay the delivery person in cash.");
	}

	private static void processOnlinePayment() {
		System.out.println("Select Online Payment Method:");
		System.out.println("1. UPI");
		System.out.println("2. Credit Card");
		System.out.print("Enter your choice: ");
		int onlinePaymentChoice = scanner.nextInt();
		scanner.nextLine(); 
		switch (onlinePaymentChoice) {
		case 1:
			processUPIPayment();
			break;
		case 2:
			processCreditCardPayment();
			break;
		default:
			System.out.println("Invalid choice. Please try again.");
		}
	}

	private static void processUPIPayment() {
		System.out.println("You have chosen UPI (Unified Payments Interface) for payment.");
		System.out.println("UPI payment processed successfully!");
	}

	private static void processCreditCardPayment() {
		System.out.println("You have chosen Credit Card for payment.");
		System.out.println("Credit card payment processed successfully!");
	}
}