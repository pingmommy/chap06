
public class StaticMemberExample {

	// 어디에 만들어지고 언제 만들어지고 언제 사라지는지 명확히 알아야 한다. 
	
	// 문법적으로만 보면 static없으면 인스턴스
	// 인스턴스와 스태틱은 만들어지는 시점도 다르기 때문에 라이프사이클이 다르다. 
	// 저장공간도 다르다. 
	//인스턴스 필드는 new를 해야 힙에 생성된다. 레퍼런스 카운트가 0일 때 가비지컬렉터가 소멸시킴.
	//인스턴스 필드는 new에 의해 힙에 계속 생성할 수 있고 스태틱 필드는 클래스가 로딩될 때 딱 한 번 생성된다. 
	//스태틱은 클래스에 고정된 필드이다. 
	//모든 건 객체, 설계도(클래스)도 객체. 그러므로 속성을 갖는다. 
	//설계도의 속성 : 스태틱필드  설계도의 동작: 스태틱 메소드
	//scope의 길이 : 스태틱 >> 인스턴스 >> 일반변수 
	
		static class Alpha{// Alpha라는 클래스도 객체이므로 초기화가 필요할 때가 있다. 그 때 static block을 사용한다. 
		
		// 인스턴스 필드  - 힙에 생성
		int line;
		int c;
		int fg;
		int bg;
		char ch;
		int cnt;
		
		
		
		//정적 필드 - 메소드 area(코드영역(메소드, 클래스가 있는 곳))에 만들어짐.
		// 코드영역에는 명령어와 데이터도 있다. (힙과 스택은 오로지 데이터)
		// 정적필드는 메모리에 클래스가 로딩이 되면 생성된다. 
		static int count;
		
		//메소드 area에 로딩이 될때 한 번 사용된다.
		// static block은 여러 개 만들 수 있다.
		// 클래스 내부를 초기화할 때 쓰인다.
		static { 
			
			System.out.println("Alpha...."); // 알파가 로딩될 때 사용되는지 시험하는 코드
			
		}
		
		static { 
			
			System.out.println("Alpha2...."); // 알파가 로딩될 때 사용되는지 시험하는 코드
			
		}
		
		public Alpha() {
			Alpha.count++;
//			this.cnt++;
//			count++; // 내부에서는 클래스이름을 생략해도 되지만 스태틱과 인스턴스가 구분이 안되므로 클래스명 주자.
			cnt++;
		}
		
		
		//인스턴스 메소드 - 인스턴스가 있어야 사용가능. 참조가 있어야 사용가능. 
		
		//인스턴스요소에서는 인스턴스 스태틱 모든 멤버에 접근하는 게 아무 문제가 없다. 
		void show() {
			
			System.out.println(count); // Alpha 클래스가 로딩되면서 먼저 생성되었기 때문에 사용가능. 
 			System.out.println(this.cnt);  // ㄴshow()-> this가 매개값으로 오기 때문에 this.count 사용가능
			System.out.println(cnt);
			
		}
		void hide() {
			
		}
		
		// 정적 메소드 - 스태틱은 필드, 메소드 전부 클래스에 고정되어 있으므로 클래스명으로 
		//             인스턴스없이 사용가능하다. 
		static void clearScreen() {
			 System.out.println(count);
        //	 System.out.println(cnt);  스태틱필드에서 인스턴스 필드에 접근할 수 없다. 
		//	 System.out.println(this.cnt); 1 . 인스턴스 필드와 요소는 아직 만들어지지 않았기 때문에 접근할 수 없다. 
                                     //    2 . this가 매개값으로 넘어오지 않기 때문에 접근할 수 없다.   			
		
			 // 인스턴스요소에 접근하려면 인스턴스 생성하면 된다. 
			 Alpha a = new Alpha();
			 a.cnt =0;
			 a.show();
			 System.out.println("clearScreen");
		}
	}

	public static void main(String[] args) {
		
		Alpha.clearScreen();
		
		Alpha a1 = new Alpha(); // new에 의해 Alpha타입의 인스턴스가 힙에 생성됨. 
		// 'a1'은 로컬변수
		Alpha a2 = new Alpha();
		Alpha a3 = new Alpha();
		
		System.out.println(a1.cnt); // 1
		System.out.println(a2.cnt); // 1 
		System.out.println(a3.cnt); // 1 
		System.out.println(Alpha.count); // 3
		
		
		
		
		System.out.println(Math.random());

		
	}

}
