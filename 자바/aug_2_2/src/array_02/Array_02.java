package array_02;

import java.util.Scanner;

public class Array_02 {

	public static void main(String[] args) {
		
		
		//연습용
		
	/*
	 * String 배열 
	 * 배열안의 문자와 비교하여 출력하기
	 * 
	 * string 배열은 바나나,딸기,포도,사과,키위로 초기화 한다
	 * scanner 이용하여 과일을 입력받고
	 * 배열안에 있는 과일이면 "(과일이름)이 있습니다" 를 출력 하고 
	 * 아니면 없습니다 라고 출력하자
	 * 
	 * 배열안의 값을 전부 비교 equals()
	 */
		
		Scanner input = new Scanner (System.in);
		
		  //실습.
	      // 과일명을 입력받아 목록의 과일과 비교하기
	      String[] fruits = {"바나나", "딸기", "포도", "사과", "키위"};
	      System.out.print("과일명을 입력하세요: ");
	      String fruitInput = input.next();
	      
	      for(int i=0; i<fruits.length; i++) {
	         //입력받은 값fruitsInput과 배열을 for문으로 하나씩 비교
	         if(fruitInput.equals(fruits[i])) {
	        	  System.out.println(fruitInput+" 이(가) 있습니다");
	            break; //값을 찾았다면 반복할 필요 없음
	         } 
	      }
	      
		
		 //있는지 없는지를 확인하는 for문
	      
	      System.out.print("과일명을 입력하세요: ");
	      String fruitInput2 = input.next();

	      boolean isFruit = false;
	      for (int i =0; i < fruits.length; i++) {
	         // 입력받은 값과 for문으로 배열을 하나씩 비교
	         if(fruitInput2.equals(fruits[i])) {
	            isFruit = true;    //값이 있다면 true로 바꿈
	            break;
	         }
	      }
	      if (isFruit) {
	         System.out.println(fruitInput2+" 있습니다.");
	      } else {
	         System.out.println("없습니다");
	      }
	      
	}}

