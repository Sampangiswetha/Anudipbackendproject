package com.coffeeshoporderingsystem.dao;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.coffeeshoporderingsystem.Menu;
public class CoffeeDAOImpl implements CoffeeDAO {

    public List<Coffee> getAllCoffees() {
        List<Coffee> coffees = new ArrayList<>();
		return coffees;
	
	}

	public List<com.coffeeshoporderingsystem.entities.Coffee> getAllCoffees1() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Menu> getAllCoffee() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Menu> getAllCoffee1() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Menu> getAllCoffee11() {
		// TODO Auto-generated method stub
		return null;
	}

	public void saveCoffee(Coffee coffee) {
		// TODO Auto-generated method stub
		
	}

	public void save1(com.coffeeshoporderingsystem.entities.Coffee coffee) {
		// TODO Auto-generated method stub
		
	}

	public List<com.coffeeshoporderingsystem.entities.Coffee> getAllCoffees11() {
		// TODO Auto-generated method stub
		return null;
	}
	public List<com.coffeeshoporderingsystem.entities.Coffee> findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}
	public List<com.coffeeshoporderingsystem.entities.Coffee> findByPriceLessThan(double price) {
		// TODO Auto-generated method stub
		return null;
	}
}
