package array.easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args) {
        int[] ans = nextGreaterElement(new int[]{4, 1, 2}, new int[]{1, 3, 4, 2});
        for (int i : ans)
            System.out.print(i + " ");
    }

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] nge = new int[nums1.length];
        Stack<Integer> st = new Stack<>();
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums2.length; i++) {
            // nge
            while (!st.isEmpty() && nums2[i] > st.peek()) {
                map.put(st.pop(), nums2[i]);
            }

            st.push(nums2[i]);
        }

        for (int i = 0; i < nums1.length; i++) {
            nge[i] = map.getOrDefault(nums1[i], -1);
        }

        return nge;
    }
}
