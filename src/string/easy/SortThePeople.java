package string.easy;

import java.util.*;

public class SortThePeople {
    public static void main(String[] args) {
        String[] names = {"Mary", "John", "Emma"};
        int[] heights = {180, 165, 170};

        String[] ans = sortPeople(names, heights);
        for (int i = 0; i < ans.length; i++)
            System.out.print(ans[i] + " ");
    }

    public static String[] sortPeople(String[] names, int[] heights) {
        List<Map.Entry<String, Integer>> list = new LinkedList<>();
        for (int i = 0; i < names.length; i++) {
            Map.Entry<String, Integer> entry = new AbstractMap.SimpleEntry<>(names[i], heights[i]);
            list.add(entry);
        }
        Collections.sort(list, (o1, o2) -> o2.getValue().compareTo(o1.getValue()));
        String[] ans = new String[list.size()];
        for (int i = 0; i < ans.length; i++)
            ans[i] = list.get(i).getKey();
        return ans;
    }
}
