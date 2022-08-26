package Ex;

import chap_08_inherit.Car;
import chap_08_inherit.SportsCar;

public class PeopleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Car car2 = new Car();
		People p1 = new People();
		p1.selfIntro();
		
		Worker w1 = new Worker();
		System.out.println(w1.nextMonth());
		w1.selfIntro();
		w1.setPeople("흥부", "남자", 30);		
		w1.selfIntro();		
		
		
		System.out.println(car2.speedUp(10));
		w1.intro();
		w1.selfIntro();
		
		//SportsCar car3 = new SportsCar();
		//SportsCar car4 = new SportsCar(10,2,"blue",true);

		Worker W2 = new Worker ();
		Worker W3 = new Worker ("놀부","남",40,"부자",44);
		//Worker W4 = new Worker ("놀부","남",40,"부자",45);
		
		W2.selfIntro();
		W3.selfIntro();
		
		System.out.println(W3.getClass().getName());
		
		//object 라는 클래스는 모든 클래스의 슈퍼클래스
		// 모든 종류의 클래스가 들어갈 수 있다. 
		//아래와 같이 object 객체를 매개변수롤 사용하는 경우 
		//인수는 어떠한 값도 들어갈수있다. 
	
		System.out.println(W3.equals(W3));
		System.out.println(W3.equals(1));
		
		
		//car2.toString () 결과와 car2 의 결과 동일
		// 동일한 메소드 사용
		System.out.println(car2.toString());
		System.out.println(car2);
	}

}
