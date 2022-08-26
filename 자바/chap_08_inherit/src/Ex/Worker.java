package Ex;

public class Worker extends People {

	// 필드
	private String job;
	private int careerMonth;

	// 실습
	// 디폴트 생성자 ( 매개변수 X ) 묵시적 호출

	public Worker() {
		this.job = "";
		this.careerMonth = 0;
	}

	// 모든 필드값을 받아오는 생성자 명시적 호출

	public Worker(String name, String Gender, int age, String job, int careerMonth) {

		super(name, Gender, age);
		this.job = job;
		this.careerMonth = careerMonth;
	}

	// 메소드
	public int nextMonth() {
		this.careerMonth++;
		return this.careerMonth;

	}

	// 슈퍼클래스의 메소드를 사용하는 메소드
	// selfIntro를 가져와서 출력하고, 아래 job 입니다 라고 함께 출력하는 메소드

	public void intro() {
		selfIntro();
		System.out.println(job + "일을 하고있습니다.");
	}
	
	
	public boolean equals(Worker worker) {
		if (name==worker.name && gender == worker.gender && age == worker.age && 
				job == worker.job && careerMonth == worker.careerMonth) {
			
		
		return true; }
	
	
	 else {
		return false;
	 }
	 }

	@Override
	public void selfIntro () {
		// name 입니다 job 일을 하고 있습니다. 를 출력 
		
		//equals 메소드를 만들ㅇ서 이름,성별,나이,직업,일한개월이 같을때
		// ture 를 return 하세요 그외는 전부 false return 
		
		
		
	}

}
