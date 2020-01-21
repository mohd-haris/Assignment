package com.robomq.exception;

import java.util.Scanner;

public class EmployeeSystem {
	
	public static void main(String[] args) {
		
		Employee employees[] = new Employee[3];
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<employees.length;i++) {
			
		System.out.println("Enter employee id: ");
		int id = sc.nextInt();
		System.out.println("Enter employee name: ");
		String name=sc.next();
		System.out.println("Enter balance: ");
		Double balance = sc.nextDouble();
		System.out.println("Enter department number: ");
		int dno = sc.nextInt();
		if(dno==10||dno==20||dno==30||dno==40)
		{
		employees[i] = new Employee(id,name,balance,dno);
		}
		
		}
		
		
	}

}
