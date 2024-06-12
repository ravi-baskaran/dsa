package dsa;

import java.util.Scanner;

public class DsaDemo {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int num = input.nextInt();

		int lar = 0;

		while (num != 0) {

			if(num> lar) {
				lar=num;
			}

			 num = input.nextInt();

		}
		System.out.println(lar);

	}

}
