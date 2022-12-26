package array.easy.TwoPointers;

public class MoveZeroes {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        moveZeroes(arr);

        for (int i : arr)
            System.out.print(i + " ");
    }

    public static void moveZeroes(int[] nums) {
        int idx = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0)
                nums[idx++] = nums[i];
        }
        for (int i = idx; i < nums.length; i++)
            nums[i] = 0;
    }
}
