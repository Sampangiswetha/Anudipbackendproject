package com.coffeeshoporderingsystem.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.coffeeshoporderingsystem.entities.Admin;

@Transactional
public class AdminDAOImpl implements AdminDAO {
	@PersistenceContext
	private EntityManager entityManager;
	public class NestedAdminDAOImpl implements GenericDAO<Admin, Long> {
	    private SessionFactory sessionFactory;

	    public void AdminDAOImpl(SessionFactory sessionFactory) {
	        this.sessionFactory = sessionFactory;
	    }

	    @Override
	    public Admin getById(Long id) {
	        try (Session session = sessionFactory.openSession()) {
	            return session.get(Admin.class, id);
	        }
	    }

	    @Override
	    public List<Admin> getAll() {
	        try (Session session = sessionFactory.openSession()) {
	            return session.createQuery("FROM Admin", Admin.class).list();
	        }
	    }

	    @Override
	    public void save(Admin admin) {
	        try (Session session = sessionFactory.openSession()) {
	            Transaction tx = session.beginTransaction();
	            session.save(admin);
	            tx.commit();
	        }
	    }

	    @Override
	    public void update(Admin admin) {
	        try (Session session = sessionFactory.openSession()) {
	            Transaction tx = session.beginTransaction();
	            session.update(admin);
	            tx.commit();
	        }
	    }

	    @Override
	    public void delete(Admin admin) {
	        try (Session session = sessionFactory.openSession()) {
	            Transaction tx = session.beginTransaction();
	            session.delete(admin);
	            tx.commit();
	        }
	    }
	}
	@Override
	public Admin getAdminById(int adminId) {
		return entityManager.find(Admin.class, adminId);
	}

	public void addAdmin1(Admin admin) {
		entityManager.persist(admin);
	}

	public void updateAdmin1(Admin admin) {
		entityManager.merge(admin);
	}

	@Override
	public void deleteAdmin(int adminId) {
		Admin admin = entityManager.find(Admin.class, adminId);
		if (admin != null) {
			entityManager.remove(admin);
		}
	}

	@Override
	public List<Admin> getAllAdmins() {
		return entityManager.createQuery("SELECT a FROM Admin a", Admin.class).getResultList();
	}

	@Override
	public void addAdmin(Admin admin) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateAdmin(Admin admin) {
		// TODO Auto-generated method stub

	}

	@Override
	public void save(Admin admin) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Admin findByUsername(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Coffee coffee) {
		// TODO Auto-generated method stub
		
	}
}
