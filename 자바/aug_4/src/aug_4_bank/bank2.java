package aug_4_bank;

import java.util.Scanner;

public class bank2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 통장 확인 프로그램
		// 기능을 선택하고 금액을 입력하면
		// 입금 출금 송금이 가능합니다.

		// 변수 : 통장 = 가지고 있는 금액
		// 입금 : 통장에 적은 금액을 추가함
		// 아래 기능의 조건 ( 통장의 금액이 입력한 금액보다 클때 )
		// 출금 : 통장에 입력한 금액을 감소함
		// 송금 : 통장에 입력한 금액을 감소
		// + 어디로 보낼건지를 입력 받고 안내함
		/*
		 * Scanner input = new Scanner(System.in);
		 * 
		 * 
		 * String pw = "0000";
		 * 
		 * System.out.println("안녕하세요. 홀리은행 입니다."); System.out.println("당신의 아이디를 알려주세요");
		 * String id = input.next();
		 * 
		 * 
		 * System.out.println("당신의 아이디는 < "+ id +" > 입니다. 맞으면 1번 틀리면 2번을 눌러주세요. "); int
		 * idcheck = input.nextInt();
		 * 
		 * while (idcheck !=0) { if (idcheck == 1 ) {
		 * System.out.println("비밀번호를 입력해주세요 "); } else if (idcheck==2) {
		 * System.out.println("당신의 아이디를 다시 입력해주세요."); } }
		 * 
		 * System.out.println("로그인 되었습니다. " + id + " 님 어서오세요.");
		 * 
		 */

		// 2차원배열
		// 2차원 배열의 선언과 생성
		/*
		 * 
		 * int[][] numArray = new int [10][5]; // 내용 확인을 위해 중첩 반복문 사용 int count = 1; for
		 * (int i =0; i<7; i++) { for (int z=0;z<5;z++) { numArray[i][z]=count; count++;
		 * System.out.print(numArray[i][z] + " "); } System.out.println(); }
		 * 
		 * numArray[0][0] = 100; System.out.println("v종료v");
		 * 
		 * 
		 * //2차원 배열 초기화
		 * 
		 * int [][] word = {{10,20,30},{40,50,60},{70,80,90}};
		 * 
		 * for (int i =0; i<tableArray.length ; i++) { for(int j = 0;
		 * j<tableArray[i].length;j++) { System.out.print(tableArray[i][j]+" ");
		 * 
		 * } System.out.println();
		 * 
		 * }
		 */

		String[][] word2 = { { "chair", "의자" }, { "computer", "컴퓨타" }, { "integer", "정수" } };
		for (int h = 0; h < word2.length; h++) {
			for (int a = 0; a < word2[a].length; a++) {
				System.out.println(word2[h][a] + " ");
			}
		}
		System.out.println();

		// 선택 정렬 코드

		int[] numberSort = { 5, 2, 6, 1 };
		int temp, least;

		for (int i = 0; i < numberSort.length - 1; i++) {
			least = i;
			for (int j = i + 1; j < numberSort.length; j++) {
				// 값들을 하나씩 비교해 가면서 최소값 확인
				if (numberSort[j] < numberSort[least]) {
					least = j;
				}
			}

			// 반복문이 끝난후 가장 작은 값의 위치를 바꿔줌
			temp = numberSort[i];// 첫번째의 값을 저장
			// 첫번째 자리에 가장 작은 값 할당
			numberSort[i] = numberSort[least];
			numberSort[least] = temp;
		}

	}

}
