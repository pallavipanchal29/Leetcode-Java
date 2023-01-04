package stack.easy;

import java.util.Stack;

public class CrawlerLogFolder {
    public static void main(String[] args) {
        System.out.println(minOperations(new String[]{"d1/", "../", "../", "../"}));
    }

    public static int minOperations(String[] logs) {
        int count = 0;
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < logs.length; i++) {
            switch (logs[i]) {
                case "../":
                    if (!stack.isEmpty()) stack.pop();
                    break;
                case "./":
                    continue;
                default:
                    stack.push(logs[i]);
                    break;
            }
        }
        while (!stack.isEmpty()) {
            stack.pop();
            count++;
        }
        return count;
    }
}
