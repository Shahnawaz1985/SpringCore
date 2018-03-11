package com.bac.datamodel.jpa.tx;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact, Long>, ContactService {

	Contact findByLastNameAndFirstName(String lastName, String firstName);
	
}
