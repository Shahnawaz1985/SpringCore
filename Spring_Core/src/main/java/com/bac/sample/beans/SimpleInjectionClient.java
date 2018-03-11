package com.bac.sample.beans;

import org.springframework.context.support.GenericXmlApplicationContext;

public class SimpleInjectionClient {
	
	public static void main(String[] args) {
		GenericXmlApplicationContext context = new GenericXmlApplicationContext();
		context.load("sample_application_context.xml");
		context.refresh();
		
		SimpleInjection injection = context.getBean("simpleInjection", SimpleInjection.class);
		System.out.println(injection);		
		InjectSimpleConfig injectConfig = context.getBean("simpleInjectionConfig", InjectSimpleConfig.class);
		System.out.println(injectConfig);	
		
		CollectionInjectionTester collectionTest = context.getBean("collectionInjectionTester", CollectionInjectionTester.class);
		collectionTest.displayInfo();		
		context.close();
	}

}
