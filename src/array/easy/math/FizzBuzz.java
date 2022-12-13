package array.easy.math;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public static void main(String[] args) {
        List<String> ans = fizzBuzz(3);
        for (String s : ans)
            System.out.print(s + " ");
    }

    public static List<String> fizzBuzz(int n) {
        List<String> ans = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 15 == 0)
                ans.add("FizzBuzz");
            else if (i % 5 == 0)
                ans.add("Buzz");
            else if (i % 3 == 0)
                ans.add("Fizz");
            else
                ans.add(String.valueOf(i));
        }
        return ans;
    }
}
