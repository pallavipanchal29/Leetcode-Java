package string.easy;

public class StrongPasswordCheckerTwo {
    public static void main(String[] args) {
        System.out.println(strongPasswordCheckerII("IloveLe3tcode!"));
    }

    public static boolean strongPasswordCheckerII(String password) {
        if (password.length() < 8) return false;
        int lower = 0;
        int upper = 0;
        int digit = 0;
        int special = 0;
        for (int i = 0; i < password.length(); i++) {
            if (i < password.length() - 1 && password.charAt(i) == password.charAt(i + 1)) return false;
            else if (Character.isLowerCase(password.charAt(i))) lower++;
            else if (Character.isUpperCase(password.charAt(i))) upper++;
            else if (Character.isDigit(password.charAt(i))) digit++;
            else if ("!@#$%^&*()-+".contains(String.valueOf(password.charAt(i)))) special++;
        }
        return lower >= 1 && upper >= 1 && special >= 1 && digit >= 1;
    }
}
