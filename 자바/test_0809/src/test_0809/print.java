package test_0809;

public class print {
	public static void main(String[] args) {

		Book myBook = new Book();
		Book myBook1 = new Book("흥부전", 100);
		
		System.out.println(myBook.title);
		System.out.println(myBook1.title);
		
		System.out.println(myBook.pages);
		System.out.println(myBook1.pages);
		
		
		System.out.println(myBook.setTitle());
		System.out.println(myBook1.setTitle());
		myBook.setTitle("심청전");
		System.out.println(myBook.setTitle());
		
		
		System.out.println(myBook.checkPageCount());
		System.out.println(myBook1.checkPageCount());
		
		if(myBook.checkPageCount()) {
			System.out.println("페이지가 들어있습니다.");
		}
		else {
			
			System.out.println("페이지가 입력되어있지 않습니다.");
		} }

		
	
		// Array  에서 
		// 기호형을 받아와서 숫자를 더한 후에 출력
		// Box와 관계가 없고 매개변수로 받아온 값이 복사되어 들어온 값이 확인하기 위함 
		
		int plus(int u7) {
			// 매개변수
		return u7++; }
		
		

		
		
}


