package ifelseif;

import java.util.Scanner;

public class Ifelseif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		



// 음수 양수 0 판별하기
/*
	Scanner input3 = new Scanner (System.in);
	System.out.println("숫자를 입력하세요 ") ;
	int code1 = input3.nextInt() ; 
		

	if(code1>0)
	{System.out.println("양수입니다");}
	
	else if (code1 == 0)
	{
		System.out.println("0이지롱");
	}
	
	else
	{System.out.println("음수입니다");}
	
	
	*/
	
	//if else 연속 
	
/*		Scanner input6 = new Scanner (System.in);
		System.out.println("점수를 입력하세요 ") ;
		int code8 = input6.nextInt() ; 
				
	if(code8 >= 90.00)
	{System.out.println("A");
	System.out.println("참잘했어요");}
	
	
	
	
	else if (code8 >= 80.00)
	{
		System.out.println("B");
		System.out.println("삐급감성");
	}
	
	else if (code8 >= 70.00)
	{
		System.out.println("C");
		System.out.println("씨푸라기");
	}
	
	
	else
	{System.out.println("F");
		System.out.println("털털털털");}
	
		*/
	//미세먼지
	
	Scanner input8 = new Scanner (System.in);
	System.out.println(" 미세먼지 값을 지정하세요 ") ;
	int code9 = input8.nextInt() ; 
			
if(code9 > 150)
{
System.out.println("참매우나쁨");}




else if (code9 > 80)
{
	
	System.out.println("나쁨");
}

else if (code9 > 30)
{
	
	System.out.println("보통");
}


else
{
	System.out.println("매우좋음");}

	



	
	}

}
