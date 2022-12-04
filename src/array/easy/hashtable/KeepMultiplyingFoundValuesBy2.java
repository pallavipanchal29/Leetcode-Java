package array.easy.hashtable;

import java.util.HashSet;

public class KeepMultiplyingFoundValuesBy2 {
    public static void main(String[] args) {
        int[] nums = {8, 19, 4, 2, 15, 3};
        System.out.println(findFinalValue(nums, 2));
    }

    public static int findFinalValue(int[] nums, int original) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++)
            set.add(nums[i]);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == original)
                original = original * 2;
            while (set.contains(original))
                original = original * 2;
        }
        return original;
    }
}
