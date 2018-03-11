package com.bac.datamodel.jpa.tx;

import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service("contactService")
@Repository
@Transactional
public class ContactServiceImpl implements ContactService, InitializingBean {
	
	Logger LOGGER = Logger.getLogger(ContactServiceImpl.class);
	
	@Resource
	private ContactRepository contactRepository;
	
	public ContactServiceImpl() {
		
	}

	@Override
	@Transactional(readOnly = true)
	public List<Contact> findAll() {
		return (List<Contact>) contactRepository.findAll();
	}

	@Override
	public Contact findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED)
	public Contact save(Contact contact) {
		return contactRepository.saveAndFlush(contact);
	}

	@Override
	@Transactional(propagation = Propagation.NEVER)
	public long countAll() {
		return contactRepository.count();
	}
	
	@Override
	@Transactional(readOnly = true)
	public Contact search(String lastName, String firstName) {
		return contactRepository.findByLastNameAndFirstName(lastName, firstName);
	}
	
	@Override
	public void afterPropertiesSet() throws Exception {
		if(null == contactRepository)
			throw new NoSuchBeanDefinitionException(ContactRepository.class);
	}

	

}
