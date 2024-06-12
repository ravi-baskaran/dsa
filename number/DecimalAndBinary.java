package number;

public class DecimalAndBinary {

	public static void main(String[] args) {

		int n = 45;
		System.out.println(decimalToBinary(n));
		
		String b ="101101";
		
		System.out.println(binaryToDecimal(b));

	}

	static String decimalToBinary(int n) {

		String b = "";

		while (n >= 1) {

			int rem = n % 2;
			n = n / 2;
			b = rem + b;
		}
		return b;
	}
	
	
	static int binaryToDecimal(String b) {
		
		int result=0;
		
		int powerOf2=1;
		
		for(int i =b.length()-1; i>=0; i--) {
			
			if(b.charAt(i) == '1') {
				result = result+powerOf2;
			}
			powerOf2 = powerOf2*2;
		}
		return result;
		
		
	}
	
	

}
