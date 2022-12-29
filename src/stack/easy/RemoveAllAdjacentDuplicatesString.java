package stack.easy;

import java.util.Stack;

public class RemoveAllAdjacentDuplicatesString {
    public static void main(String[] args) {
        System.out.println(removeDuplicates("abbaca"));
    }

    public static String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (!stack.isEmpty()) {
                if (stack.peek().equals(s.charAt(i))) {
                    stack.pop();
                } else
                    stack.push(s.charAt(i));
            } else
                stack.push(s.charAt(i));
        }
        StringBuilder ans = new StringBuilder();
        while (!stack.isEmpty())
            ans.append(stack.pop());
        return ans.reverse().toString();
    }
}
