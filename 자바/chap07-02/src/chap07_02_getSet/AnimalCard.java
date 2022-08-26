package chap07_02_getSet;

public class AnimalCard {
	// 필드
	
	private String animal;
	private String name;
	private int month;
	
	// 정적 변수 cardCount; -private
	   private static int cardCount=0; //생성할 때마다 1씩증가
	   // 정적 변수로 만든 상수 MAX_CARD= 10; -public 
	   public static final int MAX_CARD = 100;
	   
	   // 정적 메소드 getCardCount; -public
	   public static int getCardCount() {
	      return cardCount;
	   }
	   
	   //생성자 추가해보기 : 생성자명 = 클래스이름. 생성자1
	   public AnimalCard() {
	      this.animal= "";
	      this.name="";
	      this.month=0;
	      
	      cardCount++;
	   }
	   //매개변수의 개수가 다르다면 여러 생성자 만들 수 있음. 생성자2
	   public AnimalCard(String animal, String name, int month) {
	      this.animal=animal;
	      this.name=name;
	      this.month=month;
	      
	      cardCount++;
	   }
	
	
	/*
	public AnimalCard() {
		this.animal = "" ;
		this.name = "";
		this.month = 0;
		
	}
	
	public AnimalCard(String animal, String name, int month) {
		this.animal = animal;
		this.name = name;
		this.month = month;
		
	}
*/
	
	
	// 설정자와 접근자 
	public String getAnimal() {
		return this.animal;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getMonth() {
		return month;
	}
	
	
	public void setAnimal(String animal) {
		this.animal = animal;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setMonth (int month) {
		this.month = month;
	}
	
	public void printAnimalCard () {
		
		this.animal = getAnimal();
		this.name = getName();
		this.month = getMonth();
	
		System.out.println("이름 : " + getName() + "  종류 " + getAnimal() + "  나이 : " + getMonth() + "달");

	}
	
	// 실습 . 동물 종류와 이름, 개월수를 출력하는 메소드 
	// get 메소드를 이용하여 이름 값을 가져오자
	// 출력내용 : 동물종류  , 이름 , 개월수 
	
	
	
	
}
