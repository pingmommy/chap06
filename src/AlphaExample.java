import java.lang.reflect.Constructor;

public class AlphaExample {
	
	static class Alpha{
		
		/*필드 - 속성  >> 힙에 저장됨. 힙에 저장이 되기 때문에 초기화하지 않으면 
	                    기본값으로 자동초기화됨. 스택에 저장되며 꼭 초기화를 해야 하는 로컬변수와는 차이가 있다.
	                    필드는 언제 생성되나? - new연산자로 객체가 생성될 때 만들어진다. */
		
		int fg;  //30-37
		int bg;  //40-47 
		char ch; //A-Z
		
		/*생성자 - 이름을 마음대로 지을 수 없고 클래스 이름과 동일해야 한다.
		       -  new 연산자가 수행될 때(인스턴스화) 생성된다. */
		public Alpha() {
			
			 fg=(int)(Math.random()*8+30);
			 bg=(int)(Math.random()*8+40);
			ch=(char)(Math.random()*26+'A');
			
		}
		
		
		
		/*메소드 - 동작  */
		void show() {
			System.out.printf("\033[%dm",fg);
			System.out.printf("\033[%dm",bg);
			System.out.print(ch);
			System.out.print("\033[0m");

		}
		
		void hide() {
//			int num;
//			System.out.println(num); -> num은 로컬변수로 초기화하지 않았기 때문에 사용할 수 없다. 
		
		}
		
	}
	
	static class A{
		
		public A() {

		}
		// 생성자를 하나라도 정의하면 기본생성자는 자동으로 생기지 않는다. (내가 만들어야 함.)
		
		//overloading - 매개변수를 다양하게 설정하여 객체를 다양하게 초기화하는 것. 생성자를 여러 개 만들 수 있다. 
		//            - 생성자와 메소드에 오버로딩이 가능하다. 
		//            - 매개변수의 갯수나, 순서, 타입 중 하나만 다르면 중복정의가 가능. 
		public A(int n) {
		
		}
		
		public A(int n,int g) {
			
		}
		
		public A(long n,int bg) {
			
		}
		
		public A(int bg,long n) {
			
		}
		
		
		
		 
		
	}
	
	public static void main(String[] args) {
		A a = new A();
	}
	public static void main3(String[] args) {
		
		//Alpha a = new Alpha();
		for(int i=0; i<10;i++) {
			for(int j=0;j<20;j++) {
				Alpha a = new Alpha();

				a.show();
			}
			System.out.println();
		}
		
		//System.out.println(a.fg);
	}

	public static void main2(String[] args) {

		Alpha a1 = new Alpha(); // 힙영역에 Alpha타입의 메모리공간이 생김. 
		             //  ⤷ 생성자라고 봐야 한다. 더 정확하게 말하자면 초기화 메소드이다. 
		             // new에 의해 생성되고 Alpha()에 의해 초기화된다. 
		
		a1.show();
		System.out.println("\033[0m");
	
	
	
	}                 
	
	

}
