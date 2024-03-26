package com.coffeeshoporderingsystem.dao;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import com.coffeeshoporderingsystem.entities.Customer;

@Transactional
public class CustomerDAOImpl implements CustomerDAO {
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public Customer getCustomerById(int customerId) {
		return entityManager.find(Customer.class, customerId);
	}

	public void addCustomer1(Customer customer) {
		entityManager.persist(customer);
	}

	public void updateCustomer1(Customer customer) {
		entityManager.merge(customer);
	}

	@Override
	public void deleteCustomer(int customerId) {
		Customer customer = entityManager.find(Customer.class, customerId);
		if (customer != null) {
			entityManager.remove(customer);
		}
	}

	@Override
	public List<Customer> getAllCustomers() {
		return entityManager.createQuery("SELECT c FROM Customer c", Customer.class).getResultList();
	}

	@Override
	public void addCustomer(Customer customer) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateCustomer(Customer customer) {
		// TODO Auto-generated method stub

	}

	@Override
	public void save(Customer customer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Customer findByUsername(String username) {
		// TODO Auto-generated method stub
		return null;
	}
}
