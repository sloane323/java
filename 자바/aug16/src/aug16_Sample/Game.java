package aug16_Sample;

public class Game {

	//필드 
	private String gameTitle ;
	
	//생성자
	// 디폴트 생성자 
	public Game()
	{
		gameTitle="미정";
	}
	
	//매개변수가 있는 생성자 
	
	public Game(String gameTitle) {
		this.gameTitle = gameTitle;
	}
	
	//메소드
	public String getGameTitle () {
		return gameTitle;
	}
	
	public void play() {
		System.out.println(getGameTitle() +  "게임을 시작합니다.");
	}
	
	public void stop() {
		System.out.println(getGameTitle() + "게임을 멈춥니다.");
	}
	public void end() {
		System.out.println(getGameTitle() + "게임을 종료합니다.");
	}
	
}
