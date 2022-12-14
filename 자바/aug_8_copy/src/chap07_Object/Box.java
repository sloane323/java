package chap07_Object;

// 객체를 만들기 위한 클래스 선언
public class Box {
	// 필드 - 객체가 각각 사용하는 값
	int width;
	int length;
	int height;
	public char[] calVoume;
	
	// 생성자
	// new를 이용해서 객체를 생성할 때 
	// 그 값을 초기화할 수 있다.
	Box() {
		// this를 사용하여 클래스의 필드와 메소드에 접근할수 있다.
		this.width = 10;
		this.length = 10;
		this.height = 10;
	}
	
	// 매개변수를 갖는 생성자
	// 외부에서 값을 받아와서 생성자 혹은 메소드 내에서 쓰는 변수
	// 일상예시) 커피(값)를 가져올 때 - 컵(변수)에 담아서 들고옴
	Box(int z) {
		// 가져온 z에 담긴 값은 {}블록 안에서 사용할 수 있다
		this.width = z;
		this.length = z;
		this.height = z;
	}
	
	
	// 메소드 - 객체의 행동/연산/명령
	// int - 반환값 (Return)의 자료형 
	// 반드시 return을 사용 
	//void 반환값이 없는 메소드, return 없음 
	
	int calVoume() {
		// 블록 안에서만 살아있는 지역 변수 
		int v = width*length*height;
		return v; // 필요한 값은 return 을 통해서 내보내준다 
		
		
	}
	
	
	void printData() {
		System.out.println("현재 가로,실,높이 길이" + this.width + this.length + this.length );
	}
	
	// a메소드를 이용하여 필드의 값을 바꿀수 있다. 
	
	void setwidth( int width) 
	{
		this.width = 0;
	}
	
	
}
