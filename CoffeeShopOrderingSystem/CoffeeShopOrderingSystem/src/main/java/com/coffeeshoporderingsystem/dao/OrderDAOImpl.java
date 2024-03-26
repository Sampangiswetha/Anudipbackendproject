package com.coffeeshoporderingsystem.dao;

import java.util.Collections;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import com.coffeeshoporderingsystem.entities.Order;

@Transactional
public class OrderDAOImpl implements OrderDAO {
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public Order getOrderById(int orderId) {
		return entityManager.find(Order.class, orderId);
	}
	public void addOrder1(Order order) {
		entityManager.persist(order);
	}

	public void updateOrder1(Order order) {
		entityManager.merge(order);
	}
	public List<Order> getAllOrders() {
        // Code to retrieve orders from the database
        // If no orders are found, return an empty list
        List<Order> orders  /* Your code to retrieve orders */ = null;
        if (orders == null) {
            return Collections.emptyList();
        } else {
    }
		return orders;
	}

    // Other methods of the OrderDAO interface
	@Override
	public void addOrder(Order order) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateOrder(Order order) {
		// TODO Auto-generated method stub

	}
	public void save(Order order) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void deleteOrder(int orderId) {
		// TODO Auto-generated method stub
		
	}
}
