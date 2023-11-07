package com.example;

import util.Alpha;
import util.VT100;

public class RectangleExample {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		VT100.clearScreen();
		
		for(int i=0; i<=100;i++) {
			Alpha a = new Alpha();
			 a.show();
			
			
			 
			 Thread.sleep(10);
			 VT100.reset();
			 VT100.cursorMove(1, 42);
			 System.out.printf("count = [%05d]",i);
			 
		}
	
		
		
		VT100.reset();
		VT100.cursorMove(21, 1);
		System.out.println("end");
	}

}
