package aug_2;

import java.awt.desktop.ScreenSleepEvent;
import java.util.Scanner;

public class Aug_2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//메뉴 선택하는 반복문
		
		Scanner input = new Scanner(System.in);
		System.out.println("메뉴를 선택해 주세요 1.짜장 2.짬뽕 3.탕수육 0.종료");
		int num = input.nextInt();
		while (num !=0) {
			if (num == 1 ) {
				System.out.println("짜장을 선택 하였습니다.");
			}
			else if (num==2) {
				System.out.println("짬뽕을 선택 하였습니다.");
			}
			else if (num==3) {
				System.out.println("탕수육을 선택 하였습니다.");
			}
			System.out.println("메뉴를 선택해 주세요 1.짜장 2.짬뽕 3.탕수육 0.종료");
			num = input.nextInt();
		}
		System.out.println("종료되었습니다");
		
		
		
		
		
		// do while 로 만들기
		
		Scanner input = new Scanner(System.in);
		do {
			System.out.println("메뉴를 선택해 주세요 1.짜장 2.짬뽕 3.탕수육 0.종료");
			num = input.nextInt();
			System.out.println("짜장을 선택 하였습니다.");
		}
		else if (num==2) {
			System.out.println("짬뽕을 선택 하였습니다.");
		}
		else if (num==3) {
			System.out.println("탕수육을 선택 하였습니다.");
		}
		System.out.println("메뉴를 선택해 주세요 1.짜장 2.짬뽕 3.탕수육 0.종료");
		num = input.nextInt();
		}
	}while (num!= 0);

}
