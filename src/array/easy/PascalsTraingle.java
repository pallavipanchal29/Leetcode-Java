package array.easy;

import java.util.ArrayList;
import java.util.List;

public class PascalsTraingle {
    public static void main(String[] args) {
        List<List<Integer>> ans = generate(5);
    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> allrows = new ArrayList<>();
        ArrayList<Integer> row = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            row.add(0, 1);
            for (int j = 1; j < row.size() - 1; j++)
                row.set(j, row.get(j) + row.get(j + 1));
            allrows.add(new ArrayList<>(row));
        }
        return allrows;
    }
}
