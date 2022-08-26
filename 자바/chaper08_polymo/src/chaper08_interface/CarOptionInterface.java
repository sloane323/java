package chaper08_interface;

//인터페이스의 내용을 가져오고 싶을때 extends 통해 가져올수있다.
//인터페이스의 경우 생성자가 없기 때문에 여러개의 인터페이스를 상속 받을수 있다. 


public interface CarOptionInterface extends carInterface, Days {
	public void carDrive();
	
	// 디폴트 메소드 추가 - 실체가 있는메소드
	// days 에 있는 값을 이용하여 차량이 쉬느 날인지를 확인
	// 숫자값이 들어 왔을때, 그 숫자값에 따라서 쉬는 날을 결정 
	// ex) RestDay(1) > 일요일이 쉬는 날 입니다.
	
	public default void RestDay (int day) {
		String date;
		switch (day) {
		case SUNDAY :
			date = "일요일";
			System.out.println("일요일이 쉬는 날 입니다.");
			break;
		case MONDAY :
			date = "월요일";
			System.out.println("월요일 입니다.");
			break;
		case TUESDAY :
			date = "화요일";
			System.out.println(date);
			break;						
		case WEDNESDAY :
			date = "수요일";
			System.out.println(date);
			break;	
		case THURSDAY :
			date = "목요일";
			System.out.println(date);
			break;	
		case FRIDAY :
			date = "금요일";
			System.out.println(date);
			break;	
		case SATURDAY :
			date = "토요일";
			System.out.println(date);
			break;				
			
		}
	}

}
