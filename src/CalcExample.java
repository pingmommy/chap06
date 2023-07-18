
public class CalcExample {
	
	static class Calc{
		int n1;
		int n2;
		
		public Calc(int n1, int n2) {
			this.n1=n1;
			this.n2=n2;
		}
		// 메소드를 호출할 때는 매개변수의 타입을 알아야 하고 어떤 값이 반환되는지 꼭 생각해야 한다. 
		// 메소드를 정의할 때 타입이 꼭 와야 한다.
		int add (){  //int 타입메소드는 return이 꼭 있어야 한다. 
			
			return n1 +n2;
		}
		
		//오버로딩
		
		int add(int n3){  
			return add() +n3;
		}
		
		 
		
		int add(int n3, int n4) {  
			
			return add(n3) +n4;
		}
		
		int sum(int ...nums) {  // 배열
			int sum =0;
			for(int i:nums)
				sum += i;
			return sum+n1+n2;
		}
		
		void print() {   //void 타입메소드는 return이 없어도 된다. 반환값이 없다.  
			
			return;
		}
	}

	public static void main(String[] args) {

		Calc c1 = new Calc(3, 4);
		
		
		System.out.println(c1.add());
		System.out.println(c1.add()+10);
		
		System.out.println(c1.sum(1,2,3,4,5,6));
		
		int[] n = {1,2,3,4,5};
		System.out.println(c1.sum(n));
		
		System.out.printf("%d%d%d%d",1,2,3,4);
	}

}
