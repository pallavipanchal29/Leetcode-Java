package stack.easy;

import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args) {
        System.out.println(isValid("()[]{}"));
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '{' || c == '[')
                stack.push(c);
            else {
                if (stack.size() == 0) return false;
                char p;
                switch (c) {
                    case ')':
                        p = stack.peek();
                        if (p == '{' || p == '[')
                            return false;
                        else
                            stack.pop();
                        break;
                    case '}':
                        p = stack.peek();
                        if (p == '(' || p == '[')
                            return false;
                        else
                            stack.pop();
                        break;
                    case ']':
                        p = stack.peek();
                        if (p == '{' || p == '(')
                            return false;
                        else
                            stack.pop();
                        break;
                }
            }
        }
        return stack.size() == 0;
    }
}
