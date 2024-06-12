package pattern_program;

public class Pattern {

	public static void main(String[] args) {
		
		pattern1(5);

	}
	
	static void pattern1(int n) {
		
		for(int i =1; i<=n; i++) {
			for(int j=n; j<=n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
