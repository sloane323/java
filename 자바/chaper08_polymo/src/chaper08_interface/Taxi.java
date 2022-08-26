package chaper08_interface;

public class Taxi implements carInterface {
	@Override
	public void printCar() {
		System.out.println("인터페이스 내용을 Taxi 에서 구현했습니다. ");
	}

}


