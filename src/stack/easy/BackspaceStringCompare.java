package stack.easy;

import java.util.Stack;

public class BackspaceStringCompare {
    public static void main(String[] args) {
        System.out.println(backspaceCompare("abcd", "bbcd"));
    }

    public static boolean backspaceCompare(String s, String t) {
        if (s.length() == 0 || t.length() == 0) return false;
        Stack<Character> stack1 = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '#') {
                if (stack1.size() > 0)
                    stack1.pop();
            } else
                stack1.push(s.charAt(i));
        }
        Stack<Character> stack2 = new Stack<>();
        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i) == '#') {
                if (stack2.size() > 0)
                    stack2.pop();
            } else
                stack2.push(t.charAt(i));
        }
        if (stack1.size() != stack2.size()) return false;
        int count = stack1.size();
        for (int i = 0; i < count; i++) {
            if (stack1.pop() != stack2.pop())
                return false;
        }
        return true;
    }
}
