package com.coffeeshoporderingsystem.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import com.coffeeshoporderingsystem.entities.Login;

@Transactional
public abstract class LoginDAOImpl implements LoginDAO {
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public Login getLoginById(int loginId) {
		return entityManager.find(Login.class, loginId);
	}

	@Override
	public void addLogin(Login login) {
		entityManager.persist(login);
	}

	@Override
	public void updateLogin(Login login) {
		entityManager.merge(login);
	}

	@Override
	public void deleteLogin(int loginId) {
		Login login = entityManager.find(Login.class, loginId);
		if (login != null) {
			entityManager.remove(login);
		}
	}

	@Override
	public List<Login> getAllLogins() {
		return entityManager.createQuery("SELECT l FROM Login l", Login.class).getResultList();
	}
}
