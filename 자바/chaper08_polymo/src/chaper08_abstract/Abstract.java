package chaper08_abstract;

public class Abstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//추상클래스는 객체를 생성하게되면 생성자로 생성할수 없다. 
		// 추상메소드는 몸체를 구현해서 사용 할 수있다.
		// 서브클래스를 통해서 상속받아 그 몸체를 구현하여 사용한다. 
		// Shape s1 = new Shape()
		
		Rectangle r1 = new Rectangle();
		r1.draw();
		r1.print("단어를 입력합니다.");
		r1.move(10,20);
		
		
		//실습 . 추상 클래스 상속
		// Shape 클래스를 상속받는 Circle 클래스를 작성
		// Draw() // 원을 그립니다 출력
		// Print() // 원클래스에서 출력 : word 
		
		
		Circle c1 = new Circle();
		c1.draw();
		c1.print("하나둘셋넷다섯여섯일곱 그리고 하나");
		
		

		

		
	}
	

}

