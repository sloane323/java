package aug8_1;

import java.util.Scanner;

public class RandomUD {

	// 필드 

	int num; // 랜덤한수
	int usernum;// 유저 입력 수

	// 메소드 > main 에서 작성한 내용을 그대로 들고와서 만드는 법 
	//public 객체를 통해서 사용되는 메소드
	// private - 클래스 안에서만 사용되는 메소드 
/*
	void start() {
	// System.out.println("start 메소드에서 진행 되는 내용입니다.");
	// 1. 랜덤한 수가 만들어짐

	void getRandomNum() {
		this.num = (int) (Math.random() * 100) + 1;
	}

	// 유저 값을 들고옴 
	void checkUserGuess() {
		Scanner input2 = new Scanner (System.in);
		System.out.println("값을 입력해주세요 ");
		this.usernum=input2.nextInt();
		return usernum;
	}
	
	// Num 값이 큰지 작은지 확인.

	
	void checkNum() {
		if (usernum>num) {
			System.out.println("값이 큽니다");
		}
		else if (usernum < num) {
			System.out.println("작아요");
		}
		else if  (usernum == num)  {
			System.out.println("같아요");
		} }


		// 앞에 만든 메소드들을 조립해서 실행
		
		void startplay() {
			getRandomNum(); // 랜덤한 수 할당 
			
			this.checkUserGuess(); // 값을 받아옴 
			checkNum();  // 비교하여 결과 출력 
			if ( this.num == this.usernum) {
				break;
			}
	
		*/
		
	
	
	this.num=(int)(Math.random()*100)+1;System.out.println(num);

	// 2. 입력받은수를 랜덤한 수와 비교 결과를 알려줌

	// int usernum;
	Scanner input = new Scanner(System.in);

	while(true)
	{
		System.out.print("숫자값을 입력해주세요. : ");
		usernum = input.nextInt();

		// 3. 결과에 따라서 숫자 비교

		if (usernum > num) {
			// 4. 결과 출력
			System.out.println("다운");
		} else if (usernum < num) {
			System.out.println("업");
		} else {
			System.out.println("정답입니다");
			break;
		}
	} 
}

}
