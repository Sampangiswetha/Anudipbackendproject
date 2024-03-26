package com.coffeeshoporderingsystem.dao;


import com.coffeeshoporderingsystem.Menu;
import com.coffeeshoporderingsystem.entities.dao;

	import java.util.List;
import java.util.SequencedCollection;

import com.coffeeshoporderingsystem.entities.Coffee;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public interface CoffeeDAO {

    public static void main(String[] args) {
        // Your main method code here
    }

	List<Menu> getAllOrders = null;

	List<Menu> getAllCoffee();

	static void save(CoffeeDAOImpl coffee) {
		// TODO Auto-generated method stub
		
	}

	List<Menu> getAllCoffee1();

	static List<Menu> getAllCoffee11() {
		return null;
	}

	static List<com.coffeeshoporderingsystem.entities.Menu> getAllOrders() {
		// TODO Auto-generated method stub
		return null;
	}
	static List<com.coffeeshoporderingsystem.dao.Coffee> getAllOrder() {
		// TODO Auto-generated method stub
		return null;
	}
	void saveCoffee(com.coffeeshoporderingsystem.dao.Coffee coffee);
	static void save(com.coffeeshoporderingsystem.dao.Coffee coffee) {
		// TODO Auto-generated method stub
		
	}
	void save1(com.coffeeshoporderingsystem.entities.Coffee coffee);
	List<com.coffeeshoporderingsystem.entities.Coffee> getAllCoffees1();
	static List<com.coffeeshoporderingsystem.dao.Coffee> getAllCoffees() {
		// TODO Auto-generated method stub
		return null;
	}

	public static boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

}
