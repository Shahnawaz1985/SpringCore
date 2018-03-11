package com.bac.di.replacer;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

public class MessageReplacer implements MethodReplacer{

	@Override
	public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
		if(isFormatMessageMethod(method)) {
			//String message = (String)args[0];
			//return "<h2>"+message+"</h2>";
			return getNewMessage();
		}else {
			throw new IllegalArgumentException("Unable to reimplement method "+method.getName());
		}		
	}

	private boolean isFormatMessageMethod(Method method) {
		if(method.getParameterTypes().length != 1) {
			return false;
		}
		if(!("formatMessage".equals(method.getName()))){
			return false;
		}
		if(method.getReturnType()!=String.class) {
			return false;
		}
		if(method.getParameterTypes()[0]!=String.class) {
			return false;
		}
		return true;
	}
	
	private String getNewMessage() {
		return "##Hello##";
	}

}
