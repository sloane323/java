package test_0801;

import java.util.Scanner;

public class Whilebreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//반복문
		// 1) while, break
		// - 숫자 0이 들어올 때까지 입력받고 0이 들어오면 모든 숫자를 더한 수와 평균을 출력하세요.
		
		
		Scanner input = new Scanner(System.in);
		int sum = 0;
		int count = 0;
		
		while (true) {
			System.out.println("0을 입력하면 모든 수의 합과 평균을 출력합니다. ");
			int num = input.nextInt();
			sum += num;
		
			if(num ==0) {
				break;
			} 	count++; // num이 0일때, 그 값을 더하지 않기 위함 
		}
		
		// sum 과 avg 구하기 
		
		System.out.println("합 : " + sum);
		System.out.println("숫자갯수 : " + count);
		System.out.println("평균 : " + sum/count);

	}

}
