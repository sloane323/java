import chap05_while_for.Count;

public class While_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//카운트다운 
		
		/* int countDown = 10;
		while (countDown > 0) {
			System.out.println(countDown);
			countDown--;
		} */ 
		
		//while 을 이용한 반복문
		//1~100 까지
		//전체의 합과  sum 
		// 짝수의 합과 even
		// 홀수의 합 odd 를 구해서 출력하시오 
		
		int sum, even, odd;
		int num2 = 1;
		
		sum = 0; 
		even = 0;
		odd = 0;
		
		
		while (num2 <= 100 )
		{
			//전체의 합
			
			sum += num2; 
			
			// 짝수의 합
			
			if (num2 % 2 == 0)
			{ even += num2;}
	
			
			else {		// 홀수의 합
				 odd += num2;
			

			}
			
	
			
			
		
		num2 ++;
		
		}
	
		// 반복이 끝난 후에 확인을 하려면 while 문 바깥에 print 를 넣어 줍니다. 
		System.out.println(sum);
		System.out.println(even);
		System.out.println(odd);

	}


}



