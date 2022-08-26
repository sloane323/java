package stringEx_aug;

import java.util.Scanner;

public class stringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 문자열을 작성하고, for 문을 통해서 출력하기

		// 실습2 String 클라스의 메소드 concat()
		// while 문을 통해 입력받은 문자열을 allWord라는 변수에 이어서 붙이는 프로그램을 만든후,
		// 종료를 입력받으면 반복문을 빠져나와 allWord에 들어간 문자열을 출력한다.
		// .concat()// 원래 문자열에 영향을 주지 않음

		/*
		 * Scanner input = new Scanner(System.in); String allWord = "" ; String
		 * inputWord = "" ;
		 * 
		 * 
		 * while (!(inputWord.equals("ends")) ) { System.out.
		 * println("Good Morning. Enter your favorite word. if you want end the system, put ends"
		 * ); inputWord = input.next(); // allWord = allWord + inputWord 와 동일한 결과
		 * allWord = allWord.concat(inputWord + " "); }
		 * 
		 * 
		 * System.out.println("저장되었습니다. "+allWord); Scanner input = new
		 * Scanner(System.in);
		 */

		// 실습 4 Srting 클래스의 메소드 replace()
		// 이름을 입력받고 가운데 값을 *로 대체하는 프로그램을 만들자.
		// String s="홍길동"
		// s.replace('길','*')
		// charAt()을 인덱스를 이용하여 글자를 찾을수 있음

		Scanner input = new Scanner(System.in);

		String s = "김흥부";
		String name = "";

		System.out.println("이름을 입력해주세요");
		name = input.next();

		char middle = name.charAt(1);
		System.out.println(middle);
		System.out.println(name.replace(middle, '*'));

		// 랩퍼 클래스 : 기초자료형을 참조형 ( 객체)로 포장하는 클래스 
		
		int num = 10;  // 메소드를 쓸수 없음
		// 랩퍼 클래스를 사용하면 메소드를 쓸수 없음 
		Integer objNum = new Integer (10);
		System.out.println(objNum.equals(0));
		System.out.println(objNum == 10);
		//integer에서 메소드를 사용할 수 있다. 
		num=Integer.parseInt("5");
		System.out.println(num+3);
		
		// parse를 사용하면 문자열을 기초 자료형으로 바꿀수 있다 
		double objDouble = Double.parseDouble("0.5");
		System.out.println(objDouble+0.1);
		
		// 랩퍼클래스를 이용해서 문자열로 바꿔줄수 있다. 
		String doubleNum = Double.toString(0.5);
		System.out.println(doubleNum+0.1);
		
		
		
		//실습 integer.parselnt() 
		// scanner 클래스를 이용하여 생일값 (0101)
		// integer 클래스의 parselnt() 를 사용하여 
		// 입력받은 문자열을 정수로 바꿔 저장하자 
		
		//int z = integer.parselnt ("12" )
		//Stringz1 = integer.toString(123);
		
		
		String birthday = "1206";
		System.out.println(birthday);
		//전체를 숫자로 바꿈
		// 달과 일을 잘라서 숫자로 바꿔야 함
		int birthdayNum = Integer.parseInt (birthday);
		System.out.println(birthdayNum);
		int birthdaymonth 
		= Integer.parseInt (birthday.substring(0,2));
		System.out.println(birthdaymonth);
		int birthdayday
		= Integer.parseInt (birthday.substring(2,4));
		
		System.out.println(birthdayday);
		
		System.out.println(birthdaymonth + "월 "+ birthdayday + "일 ");
		
		
		
		
		
		
	}
	

}
