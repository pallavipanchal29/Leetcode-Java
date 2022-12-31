package string.easy;

public class ShuffleString {
    public static void main(String[] args) {
        System.out.println(restoreString("codeleet", new int[]{4, 5, 6, 7, 0, 2, 1, 3}));
    }

    public static String restoreString(String s, int[] indices) {
        char[] temp = s.toCharArray();
        char[] ans = new char[s.length()];

        for (int i = 0; i < temp.length; i++) {
            ans[indices[i]] = temp[i];
        }
        return String.valueOf(ans);
    }
}
