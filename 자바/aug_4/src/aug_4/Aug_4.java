package aug_4;

import java.io.IOException;

public class Aug_4 {

	public static void main(String[] args)throws IOException  {
	
		// 변수 선언
		int sum; // 변수선언 = 변수를 사용할 준비가 됨
		sum = 6 + 8; // 14
		sum = 2 + 1; // 3 변수는 가장 마지막값을 가지게 된다.
		// 코드는 항상 위에서 아래로 실행된다
		System.out.println(sum); //
		String name = "홍길동"; // 변수의 초기화
		// 선언을 먼저 하는 경우
		// for 과 while 반복문을 사용할 때 선언을 해줌

		int a = 0;
		for (int i = 0; i < 5; i++) {
			a = i;
			System.out.println(i);
		}

		System.out.println(a);
		System.out.println("시스템이 끝났습니다.");

		if (a > 3) { // 조건식을 만들기 위한 규칙
			System.out.println("a값은 3보다 큽니다.");
		}
		

	// 실습 중첩 if
		// 3개의 정수값을 받고 최대값을 출력하세요 
	
				
				System.out.println("0 ~ 1 사이의 랜덤 숫자 : " + Math.random());
				System.out.println("0 ~ 100 사이의 랜덤 숫자 : " + (int)(Math.random() * 100));
				System.out.println("0 ~ 10000 사이의 랜덤 숫자 : " + (int)(Math.random() * 10000));
		
			
			
	}	

}