package chap07_object_String;

public class String_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String 클래스의 메소드 확인
		String word = new String("단어"); 
		//charAt을 사용하면 문자열의 인덱스를 통해 문자를 출력 할 수있다.
		//배열과 동일한 인덱스를 가지고 있다. (0부터 시작)
		System.out.println(word.charAt(1));
		
		//compareTo 사전적 순서로 비교
		//앞에 있으면 -1 (음수) 같으면 0 뒤에 있으면 1 (양수)
		System.out.println(word.compareTo("단억"));
		
		
		//concat 현재의 단어에 글자를 추가해서 출력
		//현재의 단어를 바꾸지 않음
		
		System.out.println(word.concat("장홓잇"));
		System.out.println(word+"장"); // 메소드 사용과 동일
		
		// equals 문자열을 비교해서 boolean 값을 출력
		System.out.println(word.equals("단어"));
		
		word = ""; // 값이 없다 
		
		//isEmpty는 길이로 boolean 값을 출력,
		//"" : 빈값으로서 길이가 0
		//null : 아애 가르키는 객체가 없다. 
		//System.out.println(word.isEmpty());
		
		//length는 길이를 숫자로 출력
		System.out.println(word.length());
		
		
		// replace 글자를 모두 바꿔줌 
		word = "느그 교수가 시키드나 ";
		System.out.println(word.replace("교수", "츄"));
		
		//substring 원하는 단어를 잘라서 가져옴
		// 처음위치~ 마지막위치 
		System.out.println(word.substring(0,6));
		
		//toLowerCase(), toUpperCase()
		//영어 대문자/소문자 
		word = "Apple" ;
				
		System.out.println(word.toLowerCase());
		System.out.println(word.toUpperCase());
		
		
		
		
		//실습 1 String 클래스 메소드 
		//length(), charAt() 
		// String 문자열 "2022-08-05"
		// for 문을 이용하여 문자열 길이만큼 반복하여 문자를 하나씩 출력한다. 
		// charAt() dl "-"면 "." 로 바꿔서 출력한다 
		
		
		String date = new String("2022-08-05"); 
		
		for (int ai =0; ai<date.length() ; ai++) {
			System.out.println(date);
			System.out.println(date.replace("-", "//"));
			
		}
		
		
	}

}
