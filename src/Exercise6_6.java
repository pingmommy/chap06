
public class Exercise6_6 {

	// 두 점(x,y)와 (x1,y1)간의 거리를 구한다.
	
	//static void getDistance(int x, int y, int x1, int y1) {
	static void getDistance() {
		
		int x =1;
		int y =1;
		int x1=2;
		int y1=2;
		double a = (double)(x-x1)*(x-x1);
		System.out.println(a);
		
		double b = (double)(y-y1)*(y-y1);
       System.out.println(b);
        
        double c = a+b;
       System.out.println(c);

        double d = Math.sqrt(c);
	    System.out.println(d);

		
	}
	
	public static void main(String[] args) {
		
		
		Exercise6_6.getDistance();
	//	System.out.println(getDistance(1,1,2,2));
//		int x =1;
//		int y =1;
//		int x1=2;
//		int y1=2;
		
		// x-x1^2
		
		/*
		 * 두 점 사이의 거리 공식
		 * (x,y) (x1,y1)
		 * d = (x-x1)^2 + (y-y1)^2 >> 제곱근(루트) 
		 * 
		 * 루트계산(제곱근계산)은 Math.sqrt가 해주므로 루트 안의 값을 계산해서 매개변수로 주면 된다. 
		 * */
//		double a = (double)(x-x1)*(x-x1);
//		System.out.println(a);
//		
//		double b = (double)(y-y1)*(y-y1);
//        System.out.println(b);
//        
//        double c = a+b;
//        System.out.println(c);
//
//        double d = Math.sqrt(c);
//	    System.out.println(d);
	}
	
}