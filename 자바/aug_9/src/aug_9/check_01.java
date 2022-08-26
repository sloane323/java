package aug_9;

public class check_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] score = new int[5];
		score = new int[] { 50, 60, 36, 90, 100 };
		System.out.println(score[0]);

		int sum1 = 0;
		int count1 = 0;
		
		
		// i 는 반복해줄 값 
		for (int i = 0; i < score.length; i++) {

			
			if (score[i] >= 60) {
			System.out.println((i + 1) + " 번 합격");
			sum1 += score [i];
			count1++ ;
			
			} 
			
		}  System.out.print("합격자 평균: " + sum1/count1);

	


		
		
		
	}

}
