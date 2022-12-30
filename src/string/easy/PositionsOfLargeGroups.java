package string.easy;

import java.util.ArrayList;
import java.util.List;

public class PositionsOfLargeGroups {
    public static void main(String[] args) {
        List<List<Integer>> ans = largeGroupPositions("aaa");
        for (List<Integer> l : ans) {
            System.out.print(l.get(0) + " " + l.get(1) + " ");
        }
    }

    public static List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> ans = new ArrayList<>();
        int i = 0;
        int j = 0;
        while (j < s.length()) {
            if (s.charAt(i) == s.charAt(j))
                j++;
            else {
                List<Integer> l = new ArrayList<>();
                if (j - i >= 3) {
                    l.add(i);
                    l.add(j - 1);
                    ans.add(l);
                }
                i = j;
            }
        }
        if (j - i >= 3) {
            List<Integer> l = new ArrayList<>();
            l.add(i);
            l.add(j - 1);
            ans.add(l);
        }
        return ans;
    }
}
