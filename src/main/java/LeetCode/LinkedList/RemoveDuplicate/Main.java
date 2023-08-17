package main.java.LeetCode.LinkedList.RemoveDuplicate;

import main.java.LeetCode.LinkedList.ListNode;

public class Main {
    public static void main(String[] args) {
        ListNode ln1 = new ListNode(3, null);
        ListNode ln2 = new ListNode(3, ln1);
        ListNode ln3 = new ListNode(4, ln2);
        ListNode ln4 = new ListNode(4, ln3);
        ListNode ln5 = new ListNode(2, ln4);
        ListNode ln6 = new ListNode(3, ln5);
        ListNode ln7 = new ListNode(1, ln6);

        RemoveDuplicate removeDuplicate = new RemoveDuplicate();
        removeDuplicate.deleteDuplicates(ln7);
    }
}
