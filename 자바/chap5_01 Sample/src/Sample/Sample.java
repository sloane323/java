package Sample;

import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//입력받은 모든 수를 더하는 프로그램 
		// 조건: 0을 입력받을때까지 모든 숫자를 더한다 
			// 0을 입력 받았을때 > 코드 반복 중지
			// 0이 아닌 다른수를 입력 받았을때  > 숫자를 더하기 위해 반복
		// while 문 사용 
			// 반복되는 내용은 = 숫자를 더 하는것 
		// 어떻게 숫자를 더할수있을까?
		//변수에 숫자를 더해서 저장 
		
		
		Scanner a = new Scanner(System.in);
		System.out.println("원하시는 숫자를 입력해주세요");
		
		int b = 0 ;
		b = a.nextInt();
		
		int sum =0;
		int n=0;
		
		
		while (b!= 0) //0을 받기전까지 반복 실행  {
			sum += b; //입력받은 값을 sum 에 저장 
			n++; // 입력받은 숫자의 갯수가 추가됨 
			b= a.nextInt(); //다음 숫자를 받을 준비 


			
		
	
		System.out.println("입력된 수의 개수는 " + n);
		System.out.println("입력된 수의 합는 " + sum);
	
		
		
		
		
		
		
	}
	


}