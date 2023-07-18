
public class Exercise06 {

	//6-1,2
	
	static class SutdaCard{
		int num;
		boolean isKwang;
		
		public SutdaCard() {
			
			
		}
		
		public SutdaCard(int n, boolean a) {
			num =n;
			isKwang = a;
		}
		
		boolean info1() {
			return true;
		}

	}
	
	
	
	
	
	public static void main(String[] args) {
		SutdaCard card1 = new SutdaCard(3,false);
		SutdaCard card2 = new SutdaCard();
		
		System.out.println(card1.info1());
		System.out.println(card2.info1());
	}
	
	
	//6-3,4
	
	static class Student{
		String name;
		int ban;
		int no;
		int kor;
		int eng;
		int math;
		
		public Student() {

		}
		
		int getTotal() {
			
			
			return kor+eng+math ;
		}
		
		public float getAverage() {
			
			return Math.round(getTotal()/3f*10)/10.0f; 
			
			
		}
	}
	
	public static void main2(String[] args) {
		
		Student s = new Student();
		s.name ="홍길동";
		s.ban=1;
		s.no=1;
		s.kor=100;
		s.eng=60;
		s.math=76;
		
		System.out.println("이름:"+s.name);
		System.out.println("총점:"+s.getTotal());
		System.out.println("평균:"+s.getAverage());
		
	}
	
	
}
