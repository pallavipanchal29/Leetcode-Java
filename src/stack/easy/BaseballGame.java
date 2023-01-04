package stack.easy;

import java.util.Stack;

public class BaseballGame {
    public static void main(String[] args) {
        System.out.println(calPoints(new String[]{"5", "2", "C", "D", "+"}));
    }

    public static int calPoints(String[] operations) {
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < operations.length; i++) {
            switch (operations[i]) {
                case "C":
                    stack.pop();
                    break;
                case "D":
                    int d = Integer.parseInt(stack.peek()) * 2;
                    stack.push(String.valueOf(d));
                    break;
                case "+":
                    int a = Integer.parseInt(stack.pop());
                    int b = Integer.parseInt(stack.pop());
                    int c = a + b;
                    stack.push(String.valueOf(b));
                    stack.push(String.valueOf(a));
                    stack.push(String.valueOf(c));
                    break;
                default:
                    stack.push(operations[i]);

            }
        }
        int sum = 0;
        while (!stack.isEmpty())
            sum = sum + Integer.parseInt(stack.pop());
        return sum;
    }
}
