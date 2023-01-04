package array.easy.math;

import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumbers {
    public static void main(String[] args) {
        List<Integer> ans = selfDividingNumbers(1, 22);
        for (int i : ans)
            System.out.print(i + " ");
    }

    public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if (i > 0 && i < 10)
                ans.add(i);
            else {
                int num = i;
                boolean isValid = true;
                while (num != 0) {
                    int t = num % 10;
                    if (t == 0 || i % t != 0) {
                        isValid = false;
                        break;
                    }
                    num = num / 10;
                }
                if (isValid) ans.add(i);
            }
        }
        return ans;
    }
}
