package com.coffeeshoporderingsystem.dao;

import java.util.List;

import com.coffeeshoporderingsystem.entities.Login;

public interface LoginDAO {
	Login getLoginById(int loginId);
	void addLogin(Login login);
	void updateLogin(Login login);
	void deleteLogin(int loginId);
	List<Login> getAllLogins();
}
