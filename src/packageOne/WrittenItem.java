package packageOne;

public class WrittenItem extends Item{
	
	public WrittenItem(int idNum, String title, int NumOfCopies) {
		super(idNum, title, NumOfCopies);
		// TODO Auto-generated constructor stub
	}

}

class Books extends WrittenItem{

	public Books(int idNum, String title, int NumOfCopies) {
		super(idNum, title, NumOfCopies);
		// TODO Auto-generated constructor stub
	}
	
}

class Journal extends WrittenItem{

	public Journal(int idNum, String title, int NumOfCopies) {
		super(idNum, title, NumOfCopies);
		// TODO Auto-generated constructor stub
	}
	
}
