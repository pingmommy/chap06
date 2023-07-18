
public class FieldInitExample {
	
	static class Alpha{
		int line;
		int column;
		int fg=31;
		int bg=44;
		char ch;
		
		public Alpha(int line, int column, char ch) {
			this.line = line;
			this.column=column;
			this.ch=ch;
			
		}

		void show() {
			System.out.printf("\033[%d;%dH",line,column);
			System.out.printf("\033[%dm",fg);
			System.out.printf("\033[%dm",bg);
			System.out.printf("%c",ch);
		}
		
		void hide() {
			System.out.printf("\033[%d;%dH",line,column);
			System.out.print("\033[0m");
			System.out.print(' ');
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		System.out.println("\033[2J");

		Alpha a1 = new Alpha(10, 5, 'A');
		Alpha a2 = new Alpha(20, 15, 'B');
		
		a1.show();
		a2.show();
		
		
		Thread.sleep(1000);
		
		a1.hide();
		a2.hide();
		
		
		System.out.println("\033[0m");
		
		
		
	}

}
