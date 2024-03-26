package com.coffeeshoporderingsystem.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.coffeeshoporderingsystem.dao.Coffee;

@Entity
@Table(name = "`Order`")
public class Order {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Order_Id")
	private int orderId;
	    private int id;
	    private String customerName;
	    private double totalAmount;
	        private List<Payment> payments; // Initialize the payments list

	        // Constructor
	        public Order() {
	            this.payments = new ArrayList<>(); // Initialize the payments list in the constructor
	        }

	        // Getters and setters

	        public int getId() {
	            return id;
	        }

	        public void setId(int id) {
	            this.id = id;
	        }

	        public String getCustomerName() {
	            return customerName;
	        }

	        public void setCustomerName(String customerName) {
	            this.customerName = customerName;
	        }

	        public List<Payment> getPayments() {
	            return payments;
	        }

	        public void setPayments(List<Payment> payments) {
	            this.payments = payments;
	        }

	        // Method to add a payment to the order
	        public void addPayment(Payment payment) {
	            this.payments.add(payment);
	        }
	    // Constructor, getters, setters, and other methods

	    @Override
	    public String toString() {
	        return "Order ID: " + id + ", Customer Name: " + customerName + ", Total Amount: $" + totalAmount;
	    }

	public static List<Order> getAllOrders() {
		return null;
		// TODO Auto-generated method stub
	}

	public String getTotalAmount() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setTotalAmount(double d) {
		// TODO Auto-generated method stub
		
	}

	public void setCoffeeDetails(String string) {
		// TODO Auto-generated method stub
		
	}

	public String getCoffeeDetails() {
		// TODO Auto-generated method stub
		return null;
	}

	public Coffee getCustomer() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setCustomer(Customer customer) {
		// TODO Auto-generated method stub
		
	}

	public void setStatus(String string) {
		// TODO Auto-generated method stub
		
	}


	public void setItemNumber(int itemNumber) {
		// TODO Auto-generated method stub
		
	}

	public void setQuantity(int quantity) {
		// TODO Auto-generated method stub
		
	}
}
