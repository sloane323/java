package test_0801;

public class ArrayAvg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] num = { 40,60,80,100,70};
		int sum =0, avg=0;
	
		
		for(int a:num ) {
			sum+=a;
		} avg=sum/num.length;
		System.out.println("평균 - "+avg  );
		System.out.println("평균보다 큰수 - ");
		for (int a:num) {
			if (a>avg) {
				System.out.println(a+" ");
			}
		}

	}
}


