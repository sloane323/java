package aug8_1;

import java.util.Random;
import java.util.Scanner;

public class UpDownGame {

	public static void startMent() {
		System.out.println("업다운 게임을 시작합니다. 숫자는 100 아래의 숫자를 골라주세요.");
	}

	public static String UDCheck(int usernum, int comnum) {
		
			String up = "UP";
			String down = "DOWN";
			String correct = "CORRECT!" ;
					
					if (usernum==comnum) return correct;
					if (usernum <comnum) return up;
					if (usernum >comnum) return down;
					return "Out Of Range"; }
	
	
	public static void main(String[] args) {

		Random r = new Random();
		int comnum = r.nextInt(100) + 1; // 1부터 100까지의 난수 발생
		Scanner sc = new Scanner(System.in);
		int cnt = 1;
		String up = "Up";
		String down = "Down";
		String correct = "Correct!";

		startMent();

		for (int i = 0; i < 100; i++) {
			int usernum = sc.nextInt();
			sc.nextLine();
			if (UDCheck(usernum, comnum).equals(correct))
				break; // correct와 글자가 같다면 정답이므로 break
			if (UDCheck(usernum, comnum).equals(up)) {
				System.out.println(up);
				cnt++;
			} else if (UDCheck(usernum, comnum).equals(down)) {
				System.out.println(down);
				cnt++;
			}

		}
		sc.close();
		if (cnt == 1) {
			System.out.println("답 : " + comnum + "\n정답!! 한번에 맞추셨습니다!! 대박!");
		} else {
			System.out.println(cnt + "번 만에 맞추셨습니다!" + " 정답은" + comnum + "! 맞추셨습니다");
		}
		
		RandomUD randomNum = new RandomUD();
		randomNum.start();
		
	}

}