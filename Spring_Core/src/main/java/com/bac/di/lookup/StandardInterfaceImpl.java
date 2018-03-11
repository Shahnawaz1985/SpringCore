package com.bac.di.lookup;

public class StandardInterfaceImpl implements TestInterface{
	
	private MyHelper myHelper;
	
	public void setMyHelper(MyHelper myHelper) {
		this.myHelper = myHelper;
	}

	@Override
	public MyHelper getMyHelper() {
		return this.myHelper;
	}

	@Override
	public void someOperation() {
		myHelper.doSomethingUseful();
	}

}
