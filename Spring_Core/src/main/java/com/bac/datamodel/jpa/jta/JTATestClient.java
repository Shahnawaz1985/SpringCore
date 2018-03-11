package com.bac.datamodel.jpa.jta;

import org.springframework.context.support.GenericXmlApplicationContext;

public class JTATestClient {
	
	public static void main(String[] args) {		
		GenericXmlApplicationContext context = new GenericXmlApplicationContext();
		context.load("spring_tx/jta_transaction_config.xml");
		context.refresh();
		
		ContactService contactService = context.getBean("contactService", ContactService.class);
		
		Contact contact = new Contact();
		contact.setId(4l);
		contact.setFirstName("JTA");
		contact.setLastName("MANAGER12");
		contactService.save(contact);
		System.out.println("Contact saved successfully");
		System.out.println("id : "+contact.getId());
		
		context.close();
	}

}
