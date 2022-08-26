package chap_08_inherit;

// Car를 상속받는 서브 클래스 SportsCar
// extends를 사용하면 Car에 있는 필드와 메소드를 바로 사용 할 수있다 
public class SportsCar extends Car {
	
	// 서브 클라스의 필드 
	private boolean turbo;
	
	//서브 클래스의 생성자 
	public SportsCar() {
		// 묵시적 명시 > 슈퍼클래스의 생성자를 작성하지 않았을때, 
		// 항상 디폴트 생성자를 호출한다 
		this.turbo = false;
		
	}
	
	public SportsCar(int speed, int gear , String Color, boolean turbo) {
		super (speed,gear,Color,turbo);
		this.turbo = turbo;
	}
	
	// 서브 클라스의 메소드 
	public void setTurbo(boolean turbo) {
		this.turbo = turbo;
	}
	
	//메소드 오버라이딩
	//슈퍼클래스의 메소드를 수정해서 사용 
	
	public int speeUp(int speed) {
		
		//this는 객체를 생성한 후에, 그 객체 자기 자신을 의미.
		// car1.speed 로 필드값에 접근
		// car1 대신 this 를 써서 모든 객체의 이름이 들어올 수 있도록 함.
		
		// 객체에 있는 값을 접근을 하기 때문에, 
		// 슈퍼클래스에서 가지고 있는 값을 확인 하고 접근 할 수있다. 
		this.speed+= speed;
		
		// 서브클래스와 동일한 이름의 매소다(오버라이드)가 되어있지 않다면
		// 이름 또는 this 를 통해서 불러올수 있다. 
		
		speedDown(5);
		
		
		speeUp(speed);
		System.out.println("속도가 증가하였습니다. ");
		return this.speed;
		
	}
	
}
