package number;

public class GCDorHCFandLCM {

	public static void main(String[] args) {

		int a = 15;
		int b = 20;

		System.out.println(bruteForce(a, b));

		System.out.println(euclidAlgoHCF(a, b));
		
		System.out.println(euclidLCM(a, b));

	}

	static int bruteForce(int a, int b) {

		int min = 0;
		if (a < b) {
			min = a;
		} else {
			min = b;
		}

		for (int i = min; i >= 1; i--) {
			if (a % i == 0 && b % i == 0) {
				return i;
			}
		}
		return 1;

	}

	static int euclidAlgoHCF(int a, int b) {

		while (a != 0 && b != 0) {
			if (a > b) {
				a = a % b;
			} else {
				b = b % a;
			}
		}
		if (a != 0) {
			return a;
		} else {
			return b;
		}

	}
	
	static int euclidLCM(int a, int b) {
		
		//LCM = Product/HCF
		
		return (a*b)/euclidAlgoHCF(a, b);
		
	}

}
