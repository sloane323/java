package aug_4;

import java.util.Scanner;

public class RandomNames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		double random=Math.random();

		
		
		Scanner input = new Scanner(System.in);
		System.out.println("메뉴를 선택해 주세요 1.일식 2.양식 3.중식 4.분식 0.취소");
		int num = input.nextInt();
		while (num !=0) {
			
			if (num == 1 ) {
				System.out.println("일식을 선택 하였습니다.");
				String[] jp = {"초밥", "우동","소바","라면","미소국","장아찌"};	
				int num2 = (int)Math.round(random * (jp.length-1));
				System.out.println(jp[num2]);
			}
			else if (num==2) {
				System.out.println("양식을 선택 하였습니다.");
				String[] am = {"스테이크", "스파게티","파스타","토스트","샐러드","리조또"};	
				int num3 = (int)Math.round(random * (am.length-1));
				System.out.println(am[num3]);
			}
			else if (num==3) {
				System.out.println("중식을 선택하였습니다.");
				String[] ch = {"자장면", "짬뽕","볶음밥","유산슬","탕수육","라조육"};	
				int num4 = (int)Math.round(random * (ch.length-1));
				System.out.println(ch[num4]);
			}
			else if (num==4) {
				System.out.println("분식을 선택하였습니다.");
				String[] hom = {"떡볶이", "김밥","라면","튀김","순대","어묵"};	
				int num5 = (int)Math.round(random * (hom.length-1));
				System.out.println(hom[num5]);
			}
			
			System.out.println("메뉴를 선택해 주세요 1.일식 2.양식 3.중식 4.분식 5.취소");
			num = input.nextInt();
		}
		System.out.println("종료되었습니다");
		
		
		
		
		
		
		
		
		
		
		}
		
		
		
	}


