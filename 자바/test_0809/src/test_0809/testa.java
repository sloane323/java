package test_0809;

import java.util.Scanner;
import java.time.LocalDate;

class 붕어빵틀 
{
	String 앙꼬 = "팥";
	int 가격 = 300;

	붕어빵틀() {
	}

	붕어빵틀(String 앙꼬) {		// this: 객체를 가르킴, this.앙꼬: 맴버변수, 앙꼬: 지역변수
		this.앙꼬 = 앙꼬;
	}
	붕어빵틀(String 앙꼬, int 가격) {
		this.앙꼬 = 앙꼬;
		this.가격 = 가격;
		System.out.println("붕어빵이 구워졌어요");
	}

	void 배부르게하다() {
		System.out.println("배불러~");
	}

	public static void main(String[] args) {
		System.out.println("Hello World!");
	}
}


class 주인  { 	
	String 성별 = "아줌마"; 	붕어빵틀 붕어빵1;
	
주인() {}	// default 생성자 	

   void 굽는다() { 
	붕어빵1 = new 붕어빵틀("고구마", 500);} 	
   void 설명한다() { 
		System.out.println
		("앙꼬가 " + 붕어빵1.앙꼬 + "이고, 가격이 " + 붕어빵1.가격 + "원 이예요");}
	void 판다() { 
		System.out.println("붕어빵을 판다"); 	}	 }



class 신 {
	public static void main(String[] args) { 
		붕어빵틀 붕어빵1 = new 붕어빵틀("고구마", 500);
		System.out.print
		("앙꼬가 " + 붕어빵1.앙꼬 + "이고, 가격이 " + 붕어빵1.가격); 
		System.out.print
		("원인 붕어빵이 "); 		붕어빵1.배부르게하다(); 		
		주인 주 = new 주인();	
		// 객체: 맴버변수, 메소드 사용함 		주.굽는다(); 		주.설명한다(); 	
		주.판다(); 	} }
	

