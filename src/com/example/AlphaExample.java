package com.example;

import util.Color;

//import java.util.Scanner; //strl + shift + o >> importing 

import util.VT100;

public class AlphaExample {
	public static void main(String[] args) {
		VT100.clearScreen();
		VT100.cursorMove(10, 10);
		VT100.setForeground(Color.Black);
		VT100.setBackground(Color.White);
		System.out.println("hello");

		VT100.cursorMove(13, 5);
		VT100.setForeground(Color.Cyan);
		VT100.setBackground(Color.Green);

		System.out.println("world");

		VT100.cursorMove(5, 20);
		VT100.setForeground(Color.Magenta);
		VT100.setBackground(Color.Red);
		System.out.println("Helloworld");
		
		VT100.reset();
	}
	
	
	public static void main3(String[] args) {
		VT100.clearScreen();
		VT100.cursorMove(10, 10);
		VT100.setForeground(31);
		VT100.setBackground(44);
		System.out.println("hello");

		VT100.cursorMove(13, 5);
		VT100.setForeground(32);
		VT100.setBackground(46);

		System.out.println("world");

		VT100.cursorMove(5, 20);
		VT100.setForeground(33);
		VT100.setBackground(45);
		System.out.println("Helloworld");
		
		VT100.reset();
	}
	
	public static void main2(String[] args) {
		util.VT100.clearScreen();
		//Scanner를 쓸 때 전부 다 쓴다면 ... 
		java.util.Scanner sc = new java.util.Scanner(System.in);
	}
	
}
