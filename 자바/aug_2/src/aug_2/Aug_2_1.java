package aug_2;

import java.util.Scanner;

public class Aug_2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 값을 입력 받고 값이 2~9 사이의 수이면 국단을 출력
		 * 2~9 사이의 수가 아니면 구구단에 등록된 수가 아닙니다 를 출력
		 */
		
		Scanner input = new Scanner(System.in);
		System.out.println("출력할 단을 입력하세요 2~9");
		int dan = input.nextInt();
		
		if(dan>=2 && dan <=9) {
			//구구단 출력 
			
			
			for(int i=2;i<10;i++) {
				System.out.println(dan+"단 입니다. "+ dan + "X" + i + " = "+ dan*i);
			}
			
		} else {
			System.out.println("구구단에 등록된 수가 아닙니다.");
		}
		
		
	}

}
