package string.easy;

public class IfTwoStringArraysEquivalent {
    public static void main(String[] args) {
        String[] w1 = {"ab", "c"};
        String[] w2 = {"a", "bc"};
        System.out.println(arrayStringsAreEqual(w1, w2));
    }

    public static boolean arrayStringsAreEqual(String[] w1, String[] w2) {
        StringBuilder s1 = new StringBuilder();
        for (String s : w1)
            s1.append(s);
        StringBuilder s2 = new StringBuilder();
        for (String s : w2)
            s2.append(s);
        return s1.toString().equals(s2.toString());
    }
}
