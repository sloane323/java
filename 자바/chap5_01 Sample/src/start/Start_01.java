package start;

import java.util.Scanner;

public class Start_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//for문을 이용한 1부터 10까지의 정수의 합 
		/*
		
		int sum = 0;
		for(int i = 1; i<= 10; i++) {
			sum+=i;
		}

		System.out.println("1부터 10까지의 합 : "+sum);
		
		
		int dodo =0;
		for(int j = 1; j<=500; j++ ) {
			dodo+=j; }
		
		System.out.println("1부터 500 까지의 :" +dodo);
	
		 
		
		int pack = 1;
		for(int k = 1; k<=5; k++)
		{ pack = pack * k;	
		}
		System.out.println("5! " +pack);

		int pack2 = 1;
		for(int t = 1; t<= 8; t++)
		{ pack2 = pack2 * t;	
		}
		System.out.println("8! " +pack2);

		
		*/
		
		
		//더하기를 몇번 반복할건지 작성
		// 더해진 값은 바로 아래 출력
		// 처음 입력받은 만큼 반복 
		
		
		// 반복할 숫자를 입력 받은 후 반복해서 더한값 출력하기
		
		/*
		
		Scanner input = new Scanner(System.in);
		System.out.println("더하기를 몇번 반복할지 작성하세요 : ");
		int count = input.nextInt();
		int a, b;
		
		
		for(int num3 =1; num3<count; num3++) {
			System.out.println("두 수를 띄워서 작성하세요 : ");
			a =  input.nextInt();
			b =  input.nextInt();
			System.out.println("결과 : " + (a+b));
			
		
		}
		*/
		
		
		// 1부터 20까지의 정수 중 2 또는 (||)3의 배수가 아닌 수의 총 합을 출력하라 
		// 값 - 73 
		// !> 값을 부정하여 사용 
		
		
		/*
		 * 2의 배수의 총합
		 * 3의 배수의 총합
		 */
		
		
		int sum = 0;
		int num = 20; 
		
		for(int i =0; i<20 ; i++) {
			if((i%2)==0) {
				continue;
			}

			else if((i%3)==0) {
				continue; 
			}
			
			
			else {
				System.out.println(i+" 메롱메롱절취선");
				sum+= i;
			}
		}
		
		
		System.out.println();
		System.out.println("총합: " + sum);
	}

	
}

