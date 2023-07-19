package util;
// enum과 int 함께 적용되도록 ... 
public class VT100 {
	
	 public static void clearScreen() {
		 System.out.println("\033[2J");
	 }
	 
	 public static void cursorMove(int line, int column) {
		 System.out.printf("\033[%d;%dH",line,column);
	 }
     //30-37
	 public static void setForeground(int fg) {
		 System.out.printf("\033[%dm",fg);
	 }
	 
	 //Color는 enum 클래스이므로 정수타입이 아니다. 
	 // ordinal() 메소드를 써서 정수타입으로 바꿔야 한다. 
	 public static void setForeground(Color fg) {
		 System.out.printf("\033[%dm",fg.ordinal()+30);
	 }
	 
	 
	 //40-47
	 public static void setBackground(int bg) {
		 System.out.printf("\033[%dm",bg);
	 }
	 
	 public static void setBackground(Color bg) {
		 System.out.printf("\033[%dm",bg.ordinal()+40);
	 }
	 
	 public static void reset() {
		 System.out.println("\033[0m");
     }
	 
	 public static void print(char ch) {
		 System.out.println(ch);
		
	}
}
