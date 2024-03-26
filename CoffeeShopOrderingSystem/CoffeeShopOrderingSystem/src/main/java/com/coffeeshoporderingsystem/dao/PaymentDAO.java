package com.coffeeshoporderingsystem.dao;

import java.util.List;

import com.coffeeshoporderingsystem.entities.Payment;

public interface PaymentDAO {
	Payment getPaymentById(int paymentId);
	void addPayment(Payment payment);
	void updatePayment(Payment payment);
	void deletePayment(int paymentId);
	List<Payment> getAllPayments();
}
