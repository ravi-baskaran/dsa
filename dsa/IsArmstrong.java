package dsa;

import java.util.Scanner;

public class IsArmstrong {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		//int input = in.nextInt();
		
	//	System.out.println(isArmstrong(input));
		
		for(int i =100; i<1000; i++) {
			if(isArmstrong(i)) {
				System.out.println(i);

			}
		}

	}
	
	static boolean isArmstrong(int a) {
		
		int original = a;
		int sum = 0;
		
		while(a > 0) {
			
			int rem = a % 10;
			a = a/10;
			
			sum = sum + rem*rem*rem;
			
		}if (sum == original) {
			return true;
		}return false;
		
		
	}

}
