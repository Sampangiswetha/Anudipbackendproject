package com.coffeeshoporderingsystem.dao;
import java.util.List;

import com.coffeeshoporderingsystem.entities.Registration;

public interface RegistrationDAO {
	Registration getRegistrationById(int registrationId);
	void addRegistration(Registration registration);
	void updateRegistration(Registration registration);
	void deleteRegistration(int registrationId);
	List<Registration> getAllRegistrations();
}

