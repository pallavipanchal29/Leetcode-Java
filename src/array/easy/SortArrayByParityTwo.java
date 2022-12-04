package array.easy;

public class SortArrayByParityTwo {
    public static void main(String[] args) {
        int[] nums = {4, 2, 5, 7};
        int[] res = sortArrayByParityII(nums);

        for (int i : res)
            System.out.print(i + " ");
    }

    public static int[] sortArrayByParityII(int[] nums) {
        int j = 1;
        for (int i = 0; i < nums.length; i += 2) // going through even places
            if (nums[i] % 2 == 1) // if an odd element found
            {
                while (nums[j] % 2 == 1) // till I am finding odd elements i increment j ( going through odd places)
                    j += 2;

                //if nums[j] is even swap it with earlier odd element
                // Swap A[i] and A[j]
                int tmp = nums[i];
                nums[i] = nums[j];
                nums[j] = tmp;
            }

        return nums;
    }
}
