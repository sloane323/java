package aug_2_3_breakcontinue;

import java.util.Scanner;

public class Aug_2_3_BreakContinue {

	public static void main(String[] args) {
		// 반복문안에서 사용 할 수있는 키워드
		// break;
		// switch문에서 breakl
		
		//예시  
		int num = 0;
		switch (num) {
		case 0:
			System.out.println("입력된 값은 0입니다");
			break;// break 를 사용해서 switch문을 나간다. 
		default:
			System.out.println("다른 숫자 값 입니다.");
			break;
		}

		//반복문에서 break
		for (int i=0; i<10 ; i++) {
			System.out.println(i);
			if (i==4) {
				break;
			}
		}
		
		
		//while 에서 break
		int a = 1;

		while (true) {
			a++;
			System.out.println(a);
			if(a>10) {
				break;
			}
		}
		
		
		
		//실습 1
		// 1~100까지 출력
		// 값이 77일때 중단 
		// % ( 나머지를 구하는 연산자 ) - 10의 배수에서 줄바꿈 입력 
		
		
		int f = 1; 
		while (true)
		{
			f++;
			System.out.print(f);
			if (f>76) {
				break;
			}
			//10의 배수일때 줄바꿈
			if(f%10==0) {
				System.out.println("/n");
			}
		}
		
		//실습 
		//while 의 조건문을 ture로 넣은 후,( 무한루프 ) 입력받은 숫자를 출력한다.
		// 단 0을 입력받으면 반복을 그만둔다
		// while(true) {if(){}}
		
		
		Scanner input = new Scanner(System.in);
		int g;
		
		while (true)
		{	
		System.out.println("숫자를 넣어보세요 (0 - 종료)");
		g = input.nextInt();
		if(g==0) {
				System.out.println();
				break;
			}
			else {
				System.out.println(g);
			}
		
		}
		
	//continue
	// 현재의 반복문을 건너뜀 
	/*	
		for(int i=0;i<10;i++) {
			if(i==4) {
				continue; // 
			}
			System.out.println(i);
		}
		
		
		
*/
		
		//참조형 저장 값 확인하기
		//String 으로 확인하지 
		
		String name1 = new String("그린");
		String name2 = new String("그린");
		String name3 = new String("green");
		
		//== 연산자로 String 을 비교 할때 주소값으로 비교한다 
		System.out.println(name1==name2);
		System.out.println(name1.equals(name2));
		
		
		
		
		
		
		
		
	}

}
