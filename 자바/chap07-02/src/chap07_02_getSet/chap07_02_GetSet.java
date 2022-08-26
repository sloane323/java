package chap07_02_getSet;

public class chap07_02_GetSet {

		
		
			//반려동물 진료카드 클래스를 만들자 
			/*
			 * 필드 
			 * 동물종류 ( animal) 이름 ( name ) 개월수 ( month ) 
			 * 
			 * getAnimal() , getName() , getMonth() 
			 * setAnimal(), setName(), setMonth()
			 * 
			 */
		
		
		  public String animal ;
		  public String name ;
		  public int month ;
		  
		  
		  chap07_02_GetSet () {
			  this.animal = "닥스훈트";
			  this.name="짱이";
			  this.month =180;
			   }
		
		  
		  chap07_02_GetSet (String animal, String name, int month) {
			  this.animal = animal;
			  this.name = name;
			  this.month = month;
		  }
		
		  void chap07_02_GetSet(String animal) {
			  this.animal=animal;
		  }
		  
		  String chap07_02_GetSet() {
			  return this.animal;
		  }
		  
		  boolean checkMonth() {
			 
			  boolean check;
			  if (this.month == 0) {
				  check = false;
			  } else {
				  check = true;
			  } return check;
			 
		  
		  }

}
