package interface_ex1;

import java.util.Scanner;

public class ScoresMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scores[] scorelist = { new Scores(80,20,60), 
				new Scores(70,70,70),new Scores(80,90,80),
				new Scores(60,80,30),new Scores(40,60,70)};
		
		for (int b = 0; b<scorelist.length; b++) {
			System.out.println
			((b+1) + "번 평균 : "+ scorelist[b].arvg()+" ");
		}
		
	
		
			MiddleSchoolScore a = new MiddleSchoolScore("홍길동",70,80,90);
			System.out.println(a.arvg());
			a.printArvg();

		


			    Scanner printin = new Scanner(System.in);
			    int c = printin.nextInt();
			    int b = printin.nextInt();
			    System.out.println(c * b);
			  
			
	}
		
	}








