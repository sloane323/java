package Ex;

public class People {

	public String name;
	public String gender;
	public int age;
	
	
	public  People() {
		this.name="홍길동";
		this.gender="남";
		this.age=20;

	}
	
	public  People (String name, String gender, int age) {
		this.name=name;
		this.gender=gender;
		this.age=age;
	}
	
	
	public String getname() {
		return this.name;
	}
	
	public String getgender() {
		return this.gender;
	}
	
	public int getage() {
		return this.age;
	}
	
	public void setPeople(String name, String gender, int age) {
		this.name=getname();
		this.gender=getgender();
		this.age=getage();
		
		System.out.println("이름 : "+getname() + 
				"  성별 : "+ getgender()  +"나이 : " + getage() );
	}
	
	
	// 네임을 출력하는 메소드 
	public void selfIntro () {
		System.out.println(name + "입니다.");
	}
	
	//클래스를 상속받지 않을때 Object 클래스를 상속받는다 
	// 필요하다면 Override 를 통해 내용을 수정해서 사용할 수 있다. 
	
	
	@Override
	public boolean equals(Object object) {
		
		// 오브젝트 객체로 받아오는 경우 클래스를 구분하여 사용
		// .getClass().getName() 를 이용하여 구분 
		System.out.println("people의 내용이 출력되었습니다. ");
		return true;
	}
	
	// 동일한 이름을 갖는 중복정의가 됨.
	


}


