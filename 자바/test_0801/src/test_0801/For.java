package test_0801;


import java.util.Scanner;

public class For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		//2) for
		// (int)(Math.random()*100) 을 이용해서 더하기 문제를 5번 제출하세요
		
		Scanner input = new Scanner(System.in);
		
		for (int i = 0; i<100 ; i++) {
			int x = (int)(Math.random()*100);
			int y = (int)(Math.random()*100);
			
			System.out.println(x+"+" + y + "=");
			int result = input.nextInt();
			
			if(y+x==result) {
				System.out.println("정답");
				
			} else {
				System.out.println("땡");
			}
		}
		 
		
	}

}
