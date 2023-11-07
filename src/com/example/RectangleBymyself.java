package com.example;

//배열을 사용해서 알파 화면이 전부 다 프린트되면 무한루프를 종료시키다. 
//폰트와 배경의 색이 같지 않도록 랜덤값을 설정한다. 

/*
 1. 무한루프를 만든다. 
   -라인(행)과 컬럼(열)이 무작위로 위치한다.
   -글자색과 배경색이 무작위로 주어진다.
   -대문자 알파벳이 무작위로 주어진다. 
 2. 무한루프를 종료시킨다.
   - 조건 : 
        알파화면[20][40]이 전부 프린트되면 무한루프가 종료됨. 800
        전부 프린트된 걸 어떻게 확인하지? 
         
        배열을 사용한다. 
        
   
 
  
 */

import util.Alpha;
import util.VT100;

public class RectangleBymyself {

	public static void main(String[] args) throws InterruptedException {
	
		VT100.clearScreen();
		
		//boolean의 초기값은 false이다. 
		//배열은 비어 있다.
		//비어 있는 상태에서 초기값만 있다. 
		//현재 배열의 값: false 
		//현재와 다른 상태 : 배열공간이 채워짐. -> true
		//배열의 요소가 true인 걸 어떻게 확인하지..? -> 초기값(false)를 true로 바꿈. 
		
		boolean arr[][]=new boolean[20][40]; //[line][column]
		
		int foreCount = 0; // 무한루프의 반복횟수
		int count= 0; //화면에 채워지는 알파벳 갯수 
		
		
		for(;;) {
			foreCount++;
			
			int line = (int)(Math.random()*20+1);
			int column=(int)(Math.random()*40+1);
			int fg=(int)(Math.random()*30+1);
			int bg=(int)(Math.random()*40+1);
			char ch=(char)(Math.random()*26+'A');
			
			System.out.printf("\033[%d;%dH",line,column);
			System.out.printf("\033[%dm",fg);
			System.out.printf("\033[%dm",bg);
			System.out.printf("%c",ch);
			
			if(arr[line-1][column-1] == false) {
				arr[line-1][column-1]=true;
				count++;
			}
			if(count ==800)
				break; // 배열이 다 채워지고 반복문을 종료시키는 메소드 
			
			
			
			
			}
			VT100.reset();
		}
		
	}


