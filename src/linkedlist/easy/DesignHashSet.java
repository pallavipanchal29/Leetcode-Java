package linkedlist.easy;

import java.util.LinkedList;

public class DesignHashSet {
    LinkedList<Integer> set;

    public DesignHashSet() {
        set = new LinkedList<>();
    }

    public static void main(String[] args) {
        DesignHashSet myHashSet = new DesignHashSet();
        myHashSet.add(1);      // set = [1]
        myHashSet.add(2);      // set = [1, 2]
        System.out.println(myHashSet.contains(1)); // return True
        System.out.println(myHashSet.contains(3)); // return False, (not found)
        myHashSet.add(2);      // set = [1, 2]
        System.out.println(myHashSet.contains(2)); // return True
        myHashSet.remove(2);   // set = [1]
        System.out.println(myHashSet.contains(2));
    }

    public void add(int key) {
        if (!set.contains(key))
            set.add(key);
    }

    public void remove(int key) {
        if (set.contains(key))
            set.remove((Integer) key);

    }

    public boolean contains(int key) {
        return set.contains(key);
    }
}
