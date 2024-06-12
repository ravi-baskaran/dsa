package number;

public class FindAndPrintPrimeNumber {

	public static void main(String[] args) {

		int num = 13;
		System.out.println(isPrime(num));
		// printPrime(num);
		sievePrime(num);

	}

	static boolean isPrime(int n) {

		if (n == 1) {
			return false;
		}
		if (n == 2 || n == 3) {
			return true;
		}
		if (n % 2 == 0 || n % 3 == 0) {
			return false;
		}
		for (int i = 5; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;

	}

	static void printPrime(int n) {

		for (int i = 2; i <= n; i++) {
			if (isPrime(i)) {
				System.out.println(i);
			}
		}

	}

	static void sievePrime(int n) {

		boolean[] mark = new boolean[n + 1];

		for (int i = 2; i <= n; i++) {

			if (mark[i] == false) {
				for (int j = i * 2; j <= n; j = j + i) {
					mark[j] = true;
				}
			}

		}
		for (int j = 2; j <= n; j++) {
			if (mark[j] == false) {
				System.out.println(j);
			}
		}

	}

}
