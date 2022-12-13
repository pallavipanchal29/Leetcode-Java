package array.easy.math;

import java.util.ArrayList;
import java.util.List;

public class BinaryPrefixDivisibleBy5 {
    public static void main(String[] args) {
        int[] nums = {1, 0, 0, 1, 0, 1, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 1, 1, 0, 1, 0, 0, 0, 1};
        List<Boolean> ans = prefixesDivBy5(nums);

        for (Boolean i : ans)
            System.out.print(i + " ");

    }

    public static List<Boolean> prefixesDivBy5(int[] nums) {
        int sum = 0;
        int length = nums.length;
        List<Boolean> result = new ArrayList<>();
        //Go through the nums notice that shifting a binary number to the left is equals to multiplying a decimal number by 2
        for (int i = 0; i < length; i++) {
            //multiplying by 2 means shifting to left by one
            sum = sum * 2 + nums[i];
            if (sum % 5 == 0) {
                result.add(true);
            } else {
                result.add(false);
            }
            //This is to prevent it from overflow
            sum = sum % 5;
        }
        return result;
    }
}
