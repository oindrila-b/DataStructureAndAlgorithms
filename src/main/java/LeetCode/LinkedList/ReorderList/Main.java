package main.java.LeetCode.LinkedList.ReorderList;

import main.java.LeetCode.LinkedList.ListNode;

public class Main {
    public static void main(String[] args) {
        ReorderList reorderList = new ReorderList();
        ListNode ln1 = new ListNode(4, null);
        ListNode ln2 = new ListNode(3, ln1);
        ListNode ln3 = new ListNode(2, ln2);
        ListNode ln4 = new ListNode(1, ln3);

        reorderList.reorderList(ln4);
    }
}
