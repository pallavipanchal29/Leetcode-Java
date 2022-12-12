package array.easy.TwoPointers;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        merge(nums1, 3, nums2, 3);
        for (int i : nums1)
            System.out.print(i + " ");

    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0;
        int j = 0;
        while (i < m && j < n) {
            if (nums1[i] == nums2[j] || nums1[i] < nums2[j]) {
                i++;
            } else if (nums1[i] > nums2[j]) {
                int t = nums1[i];
                nums1[i] = nums2[j];
                nums2[j] = t;
                i++;

                int p = 0;
                while (p < n - 1) {
                    while (p < n - 1 && nums2[p] > nums2[p + 1]) {
                        t = nums2[p];
                        nums2[p] = nums2[p + 1];
                        nums2[p + 1] = t;
                    }
                    p++;
                }
            }

        }
        j = 0;
        while (j < n) {
            nums1[i++] = nums2[j];
            j++;
        }
    }
}
