package com.bac.di.replacer;

import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.util.StopWatch;

public class ReplacerTest {
	
	public static void main(String[] args) {
		GenericXmlApplicationContext context = new GenericXmlApplicationContext();
		context.load("sample_application_context.xml");
		context.refresh();
		
		ReplacementTarget test1 = (ReplacementTarget)context.getBean("replacementTarget");
		ReplacementTarget test2 = (ReplacementTarget)context.getBean("standardTarget");
		displayInfo(test1);
		displayInfo(test2);
		
		context.close();
	}
	
	private static void displayInfo(ReplacementTarget target) {
		System.out.println(target.formatMessage("Hello Method Replacer Test"));
		StopWatch stpWtch = new StopWatch();
		stpWtch.start("perfTest");
		
		for(int x=0; x<100000; x++) {
			target.formatMessage("hello");
		}
		
		stpWtch.stop();
		System.out.println("100000 gets took "+stpWtch.getTotalTimeMillis()+"ms");
	}

}
