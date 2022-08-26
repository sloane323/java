import java.util.Scanner;

public class sample_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		//Switch문
		
		int number = 500;
		
		//()안에 비교할 값을 넣는다.
		//비교할 값은 동일한 자료형으로 넣어주어야 한다. 
		
		/* switch (number) {
		case 0: 
			System.out.println("없음");
			 break;
		case 1 :
			System.out.println("하나");
			 break;
		case 2 :
			System.out.println("둘");
			 break;
		case 3 :
			System.out.println("셋");
			 break;
		case 4 :
			System.out.println("넷");
			 break;
		default :
			System.out.println("많음");
			 break;
			 
			 
		} */
		
		
		Scanner input9 = new Scanner (System.in);
		System.out.println("점수를 입력하세요") ;
		int number2 = input9.nextInt() ; 
		
		switch(number2/10) {
		
		case 10 : case 9 :
			System.out.println("A");
			 break;
			 
		case 8 :		case 7 :
			System.out.println("B");
			 break;
			 
		case 6 :		case 5 :
			System.out.println("c");
			 break;
			 
		case 4 :		case 3 :
			System.out.println("d");
			 break;
			 	
			 
		default :
			if ( number2 >=30)
			System.out.println("재수강");
			 break;
			 

		
		}
		
		
		
		
	}

	}


