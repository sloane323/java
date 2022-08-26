package chaper08_interface;

public interface Comparable {
	
	// 추상메소드 
	// Object는 모든 클래스의 슈퍼클래스이므로 모든 객체가 다 들어갈수있다. 
	// 다향성 : 하나의 자료형의 참조변수에 여러개의 객체가 들어갈수있음 
	public int compareTo (Object otherObject);

	
	
	
}
