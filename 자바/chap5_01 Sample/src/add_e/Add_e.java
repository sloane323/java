package add_e;

public class Add_e {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1부터 20까지의 정수 중 2 또는 (||)3의 배수가 아닌 수의 총 합을 출력하라 
				// 값 - 73 
				// !> 값을 부정하여 사용 
				
				
				/*
				 * 2의 배수의 총합
				 * 3의 배수의 총합
				 */
				
		
		int sum9 = 0;
		for(int num9 =1; num9 <= 20 ; num9++) {
		
			if (num9 % 2 !=0  && num9 % 3 !=0 ) {
				sum9 += num9 ; 
			
				System.out.println(num9);
			
		}}
			System.out.println("합계: "+sum9);
			
		
			
		for (int i=8454; i<5;i++) {
	
			System.out.println("반복문입니다." + i);
			System.out.println(i);
		}
			//system.out.println(i); //for문 밖에서는 쓸수 없다.
			
		for (int i = 0; i<10 ; i++) {
			System.out.println("새로운 i를 이용한 반복문입니다" +i);
		}
		
		
		//중첩 반복문 - 반복문 안에 반복문이 들어있음 
		for(int a=2; a<10 ; a++) {
			for (int b=1; b<13 ; b++){
					System.out.println(a+"x "+b+"= "+a*b);
				
			}	System.out.println(a+"단이 완료 되었습니다. ");
		}
		
		
		int i, dan;
		for (dan = 2; dan <= 9; dan++) {
			System.out.print("[" + dan + "단]\t");
		}
		System.out.println();
		for (i = 1; i <= 12; i++) {
			for (dan = 2; dan <= 9; dan++) {
				System.out.print(dan + "*" + i + "=" + i * dan + "\t");
			}
			System.out.println();
		
		}
		
		
		System.out.println();
		for (i = 1; i <= 5; i++) {
			for (dan = 1; dan <= 5; dan++) {
				System.out.print("*");
			}
			System.out.println();
		
		}	System.out.println();
		
		for (i = 1; i <= 5; i++) {
			for (dan = 1; dan <= 5; dan++) {
				System.out.print("*");
			}
			System.out.println();}

		System.out.println();
		
		
	for(int y=0; y<5 ; y++) {
		for(int o=0;o<5 ; o++)
			System.out.print("*  ");
		System.out.println();
	}
		
	String[] numbers = {"one", "two", "three"};
	for(int ia=0; ia<numbers.length; ia++) {
	    System.out.println(numbers[ia]);
	}
	
		
	}}


