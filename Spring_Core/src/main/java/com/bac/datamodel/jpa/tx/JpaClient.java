package com.bac.datamodel.jpa.tx;

import org.springframework.context.support.GenericXmlApplicationContext;

public class JpaClient {
	
	public static void main(String[] args) {
		GenericXmlApplicationContext context = new GenericXmlApplicationContext();
		context.load("spring_tx/annotation_transaction_config.xml");
		context.refresh();
		
		ContactService contactService = context.getBean("contactService", ContactService.class);
		long contactCount = contactService.countAll();
		System.out.println(contactCount);
		context.close();
	}

}
