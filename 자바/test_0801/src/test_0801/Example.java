package test_0801;

import java.util.Random;
import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random rnd = new Random();
		 Scanner scan=new Scanner(System.in);
		  int sco=0;
		  int cnt=0;
		  
		for (int a = 0; a < 5 ; a++) {
		
				for (int i = 1; i <= 1; i++) {
					
			int n1 = rnd.nextInt(100);
			int n2 = rnd.nextInt(100);
			
			System.out.println(n1 + " + " + n2 + " = ");
			int res = scan.nextInt();
		
			while (true) {
				if (res == n1 + n2) {
					
					System.out.println("정답");
					   sco+=10; cnt++;
				} else {
					System.out.println("오답");
				}
				break; 
			}
			
			}}
		
		
		System.out.println(" 수고하셨습니다. 당신의 점수는 " +((cnt)*20)+ " 점 입니다.");
	

} }
