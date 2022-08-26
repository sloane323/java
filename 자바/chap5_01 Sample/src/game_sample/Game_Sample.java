package game_sample;

import java.util.Scanner;

public class Game_Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//제시한 점수가 낮습니다. 
		//제시한 점수가 높습니다. > do 
		
		//정답입니다 > While 
		
		
		Scanner input = new Scanner (System.in);
		int big = 0;
		int n=0;

		do {
			 System.out.println("수를 입력하세요"); 
			big = input.nextInt();

			 
		 
		 if (big < 59) 
		 { System.out.println("크다");
			}
		 else if (big > 59)
		 System.out.println
		 ("작다");
		
		 n++;
			
	
	}	while (big != 59);
		 System.out.println("정답입니다");
			System.out.println("59" + "끝");
			System.out.println( n + "번만에 성공!");}
		
	
		}

