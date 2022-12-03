package array.easy.hashtable;

import java.util.*;

public class MostFrequentEvenElement {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 2, 4, 4, 1};
        System.out.println(mostFrequentEven(arr));
    }

    //Time Complexity : O(N)+O(N) => O(N)
    //Space complexity : O(N)
    public static int mostFrequentEven(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0)
                map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        List<Map.Entry<Integer, Integer>> list = new LinkedList<>(map.entrySet());
        Collections.sort(list, (o1, o2) -> {
            if (o1.getValue() == o2.getValue())
                return o1.getKey().compareTo(o2.getKey());
            else
                return o2.getValue().compareTo(o1.getValue());
        });
        return list.size() == 0 ? -1 : list.get(0).getKey();
    }
}
