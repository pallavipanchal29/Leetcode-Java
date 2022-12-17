package linkedlist.easy;

import linkedlist.ListNode;

public class MergeTwoSortedLists {

    public static void main(String[] args) {
        ListNode head1 = new ListNode(2);
//        head1.next = new ListNode(2);
//        head1.next.next = new ListNode(4);

        ListNode head2 = new ListNode(1);
//        head2.next = new ListNode(3);
//        head2.next.next = new ListNode(4);

        ListNode head = mergeTwoLists(head1, head2);

        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }

    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode ans = null;
        if (list1 == null && list2 == null)
            return null;
        else if (list1 == null)
            return list2;
        else if (list2 == null)
            return list1;

        while (list1 != null && list2 != null) {
            if (list1.val == list2.val) {
                ans = AppendAtEnd(list1.val, ans);
                ans = AppendAtEnd(list1.val, ans);
                list1 = list1.next;
                list2 = list2.next;
            } else if (list1.val < list2.val) {
                ans = AppendAtEnd(list1.val, ans);
                list1 = list1.next;
            } else {
                ans = AppendAtEnd(list2.val, ans);
                list2 = list2.next;
            }
        }
        while (list1 != null) {
            ans = AppendAtEnd(list1.val, ans);
            list1 = list1.next;
        }
        while (list2 != null) {
            ans = AppendAtEnd(list2.val, ans);
            list2 = list2.next;
        }
        return ans;
    }

    public static ListNode AppendAtEnd(int val, ListNode ans) {
        ListNode temp = ans;
        if (ans == null) {
            ans = new ListNode(val);
            return ans;
        }
        while (temp.next != null)
            temp = temp.next;
        temp.next = new ListNode(val);
        return ans;
    }
}
