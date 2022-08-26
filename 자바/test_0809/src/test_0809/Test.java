package test_0809;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int you = 5;
		Box box4 = new Box();
		box4.plus(you);

		// 참조형 - 주소값이 복사되어 들어간다 > 객체에 바로 접근해서 수정
		// 가로세로높이의 값이 모두 50일때
		
		Box CloneBox = new Box(50);
		box4.CloneBox(CloneBox);
		// 주소값으로 접근했기 때문에. 값이 수정 되어 출력
		System.out.println(CloneBox.height);

		// 기초형의 값을 넣고 수정해서 사용 하고 싶은 경우
		
		int y = 10;
		// 메소드의 return 값을 동일한 변수가 받아와서 저장한다
		y = box4.plus(y);
		System.out.println(y);

		Box box5 = new Box(30);
		System.out.println(box4.equalsBox(CloneBox));
		System.out.println(box4.equalsBox(box5));

		if (box4.equalsBox(box5)) {
			System.out.println("크기가 같은 박스입니다.");
		}
		else  {
			System.out.println("크기가 다릅니다.");
		}
		
		//객체를 통해서 출력할수있다. 
		System.out.println(box4.boxcount);
		System.out.println(box5.boxcount);
		// 정적 변수는 클래스를 통해서 출력 할 수있다. 
		
		Box box6 = new Box();
		System.out.println(box4.boxcount);
		
		// 다른 클래스를 만든 정적  변수(상수)
		System.out.println(Math.PI);
		
		System.out.println(Student.studentCount);
		
		
		
		
	}

}
