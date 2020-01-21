package assignmentTwo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;






public class BookList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Book> books = new ArrayList<Book>();
		books.add(new Book(001,"Tale of Mouse","Chetu","The Book Publishers",10));
		books.add(new Book(002,"Tale of Cat","Ramu","The Tale Publishers",7));
		books.add(new Book(003,"Tale of Dog","Radhey","The A-Class Publishers",12));
		books.add(new Book(004,"Tale of Mouse","Shanu","The Top Publishers",16));
		books.add(new Book(005,"Tale of Mouse","Autho","The Wow Publishers",11));
		 Iterator itr = books.iterator();
		 while(itr.hasNext()) {
			 Object obj=itr.next();
			 Book b=(Book)obj;
			 System.out.println(b);
		 }
		 char choice = 'a';
		 System.out.println("How you want to sort?\nBy id, type a\nBy Name, type b\nBy Author, type c\nBy Publisher, type d\nBy number of copies, type e");
		 Scanner sc = new Scanner(System.in);
		 choice = sc.next().charAt(0);
		 
		 switch(choice) {
		 case 'a':
			 SortById n=new SortById();
				books.sort(n);
				System.out.println(books);
		 break;
		 case 'b':
			 SortByName n1= new SortByName();
			 books.sort(n1);
			 System.out.println(books);
		 break;
		 
		 }
	
	}

}


