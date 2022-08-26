package chaper08_interface;

public class Truck implements carInterface {

	@Override
	public void printCar() {
		System.out.println("인터페이스의 내용을 Turck 에서 구현 했습니다. ");
	}
}
