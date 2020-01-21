package assignmentTwo;

import java.util.Comparator;

public class SortById implements Comparator<Book>{

	@Override	
	public int compare(Book b1, Book b2) {
		// TODO Auto-generated method stub
		int r=(int) ((int)b2.getId()-b1.getId());
		return r;
	}
}
