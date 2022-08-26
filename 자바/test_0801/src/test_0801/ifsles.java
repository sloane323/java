package test_0801;

public class ifsles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//▍조건문
		//1) if- else 
		//- 90 이상은 장학금, 60 이상은 합격, 60 미만은 재시험으로 출력하세요
			
		int score = 80;
		if(score >= 90 ) {
			System.out.println("장학금");
		} else if (score >= 60) {
			System.out.println("합격");
		} else {
			System.out.println("재시험");
		}
		
		
	}

}
