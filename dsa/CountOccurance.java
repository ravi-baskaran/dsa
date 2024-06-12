package dsa;

public class CountOccurance {

	public static void main(String[] args) {
		
		//Find occurrence of 7
		
		int n = 16377734;
		
		int count = 0;
		
		while(n > 0) {
			
			int rem = n % 10;
			if (rem == 7) {
				count ++;
			}
			n = n/10;
			
		}System.out.println(count);
		
	}

}
