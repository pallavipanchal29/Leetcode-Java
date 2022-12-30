package stack.easy;

import java.util.Stack;

public class RemoveOutermostParenthesis {
    public static void main(String[] args) {
        System.out.println(removeOuterParentheses("(()())(())(()(()))"));
    }

    public static String removeOuterParentheses(String s) {
        Stack<Character> st = new Stack<>();
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                if (st.size() != 0) {
                    ans.append("(");
                }
                st.push(ch);
            } else {
                st.pop();
                if (st.size() != 0) {
                    //this is a inner pair of bracket
                    ans.append(")");
                }
            }
        }
        return ans.toString();
    }
}
