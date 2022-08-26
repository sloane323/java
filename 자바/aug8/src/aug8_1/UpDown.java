package aug8_1;

import java.util.Random;
import java.util.Scanner;


//랜덤한 수를 가진 업다운 게임 

/*
 * 1. 랜덤한 수가 만들어짐
 * 2. 입력받은수를 랜덤한 수와 비교 결과를 알려줌
 * 3. 결과에 따라서 크다 작다를 알려주고 
 * 4. 같다면 게임 끝 
 */

public class UpDown {

	int num = (int)(Math.random()*100)+1;
	System.out.println(num)
	

	
	int usernum = 0; 
	

	
	public void getRandomNum ( int num ) {
		this.num = num;
		System.out.println("0.0 ~ 1.0 사이의 난수 1개 발생 : " + Math.random());
		
	}
	
	
	
	public int getNum() {
		
		return this.num ; 
		
		Scanner input = new Scanner(System.in);
		System.out.println("생각하시는 번호를 입력해주세요 ");
		num = input.nextInt();
	}
	
	

	public void checkNum ( ) {
	
		if (this.num > usernum ) {
			System.out.println("업");
		}
		else if (this.num < usernum ) {
			System.out.println("다운");
		}
		else {
			System.out.println("정답입니다.");
		}
		
		
		
	}
}
