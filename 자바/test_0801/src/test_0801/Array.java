package test_0801;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * String[] a = { "망고", "복숭이", "자두", "포도", "사과" };
		 * 
		 * for (int b = 0; b < a.length; b++) { System.out.println("당신의 " + a[b] +
		 * "가 있습니다."); }
		 * 
		 * 
		 */

		for (int i = 1; i <= 100; i++) {
			if (i % 3 != 0 && i % 5 != 0) {
				System.out.print(i + " ");
			}
			if (i%10==0) {
				System.out.println();
			}
		}


		
		
		
		
		
	}
}
