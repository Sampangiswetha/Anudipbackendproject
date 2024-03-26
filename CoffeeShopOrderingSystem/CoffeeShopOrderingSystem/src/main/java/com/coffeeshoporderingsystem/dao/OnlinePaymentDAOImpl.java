package com.coffeeshoporderingsystem.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import com.coffeeshoporderingsystem.entities.OnlinePayment;

@Transactional
public class OnlinePaymentDAOImpl implements OnlinePaymentDAO {
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public OnlinePayment getOnlinePaymentById(int onlineId) {
		return entityManager.find(OnlinePayment.class, onlineId);
	}

	public void addOnlinePayment1(OnlinePayment onlinePayment) {
		entityManager.persist(onlinePayment);
	}

	public void updateOnlinePayment1(OnlinePayment onlinePayment) {
		entityManager.merge(onlinePayment);
	}

	@Override
	public void deleteOnlinePayment(int onlineId) {
		OnlinePayment onlinePayment = entityManager.find(OnlinePayment.class, onlineId);
		if (onlinePayment != null) {
			entityManager.remove(onlinePayment);
		}
	}

	@Override
	public List<OnlinePayment> getAllOnlinePayments() {
		return entityManager.createQuery("SELECT o FROM OnlinePayment o", OnlinePayment.class).getResultList();
	}

	@Override
	public void addOnlinePayment(OnlinePayment onlinePayment) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateOnlinePayment(OnlinePayment onlinePayment) {
		// TODO Auto-generated method stub

	}
}
