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
@Table(name = "Cash_On_Delivery")
public class CashOnDelivery {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "COD_Id")
	private int codId;

	@Column(name = "Address")
	private String address;

	@Column(name = "Payment")
	private int payment;

	@Column(name = "Mob_No")
	private int mobileNo;

	@OneToOne
	@JoinColumn(name = "Payment_Id", referencedColumnName = "Payment_Id")
	private Payment paymentInfo;

}