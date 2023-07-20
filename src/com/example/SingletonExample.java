package com.example;

class Oracle {
	
	/* 생성자가 프라이빗이기 때문에 클래스 외부에서는 new로 생성자를 호출할 수 없다. 
	 * 대신 내부에서는 할 수 있다. */
	
	private static Oracle instance = new Oracle(); // 외부에서 직접적으로 접근하지 못하도록 private
	                                   
	private Oracle() {
		
	}
	
	public static Oracle getInstance() { //
		return instance;
	}
}

public class SingletonExample {

	public static void main(String[] args) {

	//	Oracle o = new Oracle(); // (X)
		
		Oracle o1 =Oracle.getInstance();
		Oracle o2 =Oracle.getInstance(); // o1, o2 는 다른 객체로 생각되지만 같은 객체를 참조하고 있다. 
		
	}

}
