package chap07_02_Array;

import java.util.Scanner;

import chap07_02_getSet.AnimalCard;

public class AnimalCardArray {

	private static int i;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//System.out.println(AnimalCard.getCardCount());
		AnimalCard[] Cards = new AnimalCard[AnimalCard.MAX_CARD];
		
		Cards[AnimalCard.getCardCount()] = new AnimalCard();
		Cards[AnimalCard.getCardCount()] = new AnimalCard();		
		
		// 진료카드 만들기 콘솔 
				// 1. 선택을 통해서 내용 확인
				// 2. 진료카드의 갯수 > 진료카드의 내용확인  > 진료카드 작성 > 종료 
				// 3. 카드의 갯수가 100개 일경우 만들수 없음 
		
			
		AnimalCard[] cards=new AnimalCard[AnimalCard.MAX_CARD];
		
		for (int i = 0; i < 99 ; i ++); {
			Cards[i] = new AnimalCard();
		}
		
		
		
		try (Scanner input = new Scanner(System.in)) {
			while (true) {
				System.out.println("안녕하세요 홀리네 동물병원입니다. " +
						"1. 진료카드 갯수 2. 진료카드 내용확인 3. 진료카드 작성 0. 종료 ");
				
				int option = input.nextInt();
				if (option==1) {
					
					//진료 카드의 갯수는 
					System.out.println("현재 진료카드는 " +AnimalCard.getCardCount()+"개 입니다.");
					
				}
				
				else if (option ==2 ) {
					// 전체 진료카드는 작성된 진료 카드
					// 배열의 길이가 아니라 현재 작성된 진료카드의 갯수로 확인 해야한다. 
					for (int z = 0; z<AnimalCard.getCardCount()+1 ; z++) {
						cards[z].printAnimalCard();
					}
					
				 // 인덱스 값을 통해서 하나만 확인하는 내용 
					System.out.println("확인 할 진료 카드 인덱스를 적어주세요 : ");
					int index = input.nextInt();
					
					cards[index].printAnimalCard();
					if ( index >= 0 && index < AnimalCard.getCardCount())
					{ System.out.println(); }
					else {
						System.out.println("존재하지 않는 카드입니다. ");
					}
								}
				
				else if (option==3) {
					
					//getCardCount = 99 까지 가능
					// Count 가 100이 되었을때 더이상 추가할 수가 없습니다 출력
					// 아래 내용 실행 하지 않음 ( 진료카드 추가 ) 
					
					if ( AnimalCard.getCardCount() == 100) {
						System.out.println();
					}
					
					
					// 새 진료카드 추가 - 입력 
					System.out.println("동물의 종류와 이름 개월수를 작성하세요 : ");
					String animal = input.next();
					String name = input.next();
					int month = input.nextInt();
					
					cards[AnimalCard.getCardCount()] =
							new AnimalCard(animal,name,month);
					System.out.println("작성이 완료 되었습니다. ");
				}
				
				else if (option == 0 ) {
					System.out.println("진료 카드를 종료 합니다. ");
					break;
				}
			}
		}
				
		
		
		
		
		
		
	}

}
