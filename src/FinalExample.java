
//final은 변수에는 다 붙을 수 있다. 
//final이 붙으면 수정불가이다. 
// 변수뿐 아니라 메소드에도 클래스에도 붙을 수 있다. 
//공통점은 마지막이라는 의미이다. 

public class FinalExample {

	static class Alpha{
		
		final static double PI=3.141592; // 상수 
		final int line; //final (인스턴스)필드 
		int column;
		
		public Alpha() {
			line = 10;
			column =20;
		}
		
		void show() {
			final int num = 100;
		}
	}
	
	public static void main(String[] args) {
		Alpha a1 = new Alpha();
		//a1.line = 10; - final은 값대입이 안 된다. 
		a1.column =30;
		
//		Alpha.PI =4.4; - final을 붙이지 않으면 값대입이 가능하지만 final 키워드가 있으면 안 된다.  
		System.out.println(Math.PI); // final static
		System.out.println(Math.E); // final static
		
	}

}
