package test_0809;

public class Box {

	int height = 0;
	int length = 0;
	int width = 0;
	
	// 정적 변수 
	// 모든 박스의 갯수를 저장 > 객체 생성시 1씩 증가 
	static int boxcount = 0; 
	
	
	Box() {
		height =10;
		length =10;
		width = 10;
	}
	
	Box(int z) {
		height =z;
		length =z;
		width  =z;
	} 
	
	int plus(int u7) {
		// 매개변수
		return u7++;
	}

	void CloneBox(Box box4) {
		box4.height = this.height;
		box4.length = this.length;
		box4.width = this.width;
		System.out.println("메소드에서 수정된 높이 : " + box4.height);
		boxcount++;
	}

	boolean equalsBox (Box box) {
			
			/*
			 * 객체 box 를 가져와서 가로 세로 높이가 같은 경우 true를 return
			 *  아닐경우 false 를 return 
			 */
			
			
			if(height == box.height && width == box.width &&
					length == box.length) {
				return true;
			}
				
			else {
			
			return false;
		}
		
			
	}}		
			

		
	


