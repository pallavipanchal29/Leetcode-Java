package array.easy;

import java.util.Collections;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.TreeSet;

public class ThirdMaximumNumber {
    public static void main(String[] args) {
        System.out.println(thirdMaxPriorityQueue(new int[]{1, 2, 3}));
    }

    public static int thirdMaxTreeSet(int[] nums) {
        TreeSet<Integer> set = new TreeSet<>(Collections.reverseOrder());
        for (int i : nums)
            set.add(i);
        int[] sorted = new int[set.size()];
        int ind = 0;
        Iterator<Integer> it = set.iterator();
        while (it.hasNext())
            sorted[ind++] = it.next();
        if (sorted.length < 3) return sorted[0];
        return sorted[2];
    }

    public static int thirdMaxPriorityQueue(int[] nums) {
        int n = 3;
        int elm = 0;
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        for (int i : nums)
            if (!queue.contains(i)) queue.add(i);
        if (queue.size() < 3) return queue.peek();
        while (queue.size() > 0 && n > 0) {
            elm = queue.peek();
            queue.poll();
            n--;
        }
        return elm;
    }
}
