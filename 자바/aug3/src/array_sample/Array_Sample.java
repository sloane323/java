package array_sample;

import java.util.Scanner;

public class Array_Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		// 28,28,27,27,25,25,24,30,31,50
		/*
		 * 
		 * int[] bts = new int[7]; bts = new int[] {28,28,27,27,25,25,24};
		 * System.out.println(bts[3]);
		 * 
		 * 
		 * String[] bts2 = new String[7]; bts2 = new String []
		 * {"진","슈가","제이홉","RM","지민","뷔","정국"}; System.out.println(bts2[1]);
		 * 
		 * 
		 * System.out.print("학생의 수를 입력하세요: "); int count = input.nextInt(); int[] age=
		 * new int[count];
		 * 
		 * for ( int i=0; i<count ;i++ ) { System.out.print((i+1)+"번째 나이를 입력해주세요");
		 * age[i] = input.nextInt();
		 * 
		 * } for (int score: age ) { if (score <= 32 || score <= 20 ) {
		 * System.out.println("나이가 " + (score+5) +"살 사람은 청년입니다"); } else {
		 * System.out.println("안녕히가세요"); }
		 * 
		 * }
		 * 
		 */ // int
		int[] no = new int[10];
		no = new int[] { 88, 58, 47, 69, 50, 72, 87, 90, 84, 95 };
		System.out.println(no[0]);
		no[0] = 91;
		System.out.println(no[0]);

		// String
		String[] story = new String[10];
		story = new String[] { "홍길동", "흥부", "놀부", "콩쥐", "팥쥐", "장화", "홍련", "심청", "춘향", "이순신" };
		System.out.println(story[9]);
		story[9] = "RM";
		System.out.println(story[9]);

		// boolean
		boolean[] go = new boolean[10];
		go = new boolean[] { false, true, true, false, true, false, false, false, false, false };

		System.out.println(go[1]);
		go[1] = false;
		System.out.println(go[1]);

		// 출력하기 예시1

		int[] ha = new int[10];
		ha = new int[] { 88, 58, 47, 69, 50, 72, 87, 90, 84, 95 };
		System.out.println("당신의 점수 " + ha[1] + " 입니다");

		// String 출력하기 예시
		String[] story2 = new String[10];
		story2 = new String[] { "홍길동", "흥부", "놀부", "콩쥐", "팥쥐", "장화", "홍련", "심청", "춘향", "이순신" };
		System.out.println("당신의 캐릭터 이름은 " + story2[9] + "님 입니다");

		// boolean 출력하기 예시
		boolean[] go2 = new boolean[10];
		go2 = new boolean[] { false, true, true, false, true, false, false, false, false, false };

		System.out.println("정답은 " + !go2[1]);

		// for 문을 이용하여 조건 검색

		int[] ha2 = new int[0];
		ha2 = new int[] { 88, 58, 47, 69, 50, 72, 87, 90, 84, 95 };
		// System.out.println("당신의 점수 "+(ha2[1]+5)+" 입니다");

		for (int i = 0; i < ha2.length; i++) {
			System.out.println((i + 5) + "번째 - " + ha2[i] + " ");
		}

		System.out.println("-----------");

		// String for 문으로 전체 출력하기
		String[] story3 = new String[10];
		story3 = new String[] { "홍길동", "흥부", "놀부", "콩쥐", "팥쥐", "장화", "홍련", "심청", "춘향", "이순신" };
		// System.out.println("당신의 캐릭터 이름은 "+story3[9]+"님 입니다");
		for (int t = 0; t < story3.length; t++) {
			System.out.println(story3[t]);
		}

		System.out.println("-----------");

		// boolean for 문으로 전체 반대로 출력하기
		boolean[] go3 = new boolean[10];
		go3 = new boolean[] { false, true, true, false, true, false, false, false, false, false };
		for (int z = 0; z < story3.length; z++) {
			System.out.println("정답은 " + !go3[z]);
		}

		System.out.println("-----------");

		// 배열과 반복문과 조건문

		int[] ha3 = new int[0];
		ha3 = new int[] { 88, 58, 47, 69, 50, 72, 87, 90, 84, 95 };
		double sum = 0;
		{
			for (int u = 0; u < ha3.length; u++) {
				// System.out.println(ha3.length);
				System.out.println(ha3[u]);
				sum += ha3[u];
			}

			System.out.println("평균 : " + sum / ha3.length);
			System.out.println("-----------");
			sum = 0;
			int yy = 0;

			
			for (int bb : ha3) {
				if (bb > 80) {
					System.out.println(bb);
					sum += bb;
					yy++;
				}
			}
			System.out.println("평균 : " + sum / yy);
		}

		System.out.println("-----------");

		// 콩쥐 확인하기

		String[] story4 = new String[10];
		story4 = new String[] { "홍길동", "흥부", "놀부", "콩쥐", "팥쥐", "장화", "홍련", "심청", "춘향", "이순신" };

		for (int t = 0; t < story3.length; t++) {

			System.out.println("당신의 캐릭터 이름은 " + story4[t] + "님 입니다");

			if (story4[t] == "콩쥐") {
				System.out.println((t + 1) + "번째에서    찾았다.이년!");
				System.out.println("-----------");
			}
		}

		System.out.println("-----------");

		// 합격 여부 배열의 true인 개수 출력

		boolean[] go4 = new boolean[10];
		go4 = new boolean[] { false, true, true, false, true, false, false, false, false, false };

		int count = 0;
		for (int j = 0; j < go4.length; j++) {
			if (go4[j] == true) {
				// System.out.println("참");
				count++;
			}

		}
		System.out.println("true의 개수는 " + count);

		// 콩쥐 확인하기2

		String[] story5 = new String[10];
		story5 = new String[] { "홍길동", "흥부", "놀부", "콩쥐", "팥쥐", "장화", "홍련", "심청", "춘향", "이순신" };

		for (int ttt = 0; ttt < story5.length; ttt++) {
			//System.out.println(story5[ttt]);
			//System.out.println("-----------"); 
			
			//if (story5[ttt] == "콩쥐") {
			//	System.out.println((ttt + 1) + "번째에서    찾았다.이년!");
				 	if (story5[ttt].contains("콩쥐"))
					 System.out.println("콩쥐  "+ (ttt + 1) + "번째에서  찾았다.이년!"); }
			

			System.out.println("-----------");
			
			
			
			
			// 진 찾기 

			String[] story6 = new String[12];
			story6 = new String[] { "홀리/두바이", "폭진.지옥아래", "쌍봉낙타.UAE.덜렁이.건설", "츄부장님.바라카토지신", "캡틴큐/M/Barakha/euboo", "K노비/쿠웨이트/복세편살", "고메봇.바라카편의점.AI", "고우/바레인", "가기셋/5호실/내동댕이", "달빛/카타르" ,"돌아온 야생이니/이랔","둥둥/스리슬쩍 "};

			for (int tttt = 0; tttt < story6.length; tttt++) {
				//System.out.println(story6[tttt]);
				//System.out.println("-----------"); 
				
				//if (story6[tttt] == "콩쥐") {
				//	System.out.println((tttt + 1) + "번째에서    찾았다.이년!");
					 	if (story6[tttt].contains("폭진.지옥아래"))
						 System.out.println("진야드  "+ (tttt + 1) + "번째에서  찾았다."); }
				

				System.out.println("-----------");
			
			
			
			
			

		}
		}

