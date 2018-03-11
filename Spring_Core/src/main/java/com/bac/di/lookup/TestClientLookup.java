package com.bac.di.lookup;


import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.util.StopWatch;

public class TestClientLookup {
	public static void main(String[] args) {
		GenericXmlApplicationContext context = new GenericXmlApplicationContext();
		context.load("sample_application_context.xml");
		context.refresh();
		
		TestInterface test1 = (TestInterface)context.getBean("abstractLookup");
		TestInterface test2 = (TestInterface)context.getBean("standardLookup");
		displayInfo(test1);
		displayInfo(test2);
		
		context.close();
	}
	
	private static void displayInfo(TestInterface intrf) {
		MyHelper helper1 = intrf.getMyHelper();
		MyHelper helper2 = intrf.getMyHelper();
		
		System.out.println("Helper instances are the same?: "
				+(helper1 == helper2));
		StopWatch stpWtch = new StopWatch();
		stpWtch.start("lookupDemo");
		
		for(int x=0; x<100000; x++) {
			MyHelper helper = intrf.getMyHelper();
			helper.doSomethingUseful();
		}
		
		stpWtch.stop();
		System.out.println("100000 gets took "+stpWtch.getTotalTimeMillis());
	}

}
