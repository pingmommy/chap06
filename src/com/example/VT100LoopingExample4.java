package com.example;

public class VT100LoopingExample4 {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("\033[2J");  //clearScreen
		
		boolean[][] rect = new boolean[20][40];
		
		int foreCount=0;
		int count =0;
		
		
		for(;;) {
			int line = (int)(Math.random()*20 + 1);     //화면상의 좌표
			int column = (int)(Math.random()*40 + 1);    //화면상의 좌표
			int fg = 0;
			int bg = 0;
			
			do {
				fg = (int)(Math.random()*8 +30);
				bg = (int)(Math.random()*8 +40);
			}while(fg+10==bg);
			
			int ch = (int)(Math.random()*26 + 'A');
			
			System.out.printf("\033[%d;%dH",line,column );  // 좌표 출력
			System.out.printf("\033[%dm",fg);
			System.out.printf("\033[%dm",bg);
			System.out.printf("%c", ch);
			
			if(rect[line-1][column-1]==false) {
				rect[line-1][column-1]=true;
				count++;
			}
			
			System.out.printf("\033[1;42H");
			System.out.printf("\033[0m");
			System.out.printf("foreCount = %d",foreCount++);
			
			
			
			
			// 다 찍었는지 판별하는 코드 (배열을 읽는다.) false가 있는지 찾는다.
			
		
			if(count==800) // 800개 다 찍으면 끝내라 
				break;
			
			Thread.sleep(1);
			
			

		}
		
		

		
		
		System.out.print("\033[0m");
		System.out.print("\033[21;1H");
		System.out.println("Program End");
	}
	}


