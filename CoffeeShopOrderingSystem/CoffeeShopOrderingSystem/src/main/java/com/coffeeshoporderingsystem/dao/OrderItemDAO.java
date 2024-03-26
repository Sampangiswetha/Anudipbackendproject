package com.coffeeshoporderingsystem.dao;

import java.util.List;

import com.coffeeshoporderingsystem.entities.OrderItem;

public interface OrderItemDAO {
	OrderItem getOrderItemById(int orderId);
	void addOrderItem(OrderItemDAO orderItem);
	void updateOrderItem(OrderItem orderItem);
	void deleteOrderItem(int orderId);
	List<OrderItem> getAllOrderItems();
}
