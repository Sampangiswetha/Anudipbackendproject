package com.coffeeshoporderingsystem.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import com.coffeeshoporderingsystem.entities.CashOnDelivery;

@Transactional
public class CashOnDeliveryDAOImpl implements CashOnDeliveryDAO {
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public CashOnDelivery getCashOnDeliveryById(int codId) {
		return entityManager.find(CashOnDelivery.class, codId);
	}

	public void addCashOnDelivery1(CashOnDelivery cashOnDelivery) {
		entityManager.persist(cashOnDelivery);
	}

	public void updateCashOnDelivery1(CashOnDelivery cashOnDelivery) {
		entityManager.merge(cashOnDelivery);
	}

	@Override
	public void deleteCashOnDelivery(int codId) {
		CashOnDelivery cashOnDelivery = entityManager.find(CashOnDelivery.class, codId);
		if (cashOnDelivery != null) {
			entityManager.remove(cashOnDelivery);
		}
	}

	@Override
	public List<CashOnDelivery> getAllCashOnDeliveries() {
		return entityManager.createQuery("SELECT c FROM CashOnDelivery c", CashOnDelivery.class).getResultList();
	}

	@Override
	public void addCashOnDelivery(CashOnDelivery cashOnDelivery) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateCashOnDelivery(CashOnDelivery cashOnDelivery) {
		// TODO Auto-generated method stub

	}
}
