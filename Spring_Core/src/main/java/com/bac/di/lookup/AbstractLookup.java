package com.bac.di.lookup;

public abstract class AbstractLookup implements TestInterface{
	
	public abstract MyHelper getMyHelper();
	
	public void someOperation(){
		getMyHelper().doSomethingUseful();
	}

}
