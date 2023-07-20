package util;

import util.VT100;

public class Alpha {
	int line;
	int coulmn;
	Color fg;
	Color bg;
	char ch;
	
	public Alpha() {
		line = (int)(Math.random()*20+1);
		coulmn = (int)(Math.random()*40+1);

		do {
			fg = Color.values()[(int)(Math.random()*8)];
			bg = Color.values()[(int)(Math.random()*8)];
		}while(fg==bg);
		//원래는 == 연산자를 쓸 수 없지만 enum은 상수이므로 그냥 쓴다.  
		
		ch=(char)(Math.random()*26+'A');
	}
	
		public void show() {
			VT100.cursorMove(line,coulmn);
			VT100.setForeground(fg);
			VT100.setBackground(bg);
			VT100.print(ch);
		}
	
		
		
		
	
	}
	
	
	


