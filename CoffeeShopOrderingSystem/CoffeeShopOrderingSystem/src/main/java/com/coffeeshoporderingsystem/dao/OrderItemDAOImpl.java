package com.coffeeshoporderingsystem.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import com.coffeeshoporderingsystem.entities.OrderItem;

@Transactional
public class OrderItemDAOImpl implements OrderItemDAO {
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public OrderItem getOrderItemById(int orderId) {
		return entityManager.find(OrderItem.class, orderId);
	}

	public void addOrderItem(OrderItem orderItem) {
		entityManager.persist(orderItem);
	}

	public void updateOrderItem1(OrderItem orderItem) {
		entityManager.merge(orderItem);
	}

	@Override
	public void deleteOrderItem(int orderId) {
		OrderItem orderItem = entityManager.find(OrderItem.class, orderId);
		if (orderItem != null) {
			entityManager.remove(orderItem);
		}
	}

	@Override
	public List<OrderItem> getAllOrderItems() {
		return entityManager.createQuery("SELECT oi FROM OrderItem oi", OrderItem.class).getResultList();
	}

	@Override
	public void addOrderItem(OrderItemDAO orderItem) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateOrderItem(OrderItem orderItem) {
		// TODO Auto-generated method stub

	}
}
