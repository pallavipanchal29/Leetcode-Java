package array.easy.TwoPointers;

public class RemoveElement {
    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3};
        System.out.println(removeElement(nums, 3));
    }

    public static int removeElement(int[] nums, int val) {
        int idx = 0;
        int i = 0;
        while (i < nums.length) {
            if (nums[i] != val)
                nums[idx++] = nums[i];
            i++;
        }
        return idx;
    }
}
