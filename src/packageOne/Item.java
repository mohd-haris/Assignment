package packageOne;

public abstract class Item {
	private int idNum;
	private String title;
	private int NumOfCopies;
	
	public Item(int idNum,String title,int NumOfCopies)
	{
	this.idNum = 0;
	this.title = "";
	this.NumOfCopies = 0;
		
	}
	
	public String toString() {
		
		return "";
	}
	
	public void checkOut() {
		System.out.println("Checking out...");
	}
	
	public void addItem() {
		System.out.println("Added item...");
	}
	
	public void getItem() {
		System.out.println("Id : "+this.idNum +"\nTitle: "+this.title+"\nNo. of Copies: "
				+this.NumOfCopies);
	}
	
	public void setItem(int id,String title,int numOfCopies) {
		this.idNum = id;
		this.title = title;
		this.NumOfCopies = numOfCopies;
	}
	
	
	public static void main(String[] args) {
		Item wow = new WrittenItem(001,"Just Wow",20);
		wow.getItem();

	}

}
