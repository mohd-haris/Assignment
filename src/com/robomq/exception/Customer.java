package com.robomq.exception;

public class Customer {
	private String name;
	private int age;
	private String phoneNumber;

	public Customer(String name,int age,String phoneNumber){
		this.name=name;
		this.age=age;
		this.phoneNumber=phoneNumber;
	}
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public String toString() {
		return "\nName: "+name+"\nAge: "+age+"\nPhone no :"+phoneNumber;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}
