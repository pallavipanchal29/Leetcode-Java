package linkedlist.easy;

import linkedlist.ListNode;

public class MiddleOfLL {
    public static void main(String[] args) {

    }

    public static ListNode middleNode(ListNode head) {
        if (head == null) return null;
        int count = 0;
        ListNode temp = head;
        while (temp != null) {
            temp = temp.next;
            count++;
        }
        ListNode slow = head;
        ListNode fast = head;

        while (slow != null && fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast)
                break;
        }
        return count % 2 == 0 ? slow.next : slow;

    }
}
