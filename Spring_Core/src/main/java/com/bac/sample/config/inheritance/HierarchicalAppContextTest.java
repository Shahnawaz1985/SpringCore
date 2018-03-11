package com.bac.sample.config.inheritance;

import org.springframework.context.support.GenericXmlApplicationContext;

public class HierarchicalAppContextTest {
	
	public static void main(String[] args) {		
		GenericXmlApplicationContext parent = new GenericXmlApplicationContext();
		parent.load("parent.xml");
		parent.refresh();
		
		GenericXmlApplicationContext child = new GenericXmlApplicationContext();
		child.load("child.xml");
		child.setParent(parent);
		child.refresh();
		
		SimpleTarget bean1 = child.getBean("sampleTaret1", SimpleTarget.class);
		SimpleTarget bean2 = child.getBean("sampleTaret2", SimpleTarget.class);
		SimpleTarget bean3 = child.getBean("sampleTaret3", SimpleTarget.class);
		
		System.out.println(bean1.getName());
		System.out.println(bean2.getName());
		System.out.println(bean3.getName());
		
		child.close();
		parent.close();		
	}
}