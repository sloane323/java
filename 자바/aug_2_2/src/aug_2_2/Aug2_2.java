package aug_2_2;

import java.util.Scanner;

public class Aug2_2 {

	public static void main(String[] args) {
		
		
		//중첩 반복문 확인
		for(int i=1;i<6;i++){
			for(int j=0;j<i;j++){
				System.out.print("*");
			}
			System.out.println("");

		}
		System.out.println("\n");

		//피라미드 모양 별찍기
		for(int i=0;i<4;i++){
			for(int j=0;j<3-i;j++){
				System.out.print(" "); 
			}
			for(int j=0;j<2*i+1;j++){
				System.out.print("*"); 
			}
			System.out.println("");
		} 
		
		System.out.print("\n");
		
		//실습 중첩반복문과 조건
		for(int a=0 ; a<5 ; a++) {
			for(int b=0;b<5;b++) {
				if(a>=b) {
				System.out.print("* ");}
			}
			System.out.println( );
		}
		
		// 가장 안쪽의 반복문을 종료 
		
	}
	

}
