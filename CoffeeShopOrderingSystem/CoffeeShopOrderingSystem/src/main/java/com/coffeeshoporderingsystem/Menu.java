package com.coffeeshoporderingsystem;

//import java.util.Scanner;
import java.util.List;
import java.util.Scanner;
//import org.hibernate.SessionFactory;

import com.coffeeshoporderingsystem.dao.Coffee;
import com.coffeeshoporderingsystem.dao.CoffeeDAO;
//import com.coffeeshoporderingsystem.dao.CoffeeDAOImpl;
import com.coffeeshoporderingsystem.dao.OrderDAOImpl;
import com.coffeeshoporderingsystem.dao.PaymentDAOImpl;
import com.coffeeshoporderingsystem.entities.Order;
import com.coffeeshoporderingsystem.entities.Payment;


public class Menu {
	private static Scanner scanner1 = new Scanner(System.in);
    private static OrderDAOImpl orderDAO = new OrderDAOImpl();
    private static PaymentDAOImpl paymentDAO = new PaymentDAOImpl();
	private static Scanner scanner = new Scanner(System.in);
    //private static SessionFactory sessionFactory;
	private static void adminMenu() {
        while (true) {
            System.out.println("Admin Menu");
            System.out.println("1. Add Coffee");
            System.out.println("2. Display all Coffee details");
            System.out.println("3. View all orders");
            System.out.println("4. View all payments");
            System.out.println("5. Back to main-menu");
            System.out.print("Enter your choice: ");
            int choice = scanner1.nextInt();
            scanner1.nextLine(); // Consume newline character
            
            switch (choice) {
                case 1:
                    addCoffee();
                    break;
                case 2:
                    displayAllCoffeeDetails();
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

    private static void customerMenu() {
        while (true) {
            System.out.println("Customer Menu");
            System.out.println("1. View menu");
            System.out.println("2. Give Order");
            System.out.println("3. Payment");
            System.out.println("4. Back to main-menu");
            System.out.print("Enter your choice: ");
            int choice = scanner1.nextInt();
            scanner1.nextLine(); // Consume newline character
            
            switch (choice) {
                case 1:
                    // Code to view menu
                    break;
                case 2:
                    // Code to give order
                    break;
                case 3:
                    // Code for payment
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void addCoffee() {
        System.out.println("Enter coffee name:");
        //String name = scanner.nextLine();
        System.out.println("Enter coffee price:");
        //double price = scanner.nextDouble();
        scanner.nextLine(); // Consume newline character
        
        Coffee coffee = new Coffee();
        CoffeeDAO.save(coffee);

        System.out.println("Coffee added successfully!");
    }

    private static void displayAllCoffeeDetails() {
        List<com.coffeeshoporderingsystem.entities.Menu> coffees = CoffeeDAO.getAllOrders();
        if (coffees.isEmpty()) {
            System.out.println("No coffee available.");
        } else {
            System.out.println("All Coffee Details:");
            for (com.coffeeshoporderingsystem.entities.Menu coffee : coffees) {
                System.out.println(coffee);
            }
        }
    }

    private static void viewAllOrders() {
        List<Order> orders = orderDAO.getAllOrders();
        if (orders.isEmpty()) {
            System.out.println("No orders available.");
        } else {
            System.out.println("All Orders:");
            for (Order order : orders) {
                System.out.println(order);
            }
        }
    }

    private static void viewAllPayments() {
        List<Payment> payments = paymentDAO.getAllPayments();
        if (payments.isEmpty()) {
            System.out.println("No payments available.");
        } else {
            System.out.println("All Payments:");
            for (Payment payment : payments) {
                System.out.println(payment);
            }
        }
    }
}