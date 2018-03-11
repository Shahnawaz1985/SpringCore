package com.bac.di.replacer;

public class ReplacementTarget {
	
	public String formatMessage(String message) {
		return "<h1>"+message+"</h1>";
	}
	
	public String formatMessage(Object msg) {
		return "<h1>"+msg+"</h1>";
	}

}
