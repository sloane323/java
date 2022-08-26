package chap04_ifex;

import java.util.Scanner;

public class Chap04_ifEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 삼항연산자 (? : ) 
		 * 한줄에다가 참거짓을 확인하고 싶을때, 
		 * 삼항연산자의 결과 값은 조건에 따른 참/거짓 값이다. 
		 */

		int x = 10;
		int y = 11; 
		
		//삼항 연산자, 연산자의 특징 : 계산을 하고 그 결과 값을 출력 
		int maxNum = x>y ? x:y ;
		
		System.out.println(maxNum);

		/*
		 * 변수를 임의의 수로 초기화 하고값이 양수이면 “양수”를, 
		 * 음수이면 “음수”를 출력한다.(___) ?___ : ___

		 */

	int num3 = 88 ;
	String State = num3 > 0 ? "양수" : "음수" ; 
	System.out.println(State);
	
	// 
			
	
		
		
		
}
	}

