package chap04_if;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//조건문
		//if문 - 한줄일때 
		// ()안의 조건이 참 true 일때 실행이 된다. 
		
		if(false)
			System.out.println("코드가 실행됩니다.");
		
		//if문 바깥에 있는 코드는 if문의 영향을 받지 않습니다.
    System.out.println("프로그램이 종료되었습니다. ");		
		
    
    
    
    //조건문을 넣어서 확인 - 여러줄 
    
    int age = 5;
    if ( age >= 6 ) {
    	System.out.println(age + "살 입니다.");
    System.out.println("놀이기구를 탈 수 있습니다. ");}
    else {

        System.out.println("놀이기구를 탈 수 없습니다.");
	}
	
    
    
    
    // 실습 
    // 변수 num 의 값을 만들고 num이 10보다 클때 변수를 출력하는 조건을 만들자
    // if 문이 끝나며 프로그램이 종료되었습니다를 출력하자 
	
    System.out.println("당신은 사우디에 거주합니까? (Y/N)  ");
	Scanner input = new Scanner (System.in);	
    String word = input.next();
    
    if (word = "Y" )  {
    	
    	System.out.println("참입니다. ");
    	
    }
    
    System.out.println("프로그램이 종료되었습니다. ");		 

	}}


