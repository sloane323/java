package chap03_operator;

import stringEx_aug.calVoume;

public class Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//연산자
		//산술연산자와 대입연산자 
		
		int x,y;
		x = 10;
		y = 3;
		
		System.out.println(x+y);
		System.out.println(x-y);
		System.out.println(x*y);
		System.out.println(x/y);  //int 끼리의 나눗셈은 int형으로 나온다 
		System.out.println(x%y);  //int 끼리의 나머지는 int형으로 나온다 

	//대입연산자 오른쪽의 식을 계산한 후에 변수에 대입
	// 계산식이 끝난 후의 값을 할당하기 때문에 int 값에서 double 형으로 변환만 하게된다. 
		
		double sum = x/y ;
		System.out.println(sum+"\n"+"\t" );
		
		
		//자료형 중 int 를 사용하여 변수 sum1 을 선언하고 10+20+30+40+50의 값을 할당 또는 초기화 하세요
		
		int sum1 = 10+20+30+40+50 ; 
		System.out.println(sum1);
		
		
		//자료형 중 int 를 사용하여 변수mult1 을 선언하고 10*20*30*40의 값을 할당 또는 초기화 하세요
		
		int multi1 = 10*20*30*40 ; 
		System.out.println(multi1);		
		
		
		//자료형 중 int 를 사용하여 변수 sum2 를 선언하고 10*(20+30)+40의 값을 할당 또는 초기화 하세요
		
		int sum2 = 10*(20+30)+40 ; 
		System.out.println(sum2);	
		
		
		int sp1,mult1, sp2 ; 
		sp1 = 10+20+30+40+50 ; 
		multi1 = 10*20*30*40 ;
		sp2 = 10*(20+30)+40 ;
		
		System.out.println(sp1);
		System.out.println(multi1);		
		System.out.println(sp2);	

	
		//int result, resultRest을 만들고 80/3, 80%3의 결과를 확인해보자
		//double resultDuble; 를 만들고 80.0/3.0의 결과를 확인해보자 
		
		//실습 산술 연산자2
		
		int result,resultRest;
		result=80/3 ;
		resultRest=80%3 ; 
		
		System.out.println(result); // 몫 26
		System.out.println(resultRest); // 나머지 2
		System.out.println(26*3+2); //80이 나오므로 계산 확인. 
		
		//나머지 연산자의 계산결과의 특징 %
		/*항상 정수 
		 *값의 범위가 정해져있다 (0~나누는 수)
		 */
		
		double resultDouble = 80.0/3.0 ; 
		System.out.println(resultDouble); //소수점 자리까지 나옴 
		
		// int x = 30.0/20+30-10*2
		// int x = 30/20+(30-10)*2
		
		
		//실습 연산자 결합규칙 
		
		System.out.println(30.0/20+30-10*2);
		System.out.println(30/20+(30-10)*2); // 괄호를 통해서 계산 순서가 바뀌었기 때문에 
		
		
		// 단항연산자 
		
		int a = +10; // +를 븥여서 양수 (붙이지 않아도 양수)
		int b = -10; // -를 붙여서 음수
		
		System.out.println(a);
		System.out.println(b);
		
		// 전위 단항 연산자 (++,--) 연산을 하기 전 1증가, 감소를 한
		
		int c = ++a ; // 변수(a)앞에 사용해서 a 값이 증가한다 
		int d = --b ;
		
		System.out.println(c);
		System.out.println(d);
		
		++a; // a의 값이 1 증가 : 12 
		System.out.println(a);
		
		
		--a;// a의 값이 1 감소 :11
		System.out.println(a);
		
		
		
		//후위 단항 연산자 
		// 모든 연산이 끝난 후에 1증가, 1감소 시킨다 
		
		int e = a++; 
		System.out.println(e); // 11: 값을 증가 시키기 전에 들어간 값
		System.out.println(a); // 12 : 이후에 1을 증가시킴
		 
	a++; // a의 값이 1 증가함 : 13 
	System.out.println(a);
		
		
	//실습 단항 연산자
	
	//int minusX = 1;
	//int minusY = 1;
	//system.out.println(minusX--)와
	//system.out.println(minusY)을 출력하고
	//확인한 후 각각 minusX,minusY를 출력해보자 
	
	
	int minusX = 1;
	int minusY = 1;
	
	//후위연산자를 사용해서 먼저 값이 출력된 후에 1일 감소한다 
	System.out.println(minusX--); //1
	// 전위연산자를 사용해서 값을 1 감소한 후에 출력된다 
	System.out.println(--minusY); //0 
	
	System.out.println(minusX);
	System.out.println(minusY);
	
	
	//복합 대입 연산자 
	// 동일한 변수 안에서 값을 바꿔서 혹은 계산해서 사용 할때, 쓰는 방법 
	
	// 10,20,30,40 더해서 결과값 확인하기 //한꺼번에 더해서 계산 하는 방법 
	
	// 만약에 한꺼번에 계산 할 수 없고, 한 코드가 끝날때 그 값을 추가해서 더해야 하는 경우, 
	
	int sum6 = 0; //처음값 
	// sum6 = 10 ; // sum3에 값이 대입해서 들어감 (할당) 
	sum6 = sum6 + 10; //0 (sum6) + 10 
	sum6=sum6+20;//10(sum6) + 20
	sum6=sum6+30;//30 + 30  : 60
	sum6=sum6+40;//60(sum6)+40 : 100
	
	
	System.out.println(sum6+10);
	
	
	
	//복합대입연산자 사용방법

	//복합대입연산자 사용 방법 (*=, /= , %=, +=, -=) 
	int mult2=1;
	//mult2=mult2*10;
	mult2*=10 ; //곱셈과 대입 연산자를 복합해서 사용 
	System.out.println(mult2);
	
	//실습 복합 대입 연산자 
	// int sum4 = 0,
	//sum4 = sum4+10 식을 복합 대입 연산자를 이용하여 계산 한 후, sum4의 값을 출력하자 
	
	int sum4 = 0;
			sum4 += 10;
		System.out.println(sum4);
	
	
	//int mult3 = 1;
	//mult3 = 1;
	//mult3 = mult3*20 식을 복합 대입 연산자를 이용하여 계산 한 후, mult3 값을 출력하자 
	
	
		int mult3 = 1;
		mult3 *= 20;
	System.out.println(mult3);

	
	//관계연산자 (==, !=,>,<,>=,=<)
	//관계연산자의 결과값은 항상 참 혹은 거짓이다. (boolean 값) 
	
	System.out.println(45==45);
	System.out.println(45!=45);
	System.out.println(45>45);
	System.out.println(45<45);
	System.out.println(45<=45);
	System.out.println(45>=45);
	
	
	//실습
	
	int score = 90;
	System.out.println( score > 60);
	
	
	char ch1 = 'a', ch2 = 'b';

	 a = 48;
	 b = 80;

	System.out.println("== 연산자에 의한 결과 : "+ (ch1 != ch2));
	System.out.println(">= 연산자에 의한 결과 : "+ (ch1 >= ch2));

	
	
	//실습
	// num1=63*4, num2=38*6 값을 넣고 비교 연산자를 이용하여 비교한 결과를 출력해보자
	
	int num1 = 63*4 , num2 = 38*6 ;
	
	System.out.println(num1 == num2);
	System.out.println(num1 != num2);	
	System.out.println(num1 <= num2);	
	System.out.println(num1 >= num2);	
	System.out.println(num1 > num2);	
	System.out.println(num1 < num2);		
	
	System.out.println("\n");		
	
	
	
	//논리 연산자 and && /  or || (shift & \ ) 
	
	// 논리형을 계산하는 연산자 (boolean > true / false ) 를 계산하는 연산자
	
	
	boolean x1 = true;
	boolean y1 = false;
	
	System.out.println(x1 && y1);
	System.out.println(x1 || y1);
	System.out.println(!y1);
	
	
	
	//논리연산자 실습
	
	int x4=20; int y4=40;

	System.out.println(x4 == 20 && y4 ==20);
	System.out.println(x4==20 && y4 == 40);	
	System.out.println(x4==20 || y4==10);	
	System.out.println(x4==10||y4==10);	
	System.out.println(x4==20 && y4 != 10);	
	System.out.println(!(x4==10));	
	
	System.out.println("\n");		

	// new 생성자를 통해서 객체 생성
	// Box (50) 50의 값을 
	
	box mybox2 = new box(50);
	System.out.println(mybox2.calVoume());
	
	
	
	ObjectClass myObjectClass = new ObjectClass();
	ObjectClass S1 = new ObjectClass("흥부");
	
	System.out.println(myObjectClass.name);
	System.out.println(S1.name);

	}
	
	}

}
