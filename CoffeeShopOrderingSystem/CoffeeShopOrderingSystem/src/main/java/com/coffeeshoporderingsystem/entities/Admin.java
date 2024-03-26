package com.coffeeshoporderingsystem.entities;
	import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.coffeeshoporderingsystem.dao.AdminDAO;
import com.coffeeshoporderingsystem.dao.Coffee;

	@Entity
	@Table(name = "Admin")
	public class Admin implements AdminDAO {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "Admin_id")
	    private int adminId;

	    @OneToOne
	    @JoinColumn(name = "Registration_id", referencedColumnName = "Registration_id")
	    private Registration registration;

		public Admin(String username, String password, String email) {
			// TODO Auto-generated constructor stub
		}

		public Admin(String username, String password) {
			// TODO Auto-generated constructor stub
		}

		public void setUsername(String username) {
			// TODO Auto-generated method stub
			
		}

		public void setPassword(String password) {
			// TODO Auto-generated method stub
			
		}

		public Object getPassword() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Admin getAdminById(int adminId) {
			// TODO Auto-generated method stub
			return null;
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
		public void deleteAdmin(int adminId) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public List<Admin> getAllAdmins() {
			// TODO Auto-generated method stub
			return null;
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
