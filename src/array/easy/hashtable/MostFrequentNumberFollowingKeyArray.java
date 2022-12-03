package array.easy.hashtable;

import java.util.*;

public class MostFrequentNumberFollowingKeyArray {
    public static void main(String[] args) {
        int[] nums = {1, 100, 200, 1, 100};
        System.out.println(mostFrequent(nums, 1));
    }

    public static int mostFrequent(int[] nums, int key) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] == key)
                map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        List<Map.Entry<Integer, Integer>> list = new LinkedList<>(map.entrySet());
        Collections.sort(list, (o1, o2) -> o2.getValue().compareTo(o1.getValue()));
        return list.get(0).getKey();
    }
}
