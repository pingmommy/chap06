public class ThisConstructorExample {

	static class Alpha{
		int line;
		int column;
		int fg;
		int bg;
		char ch;
		
		public Alpha(int line, int column, int fg, int bg, char ch) {
			System.out.println(" "); // 초기화 코드 전에 작성할 수 있다. 
			this.line =line;
			this.column =column;
			this.fg=fg;
			this.bg=bg;
			this.ch=ch;
			
		}
		
//		public Alpha(int line, int column) {
//			this.line =line;
//			this.column =column;
//			this.fg =31;        
//			this.bg =41;
//			this.ch='A';
//			
//		}
		
		public Alpha(int line, int column) {
			//System.out.println(" "); // 초기화 코드 전에 작성할 수 없다. 
			this(line,column,31,44,'A');
		}
		
	/*	void show(this(=a1)) {
			System.out.printf("%d %d %d %d %c \n",this line,this column,this fg,this bg,this ch);
		} */
		
	}
	
	
	public static void main(String[] args) {
		Alpha a1 = new Alpha(10,5,31,44,'A'); // new에 의해 힙영역에  Alhpa타입의 a1 공간이 생김. 
		Alpha a2 = new Alpha(30, 20);

		//a1.show();// 기계어로 변환될 때는 show의 a1>> a1.show(a1(매개변수))
		//a2.show();
	}
	
	// new를 하면 생성자가 객체를 생성한다. 
	//힙에 타입의 크기에 맞는 공간이 생긴다. 
	//공간의 참조값을 생성자에게 넘겨준다. 
	// 넘겨준 값이 this인데, 생략되어 있다. 
	// 모든 생성자는 this를 갖고 있다. 
	// 생성자나 메소드에는 this가 있는 것이다. 
	// 모든 메소드에 있는 것은 아니고 없는 것도 있다. 
	//new는 참조값을 변수에게 넘겨준다. 그 참조값이 this이고 생략되어 있다. 

}
