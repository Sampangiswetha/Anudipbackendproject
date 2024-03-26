package com.coffeeshoporderingsystem.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "`Payments`")
public class Payment {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Payment_Id")
	private int paymentId;
	    private int id;
	    private double amount;
	    private String paymentMethod;
	    private Order order1; // Reference to the associated order

	    // Constructor
	    public Payment(int id, double amount, String paymentMethod, Order order) {
	        this.id = id;
	        this.amount = amount;
	        this.paymentMethod = paymentMethod;
	        this.order1 = order;
	    }


	public Payment() {
			// TODO Auto-generated constructor stub
		}


	@ManyToOne
	@JoinColumn(name = "Order_Id", referencedColumnName = "Order_Id")
	private Order order;

	@Column(name = "Payment_date")
	private int paymentDate;
	private List<Payment> payments;

	public static List<Payment> getAllPayments() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setId(int i) {
		// TODO Auto-generated method stub
		
	}

	public void setAmount(double d) {
		// TODO Auto-generated method stub
		
	}

	public void setPaymentMethod(String string) {
		// TODO Auto-generated method stub
		
	}

	public String getId() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getAmount() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getPaymentMethod() {
		// TODO Auto-generated method stub
		return null;
	}
	 public List<Payment> getPayments() {
	        return getAllPayments();
	    }

	    public void setPayments(List<Payment> payments) {
	        this.payments = payments;
	    }

		public void setStatus(String string) {
			// TODO Auto-generated method stub
			
		}

		public void setOrder(Order order2) {
			// TODO Auto-generated method stub
			
		}


		public Object getType() {
			// TODO Auto-generated method stub
			return null;
		}


		public void setType(String string) {
			// TODO Auto-generated method stub
			
		}

	    // Other methods
	}

