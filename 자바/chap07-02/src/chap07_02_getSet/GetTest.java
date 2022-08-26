package chap07_02_getSet;

public class GetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		AnimalCard Card1 = new AnimalCard();
		
		
		Card1.setAnimal("고양이");
		System.out.println(Card1.getAnimal());
		System.out.println(Card1.getName());
		System.out.println(Card1.getMonth());	
	
		
		
		
		AnimalCard Card2 = new AnimalCard ("고양이", "나비", 10);
		Card2.printAnimalCard(); {
			
		}
		
		

	}

}
