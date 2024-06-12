package recursion;

public class Numbers {

	public static void main(String[] args) {
		int n =6;
		printn(n);

	}
	
	static void printn(int n) {
		
		if(n<1) {
			return;
		}
		
		//System.out.println(n);
		printn(n-1);
		System.out.println(n);
		
	}

}
