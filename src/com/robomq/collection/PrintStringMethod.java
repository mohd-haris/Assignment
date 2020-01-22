package com.robomq.collection;

public class PrintStringMethod implements Runnable{

	Thread thread;
	String str1,str2;
	
	PrintStringMethod(String str1, String str2){
		this.str1=str1;
		this.str2=str2;
	}
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}
