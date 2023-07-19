
public class Exercise6_5 {
	
  static class Student{
		String name;
		int ban;
		int no;
		int score1;
		int score2;
		int score3;
		
		public Student(String n, int ban, int no, int s1, int s2, int s3) {
			name =n;
			this.ban=ban;
			this.no=no;
			score1=s1;
			score2=s2;
			score3=s3;
		}
		
		int getTotal() {
			
			
			return score1+score2+score3 ;
		}
		
		float getAverage() {
			
			return Math.round(getTotal()/3f*10)/10.0f; 
			
			
		}
		
		
		String info() {
			return name + ban+no+score1+score2+score3+getTotal()+getAverage();
			
		}
		
		
	}

	public static void main(String[] args) {
		Student s= new Student("홍길동",1,1,100,60,76);
		
		System.out.println(s.info());
	}
	

	
}
