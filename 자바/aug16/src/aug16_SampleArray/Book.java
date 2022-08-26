package aug16_SampleArray;

public class Book {
	
	//필드
	
	private String title;
	private String author;
	private int page;
	private boolean checkOut;
	
	// 정적필드
	private static int bookCount =0;
	//정적메소드
	public static int getBookCount() {
		return bookCount;
	}

	//생성자
	//디폴트생성자 
	
	public Book() {
		title="미정";
		author="미상";
		page=0;
		checkOut=false;
	}
	
	public Book(String title, String author, int page, boolean checkOut)
	{
		this.title=title;
		this.page=page;
		this.author=author;
		this.checkOut = false;
	}
	
	//메소드
	
	public boolean getCheckOut() {
		return this.checkOut;
		
	}
	
	public void ischeckout() {
		if (checkOut = true) {
			checkOut = false;
			System.out.println("책을 반납하였습니다."); }
			else  {
				checkOut = true;
				System.out.println("책을 대여하였습니다.");
		}
	}
	
	
	public void printBook() {
		if(!checkOut) {
			System.out.println(author + "의 "+ title + 
								"이 현재 있습니다.");
		}
		else {
			System.out.println(author +"의 " + title + "책은 대여중입니다.");
		 }
	}
	
	
	
	public Book (String title, String author, int page) {
		this.title = title;
		this.author=author;
		this.page=0;
		this.checkOut = false;
	}
	
	
	
}
