import java.util.Scanner;

public class chap6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		
		Scanner input = new Scanner (System.in);
		System.out.println("남은 잔액을 입력하세요."); 
		int x = input.nextInt();
		int y = 1300; // 지하철요금 
		
		if (x-y >= 1300 ) 

			while (x-y > 1200 ) 
				
				{ Scanner inputa = new Scanner (System.in); 	
				System.out.println("지하철에 탑승 하시겠습니까? 네:1  아니오:0");
				
				
				int a = inputa.nextInt();
				x = x-y ;
				
				if (a==1) {
				System.out.println("탑승하였습니다. 잔액은" + x +"입니다" );
			} 
				
				

				

		if  (x-y < 1300 ) {
			System.out.println("잔액이 부족합니다.");	
			System.out.println("종료되었습니다.");	
			
		}
	
		

	
			}}}