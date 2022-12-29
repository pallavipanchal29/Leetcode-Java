package string.easy.hashtable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DestinationCity {
    public static void main(String[] args) {
        List<List<String>> list = new ArrayList<>();
        List<String> l1 = new ArrayList<>();
        l1.add("London");
        l1.add("New York");
        list.add(l1);

        List<String> l2 = new ArrayList<>();
        l2.add("New York");
        l2.add("Lima");
        list.add(l2);

        List<String> l3 = new ArrayList<>();
        l3.add("Lima");
        l3.add("Sao Paulo");
        list.add(l3);

        System.out.println(destCity(list));
    }

    public static String destCity(List<List<String>> paths) {
        HashMap<String, String> map = new HashMap<>();
        for (int i = 0; i < paths.size(); i++) {
            List<String> l = paths.get(i);
            map.put(l.get(0), l.get(1));
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            var val = entry.getValue();
            if (!map.containsKey(val))
                return val;
        }
        return null;
    }
}
