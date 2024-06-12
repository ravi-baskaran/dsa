package dsa;

import java.util.Scanner;

public class CalculatorProgram {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
	
		
		int res =0;
		
		while(true) {
			System.out.println("enter operation");
			char op = in.next().trim().charAt(0);
			if(op=='+' || op=='-' || op=='*' || op=='/' || op=='%') {
				
				System.out.println("enter 2 num");
			    int a =	in.nextInt();
				int b = in.nextInt();
				
				if(op=='+') {
					res = a+b;
				}
				if(op=='-') {
					res = a-b;
				}
				if(op=='*') {
					res = a*b;
				}
				if(op=='/') {
					if(a>b) {
						res = a/b;
					}
				}
				if(op=='%') {
					res = a%b;
				}
				
				
			}
			else if(op=='x' || op=='X') {
				break;
			}else {
				System.out.println("Invalid operation");
			}
			System.out.println(res);
		}
		

	}

}

/*
 *  Scanner in = new Scanner(System.in);
        // Take input from user till user does not press X or x
        int ans = 0;
        while (true) {
            // take the operator as input
            System.out.print("Enter the operator: ");
            char op = in.next().trim().charAt(0);

            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                // input two numbers
                System.out.print("Enter two numbers: ");
                int num1 = in.nextInt();
                int num2 = in.nextInt();

                if (op == '+') {
                    ans = num1 + num2;
                }
                if (op == '-') {
                    ans = num1 - num2;
                }
                if (op == '*') {
                    ans = num1 * num2;
                }
                if (op == '/') {
                    if (num2 != 0) {
                        ans = num1 / num2;
                    }
                }
                if (op == '%') {
                    ans = num1 % num2;
                }
            } else if (op == 'x' || op == 'X') {
                break;
            } else {
                System.out.println("Invalid operation!!");
            }
            System.out.println(ans);
        }
 * 
 * 
 * 
 * 
 */
