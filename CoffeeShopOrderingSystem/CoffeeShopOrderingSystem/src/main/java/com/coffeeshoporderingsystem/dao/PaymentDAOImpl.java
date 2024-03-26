package com.coffeeshoporderingsystem.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import com.coffeeshoporderingsystem.entities.Payment;

@Transactional
public class PaymentDAOImpl implements PaymentDAO {
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public Payment getPaymentById(int paymentId) {
		return entityManager.find(Payment.class, paymentId);
	}

	public void addPayment1(Payment payment) {
		entityManager.persist(payment);
	}

	public void updatePayment1(Payment payment) {
		entityManager.merge(payment);
	}

	@Override
	public void deletePayment(int paymentId) {
		Payment payment = entityManager.find(Payment.class, paymentId);
		if (payment != null) {
			entityManager.remove(payment);
		}
	}

	@Override
	public List<Payment> getAllPayments() {
		return entityManager.createQuery("SELECT p FROM Payment p", Payment.class).getResultList();
	}

	@Override
	public void addPayment(Payment payment) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updatePayment(Payment payment) {
		// TODO Auto-generated method stub

	}
}
