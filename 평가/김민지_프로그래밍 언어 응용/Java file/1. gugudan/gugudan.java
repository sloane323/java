package test_0801;

import java.util.Scanner;

public class gugudan {

	public static void main(String[] args) {

		

		
			Scanner input = new Scanner (System.in);
			System.out.println("출력할 단을 입력하세요 (2~9): ");
			int dan= input.nextInt();
			

			  if(dan>=2 && dan<10) {
			        for(int i=2; i<10; i++) {
			           System.out.println(dan+"X"+i+"="+dan*i);  }
			  			}
		
			  
			     else {
			        System.out.println("구구단에 등록된 수가 아닙니다"); }
	
			  
			  
			  System.out.println("끝");
		} 
	}



		
	

	


