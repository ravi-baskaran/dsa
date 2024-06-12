package dsa;

import java.util.Scanner;

public class NaturalNum {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

		// int input = in.nextInt();
		
		int input = 5;
		 System.out.println(sumOfNaturalNum(input));
	}
	
	static int sumOfNaturalNum(int n) {
		
		int sum = 0;
		
		for(int i =0; i<=n; i++) {
			sum = sum+i;
		}return sum;
		
	}

}
