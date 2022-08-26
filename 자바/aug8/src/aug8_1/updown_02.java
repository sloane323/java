package aug8_1;

import java.util.Scanner;

public class updown_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		 // RandomUD 객체확인
	/*
		RandomUD randomNum = new RandomUD();
		randomNum.start(); // 캡술화 

		// 랜덤한 수를 가진 업다운 게임

		/*
		 * 1. 랜덤한 수가 만들어짐 
		 * 2. 입력받은수를 랜덤한 수와 비교 결과를 알려줌 
		 * 3. 결과에 따라서 크다 작다를 알려주고 
		 * 4. 같다면 게임 끝
		 */

		// 1. 랜덤한 수가 만들어짐

		int num = (int) (Math.random() * 100) + 1;
		System.out.println(num);

		// 2. 입력받은수를 랜덤한 수와 비교 결과를 알려줌

		int usernum;
		Scanner input = new Scanner(System.in);

		while (true) {
			System.out.print("숫자값을 입력해주세요. : ");
			usernum = input.nextInt();

			// 3. 결과에 따라서 숫자 비교

			if (usernum > num) {
				// 4. 결과 출력
				System.out.println("다운");
			} else if (usernum < num) {
				System.out.println("업");
			}
			else
				{System.out.println("정답입니다");  break; }
		}
	}


}
