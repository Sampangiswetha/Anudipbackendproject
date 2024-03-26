package com.coffeeshoporderingsystem.dao;
import java.util.ArrayList;
import java.util.List;

import com.coffeeshoporderingsystem.entities.Admin;

public interface AdminDAO {
	Admin getAdminById(int adminId);
	void addAdmin(Admin admin);
	void updateAdmin(Admin admin);
	void deleteAdmin(int adminId);
	List<Admin> getAllAdmins();
	void save(Admin admin);
	Admin findByUsername(String username);
	 public void save(Coffee coffee) ;
	 static void displayAllCoffeeDetails() {
	        System.out.println("Displaying all Coffee details");
}
	static void getAllCoffees() {
		
	}
}
