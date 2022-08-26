package array;

import java.util.Scanner;

public class Aarray_test {

	public static void main(String[] args) {

		//배열확인
		
		  int [] numbers; //배열의 참조 변수 선언 
	      numbers = new int[6]; //배열의 객체 생성
	      int[] numbers2 = new int[6]; //배열을 생성
	      int[] numbers3 = numbers2;  //배열의 주소
	      
	      
	      numbers[0]=1; //[](인덱스) 대괄호를 이용하여 배열의 값 접근
	      System.out.println(numbers[1]);
	      
	      //{}를 통해서 값을 바로 입력가능(초기화)
	      int[] scores = {10,20,40,70};
	      int index =0;
	      
	      //[]대괄호를 이용해 배열의 값 접근
	      //[] : 인덱스(0~) : 정수값(변수, 식)
	      numbers[0] =1;
	      System.out.println(scores[index+1]);
	      System.out.println(scores);
	      System.out.println(numbers);
	      System.out.println(numbers2);
	      System.out.println(numbers3); 
	      
	      numbers2[0]=5;
	      System.out.println(numbers2[0]);
	      System.out.println(numbers3[0]);
	      
	      
	      //for 문을 이용한 배열 요소 출력
	      // 배열의 길이를 직접 입력 해 줄수 있지만 length를 사용해서 쓸수 있다. 
	      for (int i=0 ; i < scores .length; i++) {
	    	  System.out.println(scores[i]);
	      }
	      
	      //for-each 루프
	      // 배열안에 있는 요소를 score에 담아서 사용 할 수있다. 
	      // 배열안에 있는 값을 가지고 오는 것이기 때문에 배열의 값을 수정 할수 없다. 
	      for(int score: scores)
	      { score = 10;
	    	  System.out.println(score);
	      }	      
	      for (int i=0; i <scores.length; i++) {
	    	  System.out.println(scores[i]);
	      }
	      System.out.println(
	    		  );
	      
	      /*
	       * 실습1 double 배열 초기화 
	       * 배열에 학생들의 키 저장후 평균 구하기
	       * 
	       * double 배열을 선언후, 학생들의 키 값 5개를 넣어 초기화 한다.
	       * 이후 for 문을 통해 모든 값을 더한후, 학생들의 평균을 구해보
	       * 자.
	       * double[]  height={};
	       * 
	       * {} 중괄호를 통해서 값을 바로 입력 가능 (초기화) 
	       * int [] scores ={10,20,40,70}; 
	       */
	    
	
	      double [] bts = {174.2, 174.4, 177.5, 178.8, 178.5, 178.1, 181.9};
	      double sum = 0;
	      for (int i = 0; i<bts.length ; i++) {
	    	  System.out.println(bts[i]);
	    	  sum += bts[i];
	      }
	    	  
	      System.out.println("bts의 키 평균 : " +sum/bts.length);
	      
	      
	     
	      /*
	       * 실습2
	       * double 배열 초기화
	       * 배열에 scanner 를 통해 체온을 저장 
	       * 
	       * 값을 5개 갖는 double 배열을 선언한후 
	       * for 문과 scanner 를 통해 값을 받아 각 배열에 저장하고 출력하자
	       * 
	       * Scanner input = new Scanner(System.in);
	       * for int i=0;;i++)>i 값을 인덱스 값으로 사용
	       * 단 출력할때 체온이 37도 이상이면 숫자 앞에  (위험) 이라는 문자열이 같이 출력되게 하라 
	       */
	      
	      
	      	Scanner input = new Scanner(System.in);
			System.out.println("체온을 입력하세요");
			int input1 = input.nextInt();
	      
			System.out.println("체온을 입력하세요");
			int input2 = input.nextInt();
			
			System.out.println("체온을 입력하세요");
			int input3 = input.nextInt();
	
			System.out.println("체온을 입력하세요");
			int input4 = input.nextInt();
			
			System.out.println("체온을 입력하세요");
			int input5 = input.nextInt();
			
			 
	      
			double [] temps = { input1, input2, input3, input4, input5 };
	   
	      
	      for (int y = 0; y<temps.length ; y++) {
	    	   if (temps[y] > 39) {
	 	    	  System.out.println("(위험)");
	 	      }
	 	      
	        System.out.println(temps[y]);
	      
	     
	        
	      
	   
	      
	      
	      }}
	   }
	
	
	
	
	




