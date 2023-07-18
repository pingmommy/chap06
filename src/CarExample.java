

public class CarExample {
	static class Car{
		
	}
	
	public static void main(String[] args) {
		String str1="Hello";
		String str2= new String("Hello");
		
		
		Car c1 = null; // 참조변수이기 때문에 null저장할 수 있다. 
		Car c2 =new Car(); // 인스턴스화 힙영역에 만들어짐. 
		//힙영역에 생성된 Car객체의 참조값은 변수c2에 저장되고 c2의 값은 스택영역에 저장된다. 
		Car c3 = new Car();
		c2 = null; // null값을 넣는 순간 c2의 참조값은 0이 된다. 
	}
	
}
