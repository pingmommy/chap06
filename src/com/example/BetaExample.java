package com.example;

public class BetaExample {
	
		// 배열을 사용해서 알파 화면이 전부 다 프린트되면 무한루프를 종료시킨다 how to ?
		// 폰트와 배경의 색이 같지 않도록 랜덤 값을 설정한다. 
		public static void main(String[] args) throws InterruptedException {

			System.out.println("\033[2J"); // Clear screen

			boolean[][] rect = new boolean[20][40]; // 따로 초기화하지 않았으므로 false로 초기화됨 _ 화면에 출력이 되면 true가 찍히도록 코드작성이 필요함. 

			int forCount = 0;           // 무한루프가 종료되기까지 반복횟수
			
			int count = 0; 				// 화면에 찍은 개수를 저장하는 변수

			for (;;) {

				forCount++;

				int line = (int) (Math.random() * 20 + 1); // [1~20]
				int column = (int) (Math.random() * 40 + 1); // [1~40]
				int fg = 0;
				int bg = 0;
				
				do 	{
					fg = (int) (Math.random() * 8 + 30); // [30-37]
					bg = (int) (Math.random() * 8 + 40); // [40-47]
				} while( fg + 10 ==bg);
				
				
				char ch = (char) (Math.random() * 26 + 'A'); // [A~Z]


				System.out.printf("\033[%d;%dH", line, column);
				System.out.printf("\033[%dm", fg);
				System.out.printf("\033[%dm", bg);
				System.out.printf("%c", ch);

				if(rect[line - 1][column - 1] == false) {  //line, column은 1부터 시작, 배열 rect는 0부터 시작하니 -1을 해줘야 한다.
					rect[line-1][column-1] = true; // 좌표에 찍혔으니 ture로 대입
					count++;
					System.out.printf("\033[2;50H");
					System.out.printf("\033[0m");
					System.out.printf("count = %03d", count);
					
				}
			
				
				System.out.printf("\033[1;50H");
				System.out.printf("\033[0m");
				System.out.printf("forCount=%04d", forCount);

				
				if (count ==800) // 무한루프를 벗어나는 코드
					break;
				
				Thread.sleep(1);

			}
			System.out.printf("\033[23;1H");
			System.out.printf("\033[0m"); // reset
			System.out.printf("루프를 " + "%05d" + "번 수행했습니다.", forCount);



		}

}
