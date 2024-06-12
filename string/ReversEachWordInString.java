package string;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;



public class ReversEachWordInString {

	public static void main(String[] args) {
		String str = "hello my world";

		String[] s = str.split(" ");

		List<StringBuilder> collect = Arrays.stream(s).map(e -> new StringBuilder(e).reverse())
				.collect(Collectors.toList());

		System.out.print(collect + " ");
		
	//	revUsingStack(str);

	}

	static void revUsingStack(String str) {

		Stack<Character> stack = new Stack<>();

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ') {
				stack.push(str.charAt(i));
			} else {
				while(stack.empty() == false) {
					System.out.println(stack.pop());
				}
				
			}
		}System.out.println(" ");
		
		while(stack.empty() == false) {
			System.out.println(stack.pop());
		}

	}

}
