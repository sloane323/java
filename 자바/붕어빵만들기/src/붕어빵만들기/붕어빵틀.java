package 붕어빵만들기;

public class 붕어빵틀 
	{
		String 앙꼬 = "팥";
		int 가격 = 300;

		붕어빵틀() {
		}

		붕어빵틀(String 앙꼬) {		
			// this: 객체를 가르킴, this.앙꼬: 맴버변수, 앙꼬: 지역변수
			this.앙꼬 = 앙꼬;
		}
		붕어빵틀(String 앙꼬, int 가격) {
			this.앙꼬 = 앙꼬;
			this.가격 = 가격;
			System.out.println("붕어빵이 구워졌어요");
		}

		void 배부르게하다() {
			System.out.println("배불러~");
		}

	}


