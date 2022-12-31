package stack.easy;

import java.util.Stack;

public class MakeStringGreat {
    public static void main(String[] args) {
        System.out.println(makeGood("Hvh"));
    }

    public static String makeGood(String s) {
        if (s == "") return s;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (stack.isEmpty())
                stack.push(s.charAt(i));
            else {
                char c = stack.peek();
                if ((String.valueOf(c).compareToIgnoreCase(String.valueOf(s.charAt(i))) == 0) && ((Character.isLowerCase(c) && Character.isUpperCase(s.charAt(i))) || (Character.isUpperCase(c) && Character.isLowerCase(s.charAt(i)))))
                    stack.pop();
                else
                    stack.push(s.charAt(i));
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty())
            sb.append(stack.pop());
        return sb.reverse().toString();
    }
}
