// primitive type은 호출할 때 매개변수에 value값을 반환한다.(CallbyValue)
//변수값이 변하지 않음. 


public class CallbyValueExample {

	static void process(int num) {
		num +=10;
		System.out.println("num : "+num); //110
	}
	
	public static void main(String[] args) {
		int num =100;
		process(num);
		
		System.out.println("main num: "+num); //100
	}
}
