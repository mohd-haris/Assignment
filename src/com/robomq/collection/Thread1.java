package com.robomq.collection;

public class Thread1 extends Thread{
	
	public Thread1(String name)
	{
		super(name);
		
	}
	
	public void run() 
	{
	System.out.println("run() method of the "+this.getName()+" thread is called");	
		for(int i=0;i<10;i++) {
			System.out.println(getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread1 t1=new Thread1("Mythread 1");
		t1.start();
		Thread1 t2=new Thread1("Mythread 2");
		t2.start();

	}

}
