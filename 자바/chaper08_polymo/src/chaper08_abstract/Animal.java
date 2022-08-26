package chaper08_abstract;
//추상클래스 선언 
public abstract class Animal  {
	
	// 실습1. 추상클래스 작성 abstract 
	// 추상클래스 Animal 을 만들고 
	// 필드 name month 
	// 추상메소드 void move () 를 만드세요 
	
	
	
//필드 
	private String name;
	private int month;
	

	// 추상메소드 
	public abstract void move ();

	
	//실습2
	// Animal을 상속받는 추상클래스 Mammal 을 작성하고, 서브클래스 dog 과 cat을 작성하자 
	// 추상클래스 Mammal 
	// public void move () {} // " 이동한다 " 를 출력 = 메소드 오버라이딩 public abstract void sound (); // 추상메소드
	// 서브플래스 Dog 과 Cat Mammal 을 상속받는다 
	//public void sound90 {} // 각 클래스마다 멍머 야옹을 출력한다 
	
	
	
	
}
