package order;

import java.util.Calendar;

public class Order {

	/*
	 * 필드, 설정자와 접근자 쇼핑몰 Order 클래스를 만들어보자 생성자() (id,name,productNum) String
	 * orderNumber, id , name , productNum 주문번호 : 202208110001 아이디 abc123 이름: 홍길동
	 * 상품번호 PD-123 getOderNumber(); SetOrderNumber();
	 * 
	 * 길이가 10인 order 클래스 배열 만들기
	 */

	// 필드
	
	private String orderNumber;
	private String id;
	private String name;
	private String productNum;

	// 정적변수 orderCount를 만들어서 사용하여

	private static int orderCount = 0;

	// 생성자

	public Order() {
		// 년도,달,일

		Calendar cal = Calendar.getInstance();
		// 년도 달 일
		// cal 객체를 이용하여 현재의 날짜를 받아옴

		int year = cal.get(cal.YEAR);
		int month = cal.get(cal.MONTH) + 1;
		int date = cal.get(cal.DATE);

		String numString = Integer.toString(year) + Integer.toString(month) + Integer.toString(date)

				+ Integer.toString(orderCount++);

		// 0이 포함된 202208110000 만들기
		// format 문자열 안에 %d(정수) %s(문자열) 와 같이 기호를 통해 변수를 넣음
		// 숫자형의 경우 숫자가 차지할 공간을 지정해 줄 수 있다. : %2d ( 공간 2차치 )
		// 앞이 0이 붙으면 빈 공간을 0으로 채워준다 : %02d ( 빈공간은 0으로 )

		String numZeroString = String.format("%d%02d%02d%04d", year, month, date, orderCount);

		// String 20228110 이라는 값을 만드세요

			
		this.orderNumber = numZeroString;
		this.id = "";
		this.name = "";
		this.productNum = "PD-0001";

	}

	public Order(String id, String name, String productNum) {
		this.orderNumber = "00000000";
		this.id = id;
		this.name = name;
		this.productNum = productNum;
	}

	public String getOderNumber() {
		return this.orderNumber;
	}

	public void SetOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	// orderNumber 자동으로 작성하는 메소드 
	
	/*
	
	private String numString() {
		
		private String orderNumber;
		private String id;
		private String name;
		private String productNum;

		// 정적변수 orderCount를 만들어서 사용하여

		private static int orderCount1 = 0; */

		// 생성자

		/*public Order() {
			// 년도,달,일

			Calendar cal = Calendar.getInstance();
			// 년도 달 일
			// cal 객체를 이용하여 현재의 날짜를 받아옴

			int year = cal.get(cal.YEAR);
			int month = cal.get(cal.MONTH) + 1;
			int date = cal.get(cal.DATE);

			String numString = Integer.toString(year) + Integer.toString(month) + Integer.toString(date)

					+ Integer.toString(orderCount1++);

			// 0이 포함된 202208110000 만들기
			// format 문자열 안에 %d(정수) %s(문자열) 와 같이 기호를 통해 변수를 넣음
			// 숫자형의 경우 숫자가 차지할 공간을 지정해 줄 수 있다. : %2d ( 공간 2차치 )
			// 앞이 0이 붙으면 빈 공간을 0으로 채워준다 : %02d ( 빈공간은 0으로 )

			String numZeroString = String.format("%d%02d%02d%04d", year, month, date, orderCount);
			
			Ordercount++;
			
			return numZeroString; */
		
	}  








