package chap_08_inherit;

public class Car {
	
	// 필드값 
	protected int speed;
	//protected를 이용하면 상속과 접근이 가능하다. 
	protected int gear;
	protected String color ;
	
	
	//생성자 
	// 매개변수가 없는 생성자를 디폴트 생성자라고 함
	public Car() {
		this.speed=0;
		this.gear=0;
		this.color="red";
	}
	
	
	public Car(int speed, int gear, String color) {
		this.speed=0;
		this.gear=0;
		this.color="red";
	}
		
	
	
	// 메소드 
	// 객체에 있는 값에 접근을 하기 때문에,
	// 슈퍼 클래스에서 
	
	
	public int speedUp (int Speed) {
		return this.speed += speed; 
	}
	
	public int speedDown (int Speed) {
		return this.speed -= speed; 
	}
	
	
	
	@Override
	public String toString() {
		return color+"색 차량입니다.";
	}
	
}
