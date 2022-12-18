package array.easy;

import java.util.*;

public class MajorityElement {
    public static void main(String[] args) {
        System.out.println(majorityElement(new int[]{2, 2, 1, 1, 1, 2, 2}));
    }

    public static int majorityElementHashmap(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++)
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, (o1, o2) -> {
            if (o2.getValue().equals(o1.getValue()))
                return o2.getKey().compareTo(o1.getKey());
            else
                return o2.getValue().compareTo(o1.getValue());
        });
        if (list.get(0).getValue() >= Math.floor(nums.length) / 2)
            return list.get(0).getKey();
        return -1;
    }

    public static int majorityElementSorting(int[] nums) {
        Arrays.sort(nums);
        if (nums[nums.length / 2] == nums[nums.length - 1])
            return nums[nums.length - 1];
        return -1;
    }

    public static int majorityElement(int[] nums) {
        int major = nums[0], count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (count == 0) {
                count++;
                major = nums[i];
            } else if (major == nums[i]) {
                count++;
            } else count--;
        }
        return major;
    }
}
