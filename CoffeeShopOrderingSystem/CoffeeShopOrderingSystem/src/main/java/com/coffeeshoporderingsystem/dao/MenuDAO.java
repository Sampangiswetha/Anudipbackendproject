package com.coffeeshoporderingsystem.dao;

import java.util.List;

import com.coffeeshoporderingsystem.Menu;

public interface MenuDAO {
	void addMenu(Menu menu);
	com.coffeeshoporderingsystem.entities.Menu getMenuById(int itemId);
	List<com.coffeeshoporderingsystem.entities.Menu> getAllMenus();
	void updateMenu(Menu menu);
	void deleteMenu(int itemId);
	void addMenu(com.coffeeshoporderingsystem.entities.Menu menu);
}
