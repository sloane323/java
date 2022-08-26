package chap03_operatorEx2;

import java.util.Scanner;

public class OperatorEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Scanner input = new Scanner(system.in)
		//input.nextlnt()
		//면적이 1000에 가깝게 되도록 사각형 만들어야 할때, 가로 길이를 입력받으면 세로길이가 출력 될 수있도록 하자.
		//결과는 항상 정수로 출력
		//Scanner는 Ctrl+Space를 통해서 import 할 수있게 된다. 
		
/* 
 * 면적 = 사각형의 넓이 (가로X세로)
 */
			
/*
	*	Scanner input = new Scanner (System.in);
	*	System.out.println("Enter your number : (Below 100) ");
	*	int w = input.nextInt();
	*	int h = 1000/w ;
	*	double doubleH = 1000.0/w;
	*	System.out.println("This is your number  : "+ h);				
	*	System.out.println("This is your number  : "+ doubleH);				
		
	*	System.out.println("\n");	
		
	*	System.out.println("아무값이나 입력해주세요");
	*	String word = input.next();
	*	System.out.println(word+10); // 문자끼리의 + 는 문자의 연결 
		
		*/
		
		
		
		
		
		/*
		 * Scanner input=new Scanner(System.in)
		 * input.next()를 이용하여
		 * 변수 : 이름
		 * "반갑습니다 000님 이 출력될수 있도록 하자
		 * 
		 * 변수 : 체온, 강의실 가 될 수있도록 하자 
		 * 
		 * Scanner input=new Scanner(System.in)
		 * 
		 */
		

		/*System.out.println("이름을 입력해주세요") ;
		
		Scanner input = new Scanner (System.in);
		String name = input.next();
		System.out.println("반갑습니다. "+ name +"님") ;
		
		// 온도를 입력받아 출력 
		
		System.out.println("체온을 입력해주세요");
		double t = input.nextDouble();
		String classNum = "427호" ;
		System.out.println("현재 체온 "+t+"도 입니다. ") ;
		System.out.println(classNum+ "강의실 입니다.");
		
		
		System.out.print
		("\n");	
		System.out.print
		("\n");	*/
		
		
		/*
		 * 놀이기구를 타기 위해서는 6세 이상 키 140 이상이어야 한다. 
		 * int age = 9;
		 * int height = 140;
		 * 
		 * 논리식을 이용하요 탈 수 있는지 아닌지 확인해보자. 
		 * 
		 * >=, && 
		 */
		
		
		Scanner input1 = new Scanner (System.in);
		System.out.println("나이를 입력해주세요 : ") ;
		int age = input1.nextInt() ; 
		
		Scanner input2 = new Scanner (System.in);
		System.out.println("키를 입력해 주세요 : ");
		int height = input2. nextInt();
		
		if (age>= 9 && height >= 140);
		System.out.println ("가능합니다");

		
	}
	
	
	
}


