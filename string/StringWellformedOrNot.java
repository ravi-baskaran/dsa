package string;

import java.util.Stack;

public class StringWellformedOrNot {

	public static void main(String[] args) {
		
		String str = "{()}";
		
		isWellBalanced(str);
	
	}
	
	static void isWellBalanced(String str) {
		
		char[] c = str.toCharArray();
		Stack<Character> stack = new Stack<>();
		
		for(char s : c ) {
			
			if(stack.isEmpty()) {
				stack.push(s);
			}else if(s=='{' || s=='(' || s=='[') {
				stack.push(s);
			}else if(s==')' && stack.peek()=='(' ) {
				stack.pop();
			}else if(s=='}' && stack.peek()=='{' ) {
				stack.pop();
			}
		}if(stack.isEmpty()) {
			System.out.println("well formed");
		}else {
			System.out.println("not well");
		}
		
	}

}
