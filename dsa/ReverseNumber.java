package dsa;

public class ReverseNumber {

	public static void main(String[] args) {
		
		//Reverse the number
		
		int num = 364562;
		
		int result = 0;
		
		while(num > 0) {
			int rem = num % 10 ;
			
			num = num/10;
			
			result = result * 10 + rem;
		}
		System.out.println(result);
		
	}

}
