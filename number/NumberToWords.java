package number;

public class NumberToWords {

	public static void main(String[] args) {

		int num = 761;

		System.out.println(words(num));

	}

	static String words(int num) {

		String[] unit = { "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };

		String[] teens = { "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen",
				"eighteen", "nineteen" };

		String[] tens = { "", "", "twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty", "ninety" };

		if (num < 20) {
			return teens[num % 10];
		} else if (num < 100) {
			return tens[num / 10] + " " + unit[num % 10];
		} else if (num < 1000) {
			return unit[num / 100] + " hundred " + words(num % 100);
		} else {
			return "not valid";
		}

	}

}
