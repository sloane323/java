package chap07_object;

import stringEx_aug.calVoume;

//객체를 만들기 위한 클래스 선
public class ObjectClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Box myBox;
		myBox = new Box();
		// 자바는 객체 지향 언어이다 = 캡슐화 
		// 캡슐화의 특징 : 값과 메소드가 함께 들어가 있다.
		//				쉽게 바꿀수있다
		
		// 객체를 만들기 위해서 class 사용
		// class 는 객체를 만드는 툴 
		
		
		//미리 작성된 클래스 - String 
		String name = new String("홍길동");
		//객체 name은 .(도트)를 통해 메소드를 사용 할 수있다.
		System.out.println(name.equals("홍길동"));
		
		//직접 만든 클래스의 객체 Box에 접근하기
		System.out.println(myBox);
		// 객체에 접근하는 방법 - 필드의 값에 접근해서 출력 
		System.out.println(myBox.height);
		// 객체에 접근하는 방법 - 메소드의 계산 결과를 출력 
		
		System.out.println(myBox.calVoume());
		

		
		//만든 클래스의 객체 생성하기
		Student myStudnet = new Student();
		System.out.println(myStudnet.name);
		// 필드에 직접 접근해서 값 할당 ( 잘 사용하지 않음) 
		myStudnet.name = "홍길동" ; 
		System.out.println(myStudnet.name);	
		myStudnet.age = 30; 
		System.out.println(myStudnet.age);
		myStudnet.grade=5;
		myStudnet.printGrade();
		
		// 다른 객체 생성
		Student myStudent1 = new Student();
		System.out.println(myStudent1.name);
		myStudent1.printGrade();
		
		//변수가 들어가 있는 값 확인 
		System.out.println(myStudnet);
		System.out.println(myStudent1);
		
		

		//생성자
		
		//매게변수를 갖는 생성자
		// 외부에서 값을 받아와섯 ㅐㅇ성자 혹은 메소드 내에서 쓰는 변수
		// 커피를 가져울때 / 컵에 담아서 들고옴 
		
		
		/* Box(int z){
			
			// 가져온 z 에 담긴 값은 {} 블록 안에서 사용 할 수있다 
			this.width = 10;
			this.length = 10;
			this.height= 10;
		}
		
		
		
		//메소드 - 객체의 행동 / 연산 / 명령 
		int calVoume() {
			return width*length*height;
			// new와 생성자를 통해서 객체 생성 
			
			
		*/ 
		
		int ObjectClass = 0;
			
			//매개변수를 갖지 않는 생성자
			// 이름 홍길동 나이 학년 초기화 
			
			ObjectClass(){
				this.name = "홍길동";
				this.age = 0;
				this.grade =0;
			}
		
		
			// name 값을 매개 변수로 받아오는 생성자 
			// 이름(name) 나이(0) 학년(0) 초기화 
			
			
			ObjectClass(String name){
				this.name= name;
				this.age=0;
				this.grade =0;
			}
		
		
			
	
		
		
	}

}
