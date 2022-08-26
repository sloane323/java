package next_sample;

import java.util.Scanner;

import javax.print.DocFlavor.INPUT_STREAM;

public class Next_Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//for 문
		//for (초기화; 조건식; 증감계산 )
		/*for 
		(int num6 = 1; num6<=4 ; num6++) {
			System.out.println(num6); 
		}*/
		/*
		for 
		(int bob = 9; bob<=10 ; bob++) {
			System.out.println(-(bob*56/5));
		}
		
		*/
		
		
		Scanner input = new Scanner (System.in);		int n=0;
		String hell = "Saudi";

		
		
		do {

			System.out.println("지옥은 어디? 지옥으로가버렷!");
			hell = input.next();		
			n++;
			
		if ( hell.equals("바라카"))
		{	
			System.out.
			println("땡");
			
			
			System.out.println(n+"번 시도");
		}
		else if  ( hell.equals("dubai"))
		{
			System.out.println("메롱메롱 다시도전하세요");
			}
		}
	
		
		
		while (!hell.equals("사우디"));
		System.out.println(n+"번만의 성공!");
		
		
		
		
	}
	
}



