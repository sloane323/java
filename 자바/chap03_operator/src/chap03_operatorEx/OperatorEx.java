package chap03_operatorEx;
import java.util.Scanner;
public class OperatorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 // 실습2 대입,산술,복합 대입
		
		//커피가게에 총 매출을 계산하는 프로그램 만들어 계산 
		/* 아메리카노 2000
		 * 카페라떼 3000
		 * 카포치노 3500
		 * 
		 * 아메리카노 3/카페라떼 3 / 카푸치노 3\
		 */
		
		
		
		
		int americano = 2000;
		int cafelatte = 3000;
		int Cappuccino = 3500;
		
		americano *= 3;
		cafelatte *= 3;
		Cappuccino*= 3;
		
		
		/*
		 *  int sum3 = 0;
		
		*sum3 = americano*3 + cafelatte*3 + Cappuccino*3
				*System.out.println(sum); */
		
		System.out.print
		("Americano : ");
		System.out.println(americano);
		System.out.print
		
		("Cafe latte : ");
		System.out.println(cafelatte);
		System.out.print
		("Cappuccino : ");
		System.out.println(Cappuccino);
		
		System.out.print
		("Total : ");	
		
		System.out.print (americano+cafelatte+Cappuccino);
		
		
		System.out.print
		("\n");	
		
		
		/* 나머지 몫 , 나머지 계산을 사용 하여 5642초를 몇분 몇오인지 계산하기 
		 * 1분 60초
		 *몫 , % 나머지
		 */
		
		
		//Scanner input = new Scanner(System.in);
		

		
		int time = 0;
		time = 5642;
	
		
		System.out.println(time/60);
		Scanner input = new Scanner(System.in);
		time = input.nextInt();
		System.out.println(time/60 + " Mins");
		System.out.println(time%60 + " Secs");
		System.out.println("출력했습니다");
		
		
		
		
	}
	
	

}
