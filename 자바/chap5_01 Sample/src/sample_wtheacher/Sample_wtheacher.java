package sample_wtheacher;

import java.util.Scanner;

public class Sample_wtheacher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//입력 받는 모든수를 더하는 프로그램
		
		//while 문 사용 (조건/반복내용)
		//조건 -0 을 입력 받을때까지 모든 숫자를 더함
		// : == 관계연산자를 사용
		
		// 0이 들어왔을때 반복 멈춤
		// 다른 수가 들어왔을때 계속해서 모든 숫자를 더함
		
		// 반복내용 - 모든 숫자를 더함 
		// sum 이라는 변수를 통해 들어오는 값들을 더하여 저장 
		
		/*
		Scanner input = new Scanner(System.in);
		System.out.println("더할 수를 입력하세요. 0을 넣으면 종료됩니다.");
		
		int num = input.nextInt();
		int sum = 0;
		int n=0;
		
		while (num!= 0) {
			sum += num;
		num = input.nextInt();
		n++;
		

		
		}
		
		System.out.println("입력된 수의 합 :  "+ sum);
		System.out.println("입력된 수 :  "+ n);
		
		
		*/
		
		// while 을 이용한 구구단 반복문 
		
	/*
		Scanner data = new Scanner(System.in);
		System.out.println("구구단 단수를 입력하세요");
		
		int danin = data.nextInt();
		int num1 = 1;
		
		while (num1 <= 10) {

			System.out.println(danin+"*"+num1+"= "+(danin*num1));
		
		num1++; // 무조건 단을 멈춰야한다 단을 증가할때 쓰는 
		}
		
		
		System.out.println(danin + "단");
		
		
		
		// do while  : 반복한 내용이 무조건 한번은 실행되는 조건문
		
		Scanner input = new Scanner (System.in);
		
		int bab = 0;
		int ban = 0; 
		
		do { // while 안에 있던 반복할 내용이 do를 이용해 재생된다. 
			System.out.println("더할값을 입력하세요 (0을 넣으면 멈춤) : ");
			bab = input.nextInt();
			ban += bab;
			System.out.println("계속 입력"); 
		}
		while (bab != 0); // 조건이 참이라면 do로 올라가 다시 반복 
		System.out.println(" 더한 값 " + ban
				);
		*/
		
		
		// 실습 do while 
		
				int dod= 0;
				do {dod++;
				
					System.out.println(dod);
					
				}while(dod<=9);
		
		
		
				
		
	}

}
