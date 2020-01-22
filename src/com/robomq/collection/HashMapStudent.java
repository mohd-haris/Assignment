package com.robomq.collection;

import java.util.HashMap;
import java.util.Set;

public class HashMapStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, Student> students = new HashMap<Integer,Student>();
	students.put(1, new Student("Haris",300,30));
	students.put(2, new Student("John",260,25));
	students.put(3, new Student("Jane",200,15));
	students.put(4, new Student("Whatever",150,12));
	
	System.out.println(students);
	
	Set<Integer>keys=students.keySet();
	String grade=null;
	for(Integer i:keys) {
		Student s=students.get(i);
		if(s.getMarks()>=300)
		grade="A";
		else if(s.getMarks()<300 && s.getMarks()>250)
			grade="B";
		else
			grade="C";
		
		System.out.println(s.getName()+" Scored "+grade+" Grade in current sem");
	}
	}

}
