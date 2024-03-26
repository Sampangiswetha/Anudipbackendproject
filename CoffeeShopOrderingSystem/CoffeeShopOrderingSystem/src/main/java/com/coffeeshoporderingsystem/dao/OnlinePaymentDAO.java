package com.coffeeshoporderingsystem.dao;

import java.util.List;

import com.coffeeshoporderingsystem.entities.OnlinePayment;

public interface OnlinePaymentDAO {
	OnlinePayment getOnlinePaymentById(int onlineId);
	void addOnlinePayment(OnlinePayment onlinePayment);
	void updateOnlinePayment(OnlinePayment onlinePayment);
	void deleteOnlinePayment(int onlineId);
	List<OnlinePayment> getAllOnlinePayments();
}

