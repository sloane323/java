package interface_ex1;
	//클래스 
 class Scores {
	 // 필드 
	int korean;
	int math;
	int english; 
	int arvg;
	
 	// 생성자 
 	public Scores () {
 		this.korean = 0;
 		this.math = 0;
 		this.english = 0;}
 	
 	public Scores ( int korean,int math,int english ) {
 		this.korean = korean;
 		this.math = math;
 		this.english = english;}
 	
 	// 설정자 
 		public void setScores  (int korean,int math,int english) {
 			this.korean = korean;
 	 		this.math = math;
 	 		this.english = english; }

 	
 
 	// 메소드 
 		public int  arvg () {
 			return (korean+math+english)/3 ;
 		}
 		
 		 
 
 }
 		
