package string.easy.hashtable;

import java.util.LinkedHashMap;
import java.util.Map;

public class KthDistinctStringArray {
    public static void main(String[] args) {
        String[] arr = {"d", "b", "c", "b", "c", "a"};
        System.out.println(kthDistinct(arr, 2));
    }

    public static String kthDistinct(String[] arr, int k) {
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                k--;
                if (k == 0)
                    return entry.getKey();
            }
        }
        return "";
    }

}
