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
		
		void show() {
			System.out.printf("%d %d %d %d %c \n",line,column,fg,bg,ch);
		}
		
	}
	
	
	public static void main(String[] args) {
		Alpha a = new Alpha(10,5,31,44,'A');
		
		a.show();
		Alpha a2 = new Alpha(30, 20);
		
		a2.show();
	}

}
