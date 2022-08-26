package chap_08_inherit;

public class inheritMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		SportsCar Car1 = new SportsCar();
		
		System.out.println(Car1.speed);
		// 상속받은 Car의 필드값을 사용 할 수있다. 
		// protected 접근 지정자를 사용 한 경우
		
		System.out.println(Car1.color);

		Car car2 = new Car();
		System.out.println(car2.color);
		
		
	}

}
