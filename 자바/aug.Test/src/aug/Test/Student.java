package aug.Test;

public class Student {
	
	String name;
	int number;
	int score;
	
	Student() {
		this.name = "홍길동";
		this.number= 0;
		this.score = 0;
	}
	
	Student (String name, int number)
	{
		this.name=name;
		this.number=number;
		this.score =0;
	
	}
	
	void setScore(int score) {
		this.score = score;
	}
	
	int getScore() {
		return this.score;
	}
	
	void printResult() {
		//60점 이상일때 합격
		// 미만일때 불합격 
		
		if (score >= 60) {
			System.out.println(this.name + "님은 합격입니다. ");
		}
		else if (score <= 60) {
			System.out.println(this.name + "님은 불합격입니다. ");
		}
		
	}
	
}
