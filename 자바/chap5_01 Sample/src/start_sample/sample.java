package start_sample;

import java.util.Scanner;

public class sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		
		
		Scanner input = new Scanner(System.in);

		int card = 50000;
		int pay = 1300;
		System.out.println("지하철에 탑승하시겠습니까? 1: 탑승, 2: 취소");
		int getSubway= input.nextInt();
		while (getSubway == 1) {
			if (card >= pay) {
				card-=pay;
				System.out.println("탑승하였습니다. 잔액은"+card +"원 남아있습니다");
			}
			else {
				System.out.println("잔액이 부족합니다.");
			} 
			System.out.println("지하철에 탑승하시겠습니까? 1: 탑승, 2: 취소");
			getSubway= input.nextInt();
		}
		
		
	}		
}