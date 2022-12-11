package array.easy.TwoPointers;

public class RemoveDuplicatesSortedArray {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2};
        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) {
        int idx = 1;
        int i = 1;
        while (i < nums.length) {
            if (nums[i] != nums[i - 1])
                nums[idx++] = nums[i];
            i++;
        }
        return idx;
    }
}
