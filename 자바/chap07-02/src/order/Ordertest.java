package order;

import java.util.Calendar;

public class Ordertest {

	public static void main(String[] args) {
		
		Order[] orders = new Order[10];
		orders[1] = new Order("abc123","홍길동","PD-123");
		orders[2] = new Order("abc123","홍길동","PD-123");
		orders[3] = new Order("abc123","홍길동","PD-123");
		orders[4] = new Order("abc123","홍길동","PD-123");
		//orders[0].SetOrderNumber("202208110001");
		// System.out.println(orders[0].getOderNumber());
		
		//캘린더 클래스 확인
		
		Calendar cal = Calendar.getInstance(); 
		//System.out.println(cal);
		//System.out.print(cal.get(cal.YEAR));
		//System.out.print(cal.get(cal.MONTH)+1);  // 첫 시작달이 0으로 시작 
		//System.out.print(cal.get(cal.DATE));
		//System.out.print(cal.get(cal.HOUR));
		//System.out.println(cal.get(cal.MINUTE));
		
		
		orders[1]  = new Order();
		System.out.println(orders[1] + orders[1].getOderNumber());
		
		//orders[2]~ orders[9]까지 new order(0); 를 통해 객체를 생성하고 
		//orders[0]~order[9] 까지 get ordernumber 를 출력하세요 
		
		
		for (int i =2; i<orders.length; i++ ) {
			orders[i] = new Order();
			
		}
		
		for(Order order : orders) {
			System.out.println(order.getOderNumber());
		}
		
		
	}

}
