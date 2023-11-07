package com.example;

public class VT100LoopingExample2 {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("\033[2J");  //clearScreen
		
		boolean[][] rect = new boolean[20][40];
		
		int foreCount=0;
		
		
		for(;;) {
			int line = (int)(Math.random()*20 + 1);     //화면상의 좌표
			int column = (int)(Math.random()*40 + 1);    //화면상의 좌표
			int fg = (int)(Math.random()*8 +30);
			int bg = (int)(Math.random()*8 +40);
			int ch = (int)(Math.random()*26 + 'A');
			
			System.out.printf("\033[%d;%dH",line,column );  // 좌표 출력
			System.out.printf("\033[%dm",fg);
			System.out.printf("\033[%dm",bg);
			System.err.printf("%c", ch);
			rect[line-1][column-1]=true;
			
			System.out.printf("\033[1;42H");
			System.out.print("\033[0m");
			System.out.printf("foreCount = %d",foreCount++);
			
			boolean isAllPrint=true; // 찍었다고 초기화 
			
			
			// 다 찍었는지 판별하는 코드 (배열을 읽는다.) false가 있는지 찾는다.
			for(int i =0;i<20;i++) {    
				for(int j=0;j<40;j++) {
					if(rect[i][j] ==false) {
						isAllPrint = false; //
						break; // j for문만 끝난다. 
					}
				}
				if(isAllPrint ==false) {
					break;
			}
			
			Thread.sleep(1);
			
			

		}
		
			if(isAllPrint) 
				break;
		

		
		
	}
		System.out.print("\033[0m");
		System.out.print("\033[21;1H");
		System.out.println("Program End");
		
		
	}
}


