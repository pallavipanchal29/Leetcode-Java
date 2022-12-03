package array.easy.hashtable;

import java.util.*;

public class SortArrayByIncreasingFrequency {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 2, 3};
        int[] ans = frequencySort(arr);

        for (int i = 0; i < ans.length; i++)
            System.out.print(ans[i] + " ");
    }

    public static int[] frequencySort(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++)
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);

        List<Map.Entry<Integer, Integer>> list = new LinkedList<>(map.entrySet());
        Collections.sort(list, (o1, o2) -> {
            if (o1.getValue() == o2.getValue())
                return o2.getKey().compareTo(o1.getKey());
            else
                return o1.getValue().compareTo(o2.getValue());
        });
        int[] ans = new int[nums.length];
        int index = 0;
        for (int i = 0; i < list.size(); i++) {
            int val = list.get(i).getValue();
            while (val > 0) {
                ans[index++] = list.get(i).getKey();
                val--;
            }
        }
        return ans;
    }
}
