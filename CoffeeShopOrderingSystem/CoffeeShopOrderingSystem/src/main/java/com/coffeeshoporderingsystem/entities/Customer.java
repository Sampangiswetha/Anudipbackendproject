package com.coffeeshoporderingsystem.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Customer")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "C_id")
	private int customerId;

	@OneToOne
	@JoinColumn(name = "Registration_id", referencedColumnName = "Registration_id")
	private Registration registration;

	public Customer(String username, String password) {
		// TODO Auto-generated constructor stub
	}

	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Object getPassword() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setName(String string) {
		// TODO Auto-generated method stub
		
	}

	public void setEmail(String string) {
		// TODO Auto-generated method stub
		
	}

	public void setId(int i) {
		// TODO Auto-generated method stub
		
	}
}
