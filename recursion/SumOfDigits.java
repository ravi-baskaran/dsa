package recursion;

public class SumOfDigits {

	public static void main(String[] args) {

		int n = 173;
		System.out.println(sumRec(n, 1));

	}

	static int sumRec(int n, int sum) {

		if (n == 0) {
			return sum;
		}

		return sumRec(n / 10, sum * (n % 10));

	}

	static int sum(int n) {

		int sumD = 0;
		while (n != 0) {
			int rem = n % 10;
			sumD = sumD + rem;
			n = n / 10;
		}
		return sumD;

	}

}
