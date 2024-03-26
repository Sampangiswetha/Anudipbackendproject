package com.coffeeshoporderingsystem.dao;

import java.util.List;

import com.coffeeshoporderingsystem.entities.CashOnDelivery;

public interface CashOnDeliveryDAO {
	CashOnDelivery getCashOnDeliveryById(int codId);
	void addCashOnDelivery(CashOnDelivery cashOnDelivery);
	void updateCashOnDelivery(CashOnDelivery cashOnDelivery);
	void deleteCashOnDelivery(int codId);
	List<CashOnDelivery> getAllCashOnDeliveries();
}

