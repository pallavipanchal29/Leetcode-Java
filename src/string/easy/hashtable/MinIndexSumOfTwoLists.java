package string.easy.hashtable;

import java.util.*;

public class MinIndexSumOfTwoLists {
    public static void main(String[] args) {
        String[] arr1 = {"Shogun", "Tapioca Express", "Burger King", "KFC"};
        String[] arr2 = {"KFC", "Shogun", "Burger King"};
        String[] ans = findRestaurant(arr1, arr2);

        for (String s : ans)
            System.out.print(s + " ");
    }

    public static String[] findRestaurant(String[] list1, String[] list2) {
        List<String> ans = new ArrayList<>();
        HashMap<String, Integer> map1 = new HashMap<>();
        for (int i = 0; i < list1.length; i++)
            map1.put(list1[i], i);

        HashMap<String, Integer> map2 = new HashMap<>();
        for (int i = 0; i < list2.length; i++)
            map2.put(list2[i], i);

        var keys1 = map1.keySet();
        var keys2 = map2.keySet();
        keys1.retainAll(keys2);

        Iterator<String> it = keys1.iterator();
        HashMap<String, Integer> temp = new HashMap<>();
        int min = Integer.MAX_VALUE;
        while (it.hasNext()) {
            String key = it.next();
            if (map1.containsKey(key) && map2.containsKey(key)) {
                int val = map1.get(key) + map2.get(key);
                min = Math.min(val, min);
                temp.put(key, val);
            }
        }
        for (Map.Entry<String, Integer> entry : temp.entrySet()) {
            if (entry.getValue() == min)
                ans.add(entry.getKey());
        }
        String[] res = new String[ans.size()];
        int ind = 0;
        for (String s : ans)
            res[ind++] = s;
        return res;
    }
}
