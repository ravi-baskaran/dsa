package stack;

import java.util.Stack;

public class BalancedParanthesis {
    public static void main(String[] args) {

        String s = "{([])}";
        isBalanced(s);

    }

    static void isBalanced(String s) {

        Stack<Character> stack = new Stack<>();
        for (Character c : s.toCharArray()) {
            if (c == '{' || c == '(' || c == '[') {
                stack.push(c);
            }


            if (c == '}' && stack.peek() == '{') {
                stack.pop();
            } else if (c == ']' && stack.peek() == '[') {
                stack.pop();
            } else if (c == ')' && stack.peek() == '(') {
                stack.pop();
            }

        }
        if ((stack.isEmpty())) {
            System.out.println("yes bal");
        } else {
            System.out.println("not bal");
        }
    }
}
