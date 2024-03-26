package com.coffeeshoporderingsystem.entities;
	import javax.persistence.*;

	@Entity
	@Table(name = "Registration")
	public class Registration {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "Registration_id")
	    private int registrationId;

	    @Column(name = "User_name")
	    private String userName;

	    @Column(name = "User_password")
	    private String userPassword;

	    @Column(name = "User_address")
	    private String userAddress;

	    @Column(name = "User_email")
	    private String userEmail;

	    @Column(name = "User_mobileno")
	    private int userMobileNo;

	    @Column(name = "User_gender")
	    private String userGender;

	    	}
