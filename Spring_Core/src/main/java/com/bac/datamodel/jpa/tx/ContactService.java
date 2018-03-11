package com.bac.datamodel.jpa.tx;

import java.util.List;

public interface ContactService {
	
	List<Contact> findAll();

	Contact findById(Long id);

	Contact save(Contact contact);

	long countAll();
	
	Contact search(String lastName, String firstName);
}
