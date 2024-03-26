package com.coffeeshoporderingsystem.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

import com.coffeeshoporderingsystem.entities.Menu;

public abstract class MenuDAOImpl implements MenuDAO {
	private final EntityManager entityManager;

	public MenuDAOImpl(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	public void addMenus(Menu menu) {
		EntityTransaction transaction = entityManager.getTransaction();
		try {
			transaction.begin();
			entityManager.persist(menu);
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null && transaction.isActive()) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
	}

	public Menu getMenuById(int itemId) {
		return entityManager.find(Menu.class, itemId);
	}

	public List<Menu> getAllMenus() {
		TypedQuery<Menu> query = entityManager.createQuery("SELECT m FROM Menu m", Menu.class);
		return query.getResultList();
	}

	public void updateMenu(Menu menu) {
		EntityTransaction transaction = entityManager.getTransaction();
		try {
			transaction.begin();
			entityManager.merge(menu);
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null && transaction.isActive()) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
	}

	public void deleteMenu(int itemId) {
		EntityTransaction transaction = entityManager.getTransaction();
		try {
			transaction.begin();
			Menu menu = entityManager.find(Menu.class, itemId);
			if (menu != null) {
				entityManager.remove(menu);
			}
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null && transaction.isActive()) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
	}

	@Override
	public void addMenu(Menu menu) {
		// TODO Auto-generated method stub
		
	}
}
