
public class Exercise06 {

	static class SutdaCard{
		int num;
		boolean isKwang;
		
		public SutdaCard(int n, boolean tf) {
			num = n;
			isKwang = tf;
		}
		public SutdaCard() {
			this(1,true);
		}
		
		boolean info() {
			return isKwang;
		}
		
	}

	public static void main(String[] args) {
		SutdaCard card1 = new SutdaCard(3,false);
		SutdaCard card2 = new SutdaCard();
		
		System.out.println(card1.info());
	//	System.out.println(card2.info1());
	}
	
	
}
