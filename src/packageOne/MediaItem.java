package packageOne;
// MediaItem is child class of Item
public class MediaItem extends Item{

	public MediaItem(int idNum, String title, int NumOfCopies) {
		super(idNum, title, NumOfCopies);
		// TODO Auto-generated constructor stub
	}

}
// Video class is child class MediaItem
 class Video extends MediaItem{
	 private int videoLength;
	
	 
	 public Video(int idNum, String title, int NumOfCopies)
	 {
		super(idNum, title, NumOfCopies);
		// TODO Auto-generated constructor stub
	 }
	
	 void checkLength() {
		 System.out.println("Length of video:  ");
	 }
 
 }
 //Video class is child class MediaItem
 class CD extends MediaItem{

	public CD(int idNum, String title, int NumOfCopies) {
		super(idNum, title, NumOfCopies);
		// TODO Auto-generated constructor stub
	}
	 
	 
 }
