package aug16_Sample;

public class BoredGame extends Game {
	
	int peopleNum;
	
	//생성자
	//디폴트생성자
	
	public void BoardGame() {
		peopleNum =0;
	}
	
	
	//매개변수를 갖는 생성자
	public BoredGame (String gameTitle, int peopleNum) {
		super (gameTitle);
		this.peopleNum = peopleNum;
	}
	
	//메소드
	//슈퍼클래스와 동일한 메소드임으로 오버라이딩 한다 
	
	public void play() {
		System.out.println(peopleNum+"명이서 "+getGameTitle()+"을 시작합니다.");
	}

}

