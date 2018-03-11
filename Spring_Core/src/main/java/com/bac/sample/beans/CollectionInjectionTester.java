package com.bac.sample.beans;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class CollectionInjectionTester {
	private Map<String, Object> mapCollection;
	private Properties property;
	private Set<Object> setcollection;
	private List<Object> listcollection;
	public Map<String, Object> getMapCollection() {
		return mapCollection;
	}
	public void setMapCollection(Map<String, Object> mapCollection) {
		this.mapCollection = mapCollection;
	}
	public Properties getProperty() {
		return property;
	}
	public void setProperty(Properties property) {
		this.property = property;
	}
	public Set<Object> getSetcollection() {
		return setcollection;
	}
	public void setSetcollection(Set<Object> setcollection) {
		this.setcollection = setcollection;
	}
	public List<Object> getListcollection() {
		return listcollection;
	}
	public void setListcollection(List<Object> listcollection) {
		this.listcollection = listcollection;
	}
	
	public void displayInfo(){
		System.out.println("Map Contents:\n");
		
		for(Map.Entry<String, Object> map:mapCollection.entrySet()) {
			System.out.println("Key: "+map.getKey()+" - Value: "+map.getValue());
		}
		
		System.out.println("\nProperties Contents:\n");
		for(Map.Entry<Object, Object> props:property.entrySet()) {
			System.out.println("Key: "+props.getKey()+" - Value: "+props.getValue());
		}
		
		System.out.println("\nSet Content\n");
		for(Object obj:setcollection) {
			System.out.println("Value: "+obj);
		}
		
		System.out.println("\nList Collection\n");
		for(Object list:listcollection) {
			System.out.println("Value: "+list);
		}
	}

}
