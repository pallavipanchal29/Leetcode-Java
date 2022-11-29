package array.easy;

import java.util.HashMap;

public class TwoSum
{
    public static int[] twoSum(int[] nums, int target)
    {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<nums.length;i++)
        {
            int val = target - nums[i];
            if(map.containsKey(val))
                return  new int[]{i,map.get(val)};
            else
                map.put(nums[i],i );
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args)
    {
        int[] nums = {2,7,11,15};
        int[] ans = twoSum(nums,9);

        System.out.println(ans[0]+" "+ans[1]);
    }
}
