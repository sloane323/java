package chaper08_polymo;

import chaper08_abstract.Cat;
import chaper08_abstract.Dog;

public class PolymoTest {
	public static void main(String[] args) {

	//타입변환 
	// 다른 데이터 타입으로 변환하는 행위 
	
	// 클래스의 경우 
	// 자식타입은 부모타입으로 자동변환이 가능하다 
		
		// Car : SportsCar 의 부모클래스 
		// SportsCar  Car의 자식 클래스 
		// 변수의 데이터 타입은 부모클래스이지만, 안의 객체는 자식클래스가 들어감 
	
	Car myCar = new SportsCar();
		// 부모클래스로 자동으로 타입변환을 해줄경우 부모 필드/메소드는 사용가능
		// 부모클래스로 타입변환이 되었기 때문에 sportCar의 필드/메소드는 사용 불가능 
	
	
	System.out.println(myCar.color);
	//부모클래스의 메소드를 오버라이딩한 내용은  SportsCar에서 수정한 내용으로 사용이 가능하다. 
	System.out.println(myCar.speedUp(10));

	// 자동 형변환의 예시 
	System.out.println(10.2/2);
	
	// 강제로 형변환 - 앞에 괄호를 통해 자료형을 바꿔줌 
	Car yourCar = (Car) new SportsCar();
	System.out.println(10.2/(double)2);
	
	// 자식클래스에 부모클래스 객체를 할당 할 수없다. 
	// sportsCar sportsCar = new car(); 
	
	
	
	
	//실습 다향성과 타입변화
	// people 의 참조변수에 Worker 의 객체를 넣어서 확인하세요
	// 어떤 메소드를 쓸 수있는지 확인하기 
	
	
	
	People mypeople = new Worker();
	System.out.println(mypeople.age);
	System.out.println(mypeople.gender);
	

	People yourPeople = (People) new Worker();
	
	
	
	//
	People p1 = new Worker("흥부","남",30,"농부",40);
	
	// 오버라이딩을 통해서 메소드를 들고올때 입력해준 필드값들 존재 확인 
	p1.selfIntro();
	
	// 부모자료형의 변수에 넣은 자식 객체를 각제로 형변환해서 넣기 
	// 자식객체를 그대로 사용한다 (변수 그대로 할당하였으므로 주소 복사 ) 
//	SportsCar sportscar1 = (SportsCar) myCar;
	// 자식객체의 메소드/ 필드를 사용할수 있다.
	// 주소를 그대로 가져왔기에, 값이 동일하게 바뀐다. 
//	sportscar1.setTurbo(true);
	
	// 자식자료형의 변수에 부모객체를 강제로 형변환해서 넣을수 없다. 
	// SportsCar SportsCar2 = (SportsCar) new car();
	
	
	
//	SportsCar sportsCar2 = (SportsCar) new Car(); 
//	sportsCar2.setTurbo(true);	
	
	
	//실습 1 강제 타입변환과 타입 확인
	//people 참조변수에  Worker 객체를 할당 한 후, Instansceof 를 이용해서 변수안의 객체의 타입을 알아내고 
	// (true/false 출력 ) 
	// worker 참조 변수에 강제타입변환을 이용하여 값을 할당하세요 
	
	System.out.println(p1 instanceof Worker);
	Worker worker = (Worker) p1; 
	worker.intro();
	worker.nextMonth();
	worker.nextMonth();
	
	//상속에서의 다형성 
	//Car라는 부모클래스 안에 여러가지 자식클래스가 들어갈수있다 
	
	
	Dog dog = new Dog();
	dog.move();
	dog.sound();
	
	Cat cat = new Cat ();
	cat.move();
	cat.sound();
	
	
	
	
	
	
}
}
