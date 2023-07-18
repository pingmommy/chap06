
public class Exercise06 {

	//6-1
	
//	static class SutdaCard{
//		int num=1;
//		boolean isKwang=true;
//		
//		public SutdaCard() {
//			
//		}
//		
//		public SutdaCard(int n, boolean a) {
//			num =n;
//			isKwang = a;
//		}
//		
//		int number(num) {
//			
//		}
//		
//		
//		boolean info() {
//			System.out.print(num);
//			
//			if(isKwang equals('광')) {
//				return'K';
//			}
//		    return isKwang;
//			
//		}
//	}
//	
//	
//	
//	
//	
//	public static void main(String[] args) {
//		SutdaCard card1 = new SutdaCard(3,false);
//		SutdaCard card2 = new SutdaCard();
//		
//		System.out.println(card1.info());
//		System.out.println(card2.info());
//	}
	
	
	//6-3
	
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
		
		float getAverage() {
			
			return getTotal()/3.0f; // 소수점 둘째자리까지 반올림. 
		}
	}
	
	public static void main(String[] args) {
		
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
