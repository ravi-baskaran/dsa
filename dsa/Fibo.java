package dsa;

import java.util.Scanner;

public class Fibo {

	public static void main(String[] args) {
		
		//Find nth fibo 
		
//		Scanner input = new Scanner(System.in);
//		int n = input.nextInt();
//		
//		int a = 0;
//		int b= 1;
//		
//		int count = 2;
//		
//		while(count <= n) {
//			int temp = b;
//			b= b+a;
//			a = temp;
//			count ++;
//		}
//		System.out.println(b);
		
		
		
		//Print series of fibo
		
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		
		int a = 0;
		int b = 1;
		
		int sum = 0;
		
		//System.out.print(a + " " + b);
		
		for(int i = 2; i<=n; i++) {
			sum = a+b;
//			System.out.print(" " +sum);
			a =b;
			b=sum;
			
		}System.out.println(b);
		

	}

}
