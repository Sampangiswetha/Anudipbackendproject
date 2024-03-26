package com.coffeeshoporderingsystem.dao;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import com.coffeeshoporderingsystem.entities.Registration;

@Transactional
public abstract class RegistrationDAOImpl implements RegistrationDAO {
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public Registration getRegistrationById(int registrationId) {
		return entityManager.find(Registration.class, registrationId);
	}

	@Override
	public void addRegistration(Registration registration) {
		entityManager.persist(registration);
	}

	@Override
	public void updateRegistration(Registration registration) {
		entityManager.merge(registration);
	}

	@Override
	public void deleteRegistration(int registrationId) {
		Registration registration = entityManager.find(Registration.class, registrationId);
		if (registration != null) {
			entityManager.remove(registration);
		}
	}

	@Override
	public List<Registration> getAllRegistrations() {
		return entityManager.createQuery("SELECT r FROM Registration r", Registration.class).getResultList();
	}
}
