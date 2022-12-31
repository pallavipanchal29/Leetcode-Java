package string.easy;

public class GoalParserInterpretation {
    public static void main(String[] args) {
        System.out.println(interpret("G()(al)"));
    }

    public static String interpret(String command) {
        StringBuilder ans = new StringBuilder();

        int i = 0;
        while (i < command.length()) {
            if (command.charAt(i) == 'G') {
                ans.append(command.charAt(i));
                i++;
            } else {
                if (command.charAt(i) == '(') {
                    if (i + 1 < command.length() && command.charAt(i + 1) == ')') {
                        ans.append('o');
                        i = i + 2;
                    } else if (i + 3 < command.length() && command.substring(i + 1, i + 4).compareTo("al)") == 0) {
                        ans.append("al");
                        i = i + 4;
                    }
                }
            }
        }

        return ans.toString();
    }
}
