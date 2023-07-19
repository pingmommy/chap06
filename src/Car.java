
public class Car {
	
	
	//필드 - 저장되는 공간도 변수와 다르다. 힙영역에 생성 저장
	int gas;// 공간으로 간다. 
	
	void setSpeed(int speed) {
		//참조가 셋스피드로 넘어간다. 
		// 메소드 앞에 매개변수 하나가 더 추가된다. 
		//setSpeed(참조값(this(=c1)), int speed)
		// 위의 과정 때문에 this를 쓸 수 있는 것이다. 
		// 기계어로 바뀌면서 
		//
	}
	
	
	
	public static void main(String[] args) {
		
		int num; // 로컬변수, 스택변수, 임시변수, 블럭변수
		
		Car c1 = new Car(); //  new + 생성자(Car()) ->> 객체 생성 

		c1.setSpeed(100);
		//setSpeed(c1,100) - 메소드 호출이면 이렇게 기계어로 넘어간다. 
		// 여기서 c1이 'this' 결국은 나 자신 c1과 this는 같다. 
		//this에는 c1의 레퍼런스가 담겨있는데, 이건 컴파일러가 알아서 해준다. 
		//메소드 안에서는 this를 사용할 수 있다. 
	}
}
