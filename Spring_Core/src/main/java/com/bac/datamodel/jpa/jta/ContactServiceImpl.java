package com.bac.datamodel.jpa.jta;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("contactService")
@Repository
@Transactional
public class ContactServiceImpl implements ContactService {
	@PersistenceContext(unitName ="emfA")
	private EntityManager emA;
	
	@PersistenceContext(unitName ="emfB")
	private EntityManager emB;

	@Override
	@Transactional(readOnly=true)
	public List<Contact> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional(readOnly=true)
	public Contact findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@SuppressWarnings("deprecation")
	@Override
	public Contact save(Contact contact) {
		Contact contactB = new Contact();
		contactB.setFirstName(contact.getFirstName());
		contactB.setLastName(contact.getLastName());
		if(contact.getId() == null) {			
			emA.persist(contact);
			emB.persist(contactB);
			emB.flush();
			//throw new JpaSystemException(new PersistenceException());
		}else {
			emA.merge(contact);
			emB.merge(contact);
		}
		return contact;
	}

	@Override
	public long countAll() {
		// TODO Auto-generated method stub
		return 0;
	}

}
