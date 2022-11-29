package array.medium;

public class FirstAndLastPositionSortedArray {
    public static void main(String[] args) {
        int[] arr = {};
        int[] ans = searchRange(arr, 0);

        System.out.println(ans[0] + " " + ans[1]);
    }

    public static int[] searchRange(int[] nums, int target) {
        if (nums.length == 1) {
            if (nums[0] == target) return new int[]{0, 0};
            else return new int[]{-1, -1};
        }

        int first = findFirstOccurance(nums, 0, nums.length - 1, target);
        int last = findLastOccurance(nums, 0, nums.length - 1, target);
        if (first == -1 || last == -1) return new int[]{-1, -1};

        return new int[]{first, last};

    }

    private static int findLastOccurance(int[] nums, int low, int high, int target) {
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (mid >= nums.length) return -1;
            if (nums[mid] == target && (mid == nums.length - 1 || nums[mid + 1] != target))
                return mid;
            else if (nums[mid] > target)
                high = mid - 1;
            else if (nums[mid] <= target)
                low = mid + 1;
        }
        return -1;
    }

    private static int findFirstOccurance(int[] nums, int low, int high, int target) {
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (mid >= nums.length) return -1;
            if (nums[mid] == target && (mid == 0 || nums[mid - 1] != target))
                return mid;
            else if (nums[mid] >= target)
                high = mid - 1;
            else if (nums[mid] < target)
                low = mid + 1;
        }
        return -1;
    }

}
