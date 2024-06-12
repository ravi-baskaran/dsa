package dsa;

import java.util.Scanner;

public class FunctionDemo {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		 //int input = in.nextInt();
	//	 int input1 = in.nextInt();
		 String inp = in.next();
		System.out.println(isPalindrome(inp));
		 
		// System.out.println(getGrades(input));
		 
		// System.out.println(sumOfTwo(input, input1));
		 
		//System.out.println("is valid voter: " +isValidVoter(input));
	}
	
	static boolean isValidVoter(int n) {
		
		if(n>18) {
			return true;
		}else {
			return false;
		}	
	}
	
	static int sumOfTwo(int a, int b) {
		
		return a+b;
	}
	
	static String getGrades(int n) {
		
		if(n>=90 && n <=100) {
			return "AA";
		}
		if(n>=80 && n <=90) {
			return "BB";
		}
		if(n>=70 && n <=80) {
			return "CC";
		}
		else {
			return "fail";
		}
	}
	
	static boolean isPalindrome(String num) {
		
		int start =0;
		int end =num.length()-1;
		boolean isPal = false;
		
		if(num.charAt(start) == num.charAt(end)) {
			
			return isPal= true;
		}
		start++;
		end--;
		return false;
		
		
		
	}
	
	
	
	
	

}
