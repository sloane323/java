package sample_aug2;

import java.util.Scanner;

public class Sample_aug2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//for - continue 
				//1부터 30까지 출력할때 3의 배수는 건너뛰고 출력하시오 
				
				for(int h=1 ; h<30;h++) {
					if(h % 3 == 0) {
						continue; 
					}
					System.out.println(h);
				}
		
		
				
				int count = 1;
				for(int i =1;i<=100;i++) {
					if(i%3==0) {
						System.out.println(count + "번째 3의 배수 : "+ i);
						count +=1;
					}
				}
				
	
	}
	

}
