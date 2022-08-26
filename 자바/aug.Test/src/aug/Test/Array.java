package aug.Test;

public class Array {
	public static void main(String[] args) {

		int[] score = new int[5];
		score = new int[] { 50, 60, 36, 90, 100 };
		System.out.println(score[0]);

		int sumscore = 0;
		int countpass = 0;

		for (int i = 0; i < score.length; i++) {

			if (score[i] >= 60) {

				sumscore += score[i];
				countpass++;

				System.out.println((i + 1) + " 번 합격");
			}

		}
		System.out.println("평균 : " + sumscore / countpass);

	}

	
}
