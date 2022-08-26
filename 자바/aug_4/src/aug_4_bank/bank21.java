package aug_4_bank;

import java.util.Scanner;

public class bank21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int cash = 100000;
		int income = 0;
		int spend = 0;

		int incomemenu = 0;

		Scanner input = new Scanner(System.in);
		System.out.println("안녕하세요 홀홀리 은행 입니다.");
		System.out.println("원하시는 기능을 입력해주세요. 1.입금 2.출금 3.송금 0.종료");
		int menu = input.nextInt();
		while (menu != 0) {

			if (menu == 1) {
				if (cash > 0) {
					System.out.println("입금");
					System.out.println("당신의 잔액은 " + cash + "원 입니다");
					System.out.println("얼마를 입금 하시겠습니까? ");
					income = input.nextInt();

					System.out.println(income + "이 맞나요?");

				}
				System.out.println("성공");
				System.out.println("당신의 새로운 잔고는 " + (cash + income) + "원 입니다.");
				break;
			}

			else if (menu == 2) {
				System.out.println("출금");
				System.out.println("당신의 잔액은 " + cash + "원 입니다");
				System.out.println("얼마를 출금 하시겠습니까? ");
				spend = input.nextInt();

				System.out.println(spend + " 맞나요?");
				if (spend < cash) {
					System.out.println("출금 가능합니다. 당신의 현재 잔액은" + (cash - spend) + " 입니다. ");
				} else if (spend > cash) {
					System.out.println("잔액 부족으로 출금이 불가능합니다.다시 입력하세요");
					spend = input.nextInt();
					System.out.println(spend);
				}

				System.out.println("성공");
				System.out.println("당신의 새로운 잔고는 " + (cash - spend) + "원 입니다.");
				System.out.println("감사합니다.");
				break;
			}

			else if (menu == 3) {
				System.out.println("송금");
				System.out.println("당신의 잔액은 " + cash + "원 입니다");
				System.out.println("누구에게 보낼 예정인가요?");
				String id = input.next();
				System.out.println(id + "님께 얼마를 보내시나요? ");
				int sendmoney = input.nextInt();
				if (sendmoney < cash) {
					{
						System.out.println("송금이 가능합니다.");
						System.out.println(id + "님에게 " + sendmoney + "원을 보냅니다.");
						System.out.println("성공");
						System.out.println("당신의 잔액은 " + (cash-sendmoney) + "원 입니다");
						break;
					}
				} else if (sendmoney > cash) {
					System.out.println("잔액 부족으로 송금이 불가능합니다.");
					System.out.println("다시 입력하세요");
					sendmoney = input.nextInt();
					System.out.println(sendmoney);

					System.out.println("성공");
					break;
				}
			}

			System.out.println("감사합니다.");

		}

		System.out.println("홀홀리 은행을 이용해주셔서 감사합니다 사랑합니다 호갱님");
		menu = input.nextInt();

	}
}