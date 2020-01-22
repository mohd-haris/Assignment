package com.robomq.collection;

import java.util.HashSet;

public class HashSetString {

	public static void main(String[] args) {
		HashSet<String> countries = new HashSet<String>();  //HashSet do not add duplicates
		countries.add("INDIA");								//If We Use TreeSet instead, it would sort the data.
		countries.add("AUSTRALIA");
		countries.add("RUSSIA");
		countries.add("RUSSIA");
		
		System.out.println(countries);
	}

}
