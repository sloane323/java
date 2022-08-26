package chaper08_abstract;

//abstract 을 통해서 추상클래스 선언 
public abstract class Shape {

	//필드값 사용 가능 
	private int x,y;

	
	// 일반메소드선언 
	public void move (int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	
	//추상 메소드
	//abstract 키워드를 사용해서 몸체없이 이름만 작성
	public abstract void draw();
	
	// {} 의 내용은 없지만 가져올 매개변수를 지정할 수있다. 
	public abstract void print(String word);
	
	
	
	
	
}
