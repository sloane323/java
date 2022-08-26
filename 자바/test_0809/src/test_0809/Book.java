package test_0809;

public class Book {

	// 필드

	String title;
	int pages;

	// 생성자

	Book() {
		this.title = "제목미정";
		this.pages = 0;
	}

	Book(String title, int pages) {
		this.title = title;
		this.pages = pages;
	}

	// 메소드
	// 책 제목을 받아와서 값을 넣어주는 메소드
	void setTitle(String title) {
		this.title = title;
	}

	// 책 제목을 return 해주는 메소드

	String setTitle() {
		return this.title;
	}

	// 책 페이지가 0이면 false 를 출력하는 메소드 0이 아니면 true
	boolean checkPageCount() {
		boolean check;
		if (this.pages == 0) {
			check = false;
		} else {
			check = true;
		}
		return check;

		// object class *

		// 메소드 매개변수로 전달. - 값을 복사해서 전달
		// 기초형

		
		
	}

} 
