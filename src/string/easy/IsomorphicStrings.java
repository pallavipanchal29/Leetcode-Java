package string.easy;

import java.util.HashMap;

public class IsomorphicStrings {
    public static void main(String[] args) {
        System.out.println(isIsomorphic("egg", "add"));
    }

    public static boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> map = new HashMap();
        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            char b = t.charAt(i);
            if (map.containsKey(a)) {
                if (map.get(a) != b) return false;
            } else {
                if (map.containsValue(b)) return false;
                map.put(a, b);
            }
        }
        return true;
    }
}
