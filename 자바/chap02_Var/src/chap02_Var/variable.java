package chap02_Var;

public class variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int speed ; // 변수 선언
		long interertRate = 1; //변수 초기화
		int 반복횟수, loop2 ; // 변수 동시선언 
		
		speed = 10; //선언을 한 경우 변수이름에다가 값을 넣음
		반복횟수 = 2;
		loop2 = 20+2;
		
		//변수는 값을 할당 할 때, 마지막에 할당된 값이 들어간다. 
		speed = 0; //위에서는 10이었지만 0의 값을 넣어주었기 때문에 값이 0이 된다 
		
		//변수를 출력하기 위해서는 이름만 작성한다
		
		System.out.println(speed);
		System.out.println(반복횟수);
		System.out.println(loop2);
		

		//실습 정수형 변수 선언 /초기화 하기
		//나이(26), 일자(10), 금액(5000), 개수(5), 점수(100)
		
		int age =26 ;
		byte date =10 ;
		int price =5000 ;
		int count =5;
		long score =100 ; 
		

		
		System.out.print("Age : ");
		System.out.println(age);
		System.out.print("Date : ");
		System.out.println(date);
		System.out.print("Price : ");
		System.out.println(price);
		System.out.print("Count : ");
		System.out.println(count);
		System.out.print("Score : ");
		System.out.println(score);
		
		
		
		
		//실습 빛이 지나간 거리가 9760800000000km 일때, 몇일 동안 지나갔는지 구하시오 
		//단 빛의 속도는 300000(km/s) 초속 (0의 개수 5개)
		//거리 = 속력x시간
		//시간 = 거리/속력
		//거리 = 9460800000000,. 속도 300000
		//system.out.println (거리/속도)
		
		
		long absement = 9760800000000L;
		long speed2 =300000L;
		
		System.out.println(absement/speed2);
		
		
		/* 실습 long 변수
		 * 빛이 들어간 거리와 속력  
		 */
		
		long distance =946080000000L; //long 에 값을 넣어줄때 int의 범위를 지난 값은 L을 붙여준다.
		long speedLignt = 30000L ; // 변수는 동일한 이름을 사용 할 수 없다.
		
		System.out.println((distance/speedLignt)/3600); //print메소드 안에 수식을 작성하면 계산하여 출력한다 
		
		/* 반지름이 10인 구의 부피를 구하라
		 * V=4/3.14*반지름의 3제곱 예시 lnt num = 10+10
		 */
		
		double volume = 4/3*3.14d ;
		double radius = 10*10*10D;
		
		System.out.println(volume*radius);
		
		
		//실수실습02 double
		//반지름이 10인 부피를 구하기 
		// 변수의 값에 계산 식도 들어갈 수 있다. 
		
		double volume2 = 4/3 * 3.14 * 10 * 10 * 10 ; 
				System.out.println(volume2);
		// 3.14 값을 double 형에 할당 
				final double PI = 3.1415926535;
				System.out.println(PI);
		
		//기호 상수 - 값을 수정하여 할당할 수 없다.
		// 초기화 값을 바꾸어서 원하는 값을 넣을 수 있다. 
				
				
		//실습 기호상수 final
		// 정육면체의 한변의 길이를 기호상수로 두고 부피를 계산해서 출력하자
				
				final double line2 = 4;
				System.out.println(line2*line2*line2);
				
				
				final double line3 = 6;
				System.out.println(line3*line3*line3);
				
				
				final double line4 = 10;
				System.out.println(line4*line4*line4);
				
	 // 실습 기호상수 final 
	// 정육면체 한변의 길이를 기호 상수로 두고 계산
				final int LINE = 10;
	//변수는 변수끼리 계산한 값도 할당할 수 있다. 
				int V = LINE*LINE*LINE ;
				System.out.println(V);
				
	//실습 논리형 Boolean 논리형 - 참, 거짓 두가지 값만 가지는 자료형 
				boolean isRain = true ; // 0과 같은 정수값은 넣을수 없다. 
				System.out.println(isRain); //false로 출력되지만 boolean 값이다
				
				
	//실습2

			
				
				
	//실습 논리형 참과 거짓만 있다. 비교 연산자 
    int num = 10; 
    boolean check; 
    check = (num>20); // 10>20 : 거짓 
    System.out.println(check);
				
    
    //num 값을 수정해서 check 값을 ture 로 바꾸기 
    num = 30;
    check = (num>20); // 30>20 : 진실 
    System.out.println(check);
				
    
    //문자형과 문자열 
    char ch1='가';
    char ch2='\uac00'; //역슬래쉬(\)는 엑터키 위에 있음
    
    System.out.println(ch2);
    
    //문자열은 String클래스를 이용해서 값을 할당 할수 있다.
    //""쌍따옴표 사용 : 쌍따옴표 안에 있는 모든 글은 문자열 취급
    
    String s = "Hello world!";
    System.out.println(s);
    
    //int를 이용하여 number에 숫자값 10을 할당하세요 
    // boolean 을 이용하여 True 값을 할당하세요
    // Char를 이용하여 a 값을 할당하세요
    // string을 이용하여 hi 값을 할당하세요 
    
    		int num5 = 10;
    		System.out.println(num5);
    		
    		boolean isSunny = true;
    	    System.out.println(isSunny);
    		
    		char char_a = 'a';
    		System.out.println(char_a);
    		
    		String sayHi ="Good Morning \n Everyone!";
    				System.out.println(sayHi);  //변수의 경우는 변소 이름만 넣어서 확인
    				
    // 문자열에 특수문자
    String word2 = "\"\'줄바꿈"+"\n"+"​둘이 같이 가고 있는 줄 알았는데\n"
    		+ "문득 정신 차려 보니\n"
    		+ "혼자 걷고 있습니다";
   System.out.println(word2);
    					
    // 쌍따옴표가 들어간 "Hello World" 를 출력해보자 
   
   String morning = "\"Hello \n World\"" ;
   System.out.println(morning);
   
   
    
   /*
    * 형변환 
    * 축소 변환 : 실수 > 정수 double > int 데이터가 사라질 수 있다.  ( 소수점 이하 사라짐) 
    * 확대 변환 : int > double 
    */
   
    
    System.out.println("\n"+"축소변환");
    int i = (int) 10.6;
    System.out.println(i);
    
    System.out.println("확대변환");
    double d = (double) 5000;
    System.out.println(d);
   
    
    
    
    /*
     * 확대 변환을 사용하여 238/5의 결과가 소수점 아래 자리까지 출력될 수 있도록 하자.
     * (double)328/5
     * (double)328/(double)5
     * (int)32.8/5
     */
    

    double a = (double) 328 ;
    double b = (double)5;
    int aa = (int) 5;
    int bb = (int) 32.8;
    
    System.out.println(328/5); //65
    System.out.println(a/b);
    System.out.println(bb/aa);
    
    System.out.println(328/5); //65    
    System.out.println((double)328/5); //65.6 double / int > double 형으로 출력 ( 더 큰 쪽에 맞춤 )
    System.out.println((double)328/(double)5); // 65.5 double / double > double 형으로 출력 
    System.out.println((int)328/5);     
    System.out.println(328.0/5); // 하나라도 실수형이면 실수형으로 출력된다 
   System.out.println((int)32.8/5); //실수가 int 로 강제로 정수가 되었기 때문에 정수로 표시됩니다 
    
   
   //대입연사
   int x,y; 
   x = 6 ;
   y = x*x-5*x+6;
   System.out.println(y);
   
   
   
   
	}

}
