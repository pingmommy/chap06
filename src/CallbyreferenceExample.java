// 참조타입은 call by referenc로 참조값을 넘긴다. 

public class CallbyreferenceExample {

	
	static void process(int[] nums)
	{
		nums[0]=900;
		nums[1]=800;
		for(int n:nums) {
			System.out.printf("%d  " ,n);
		}
	}
	
	public static void main(String[] args) {
		int[] nums= {1,2,3,4};
		
		process(nums);
		// call by reference는 값이 넘어가는 것이 아니라 참조값이 넘어간다. 
		//process 메소드로 매개변수로  배열변수 nums를 넘겼을 때 1,2,3,4 라는 값을 넘겨주는 것이 아니라
	    // 값이 담긴 주소값을 넘기는 것이어서 메소드 안에서 주소값에 담긴 값을 변경하면
		// 로컬 배열변수 nums의 값 또한 바뀐다. 
		
		for(int n:nums) {
			System.out.printf("%d ",n);
			
		}
	}
}
