package string.easy;

public class FinalValueVariablesAfterOperations {
    public static void main(String[] args) {
        String[] arr = {"--X", "X++", "X++"};
        System.out.println(finalValueAfterOperations(arr));
    }

    public static int finalValueAfterOperations(String[] operations) {
        int X = 0;
        for (int i = 0; i < operations.length; i++) {
            switch (operations[i]) {
                case "--X":
                case "X--":
                    X = X - 1;
                    break;
                case "++X":
                case "X++":
                    X = X + 1;
                    break;
            }
        }
        return X;
    }
}

