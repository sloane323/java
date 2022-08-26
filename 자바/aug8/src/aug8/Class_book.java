package aug8;
import java.util.Scanner;

public class Class_book {
	
	public int pages;
	public String title,author;
	 Class_book() {
		 this.title = "짱구는 못말려";
		 this.author = "흰둥이";
		 this.pages= 300;
	}


	
	 Class_book(String title, String author, int pages){
		 this.title = title;
		 this.author = author;
		 this.pages= pages;
		 
	 }
	
	 	String getTitle() {
			String v = title;
			return v; 
		}
	 	
	 	boolean checkPageCount () {
	 		if (pages==0) {
			System.out.println("다시 입력해주세요");}
			return false;
	 	}
	 	

		
		void setTitle(String title) {
			
			Scanner input = new Scanner(System.in);
			System.out.println("페이지를 입력해주세요");
			int inputpage = input.nextInt();
			
			if(inputpage == pages) {
			System.out.println("책이름 & 작가 & 페이지" + 
					this.title + this.author + this.pages );
		}
		}


	
	   
			
		}

		
		
		





