package com.bac.datamodel.jpa.jta;

import java.util.List;

public interface ContactService {
	List<Contact> findAll();
	Contact findById(Long id);
	Contact save(Contact contact);
	long countAll();
}
