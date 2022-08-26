package if_switch_holly;

import java.util.Scanner;

public class if_switch_holly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner input = new Scanner (System.in);
	System.out.println("안녕하세요. 홀리입니다. 오늘의 요일을 알려주세요.");
	System.out.println("sun / mon / tue / wed / thu / fri / sat");
	String number2 = input.next(); 
	
	switch (number2) {
	
	case "mon" :
		System.out.println("두바이");
	break;
	
	case "tue" :
		System.out.println("아부다비");
	break;
	
	case "wed" : 
		System.out.println("제다");	
		break;
		
	case "thu" : 
		System.out.println("오만");	
		break;
		
	case "fri" : 
		System.out.println("바라카");	
		break;
		
	case "sat" : 
		System.out.println("푸제이라");	
		break;
		
	case "sun" : 
		System.out.println("지옥속으로");	
		break;
	default :
		System.out.println("정신차려 이친구야");
		 break;
		
	}
		
		
		
		
		
		
		
		
		
		
		
	}

}
