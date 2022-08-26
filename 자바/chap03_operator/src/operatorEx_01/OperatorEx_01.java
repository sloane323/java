package operatorEx_01;

import java.util.Scanner;

public class OperatorEx_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// 5642초 > 몇분 몇초인지 확인 
		
		
		int m = 5642 /60; // 94분으로 60분이 넘었음 
		int s = 5642 % 60;
		int h = m/60;
		
		m %= 60; //60분이 넘었기 때문에 나머지 연산자를 사용해서 0~59분의 값을 얻기 위함. 
		
		
		System.out.println(h+"시 "+m+"분 "+s+"초");
		
		// Scanner를 통해서 입력받은 초를 분과 초로 출력하기 
		
		int inputNum=0; //사용자의 입력값
		Scanner input = new Scanner (System.in);
		System.out.println("Enter your Time : ");
		inputNum = input.nextInt();
		System.out.println((inputNum/60/60)+" Hour "+(inputNum/60)+" Mins "+(inputNum%60)+" Secs");
		
		
		
		// 두개의 값을 받아서 계산하기 몫과 나머지 출력하기 
		

		Scanner input1 = new Scanner (System.in);
		
		System.out.println("Enter your first number : ");
		int num1 = input1.nextInt();

		System.out.println("Enter your next number (Cannot put number 0)");
		int num2 = input1.nextInt();

		int div = num1/num2 ;
		int rest = num1 % num2 ;
		System.out.println("몫 : "+div + " 나머지 : " + rest);
	    
	    
	    
		
	}
	

}
