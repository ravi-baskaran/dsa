package dsa;

import java.util.Scanner;

public class PrimeNum {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int val = in.nextInt();

		System.out.println(isPrime(val));

	}

	static boolean isPrime(int num) {

		if (num <= 1) {
			return false;
		}

		int c = 2;

		while (c * c <= num) {//4<=9... 9<=9.... // 4<=7

			if (num % c == 0) {//9%4!=0.... 9%9=0...// 7 % 4 
				return false;
			}
			c++;  //... 3

		}if(c * c > num) {  // 9>7 - true
			return true;
		}return false;
		

	}

}
