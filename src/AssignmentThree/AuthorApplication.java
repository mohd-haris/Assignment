package AssignmentThree;

import java.util.Set;
import java.util.TreeMap;

public class AuthorApplication {

	public static void main(String[] args) {
		TreeMap<String, AuthorList> books = new TreeMap<String, AuthorList>();
		books.put("Tales of horse!", new AuthorList(011,"Chetu Bhagu","123B, Baker Street"));
		books.put("Tales of rat!", new AuthorList(012,"John Doe","23E, Hannah Street"));
		books.put("Tales of cat!", new AuthorList(013,"Jane Baker","13D, Royal Street"));
		books.put("Tales of dog!", new AuthorList(011,"Chetu Bhagu","123B, Baker Street"));

		Set<String>keys=books.keySet();
		
		for(String i:keys) 
		{
		System.out.println(i+" Written by "+books.get(i).getName());
		
		}
		
	}

}
