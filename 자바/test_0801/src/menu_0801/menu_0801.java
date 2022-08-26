package menu_0801;

import java.util.Scanner;

public class menu_0801 {

	public static void main(String[] args) {
	Scanner input = new Scanner (System.in);

		int menu = 0;
		while (menu <4) 
			
		{
		System.out.println("메뉴를 선택해주세요 [1]짜장 [2]짬뽕 [3]탕수육 [0]종료");
		menu = input.nextInt();
  
        switch (menu) {
        case 1:
            System.out.print("짜장을 선택했습니다.");
            break;
        case 2:
            System.out.print("짬뽕을 선택했습니다.");
            break;
        case 3:
        	
            System.out.print("탕수육을 선택했습니다.");
            break;
        default:
            System.out.println("종료되었습니다.");
            break;

            
          
        }   
        if (menu == 0) {
            System.out.println("종료되었습니다.");
		}
  
	
		
	}}
		
	}
