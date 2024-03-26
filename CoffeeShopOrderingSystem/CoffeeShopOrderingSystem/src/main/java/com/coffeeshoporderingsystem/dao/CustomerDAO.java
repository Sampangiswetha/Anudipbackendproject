package com.coffeeshoporderingsystem.dao;
import java.util.List;

import com.coffeeshoporderingsystem.entities.Customer;


public interface CustomerDAO {
	Customer getCustomerById(int customerId);
	void addCustomer(Customer customer);
	void updateCustomer(Customer customer);
	void deleteCustomer(int customerId);
	List<Customer> getAllCustomers();
	void save(Customer customer);
	Customer findByUsername(String username);
}

