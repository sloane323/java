package aug16_SampleArray;

import java.util.Scanner;

public class BookPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		  
		  Book book1 = new Book ("홍길동전" , "허균", 100, false);
		  
		  System.out.println(book1.getCheckOut()); book1.ischeckout();
		  book1.printBook();
		 
		  
		 /*
		 * System.out.
		 * println("1. 전체 책 개수 확인 2. 전체 책정보 출력 3. 인덱스를 이용하여 책 대여/반납 4. 책 추가 0. 종료 ");
		 * 
		 */

		Book[] booklist = new Book[100];
		// 기능 추가 및 반복하기
		

		try (Scanner input = new Scanner(System.in)) {
			while (true) {
				System.out.println("1. 전체 책 개수 확인 2. 전체 책정보 출력 3. 인덱스를 이용하여 책 대여/반납 4. 책 추가 0. 종료 ");

				int option = input.nextInt();
				switch (option) {

				case 1:
					System.out.println("현재 책의 개수는 " + Book.getBookCount() + " 입니다.");
					break;

				case 2:
					for (int i = 0; i < Book.getBookCount(); i++) {
						booklist[i].printBook();
					}
					break;

				case 3:
					System.out.println("책 대여/반납할 인덱스를 적어주세요 :");
					int index = input.nextInt();
					if (index <= 0 && index < Book.getBookCount()) {
						booklist[index].ischeckout();
					} else {
						System.out.println("존재하지 않는 인덱스 입니다.");
					}

					break;

				case 4:
					System.out.println("책 제목과 저자, 쪽수를 작성하세요. ");
					String title = input.next();
					String author = input.next();
					int page = input.nextInt();

					
					booklist[Book.getBookCount()] = new Book(title, author, page);
					System.out.println("책을 추가 하였습니다.");
					break;

				case 0:
					System.out.println("도서정리 프로그램을 정리합니다.");
					
					break;

				}

			}
		}

	}
}
