package com.robomq.exception;

import java.util.ArrayList;
import java.util.Comparator;

public class CustomerList {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Customer> customers = new ArrayList<Customer>();
		
		customers.add(new Customer("Haris",21,"9460284364"));
		customers.add(new Customer("Mukesh",17,"9460284364"));
		customers.add(new Customer("Ramesh",23,"9460284364"));
		System.out.println(customers);
		
	
	}

}


