package main.java.LeetCode.LinkedList.MiddleOfLinkedList;

import main.java.LeetCode.LinkedList.ListNode;

public class Main {
    public static void main(String[] args) {
        ListNode ln1 = new ListNode(6, null);
        ListNode ln2 = new ListNode(5, ln1);
        ListNode ln3 = new ListNode(4, ln2);
        ListNode ln4 = new ListNode(3, ln3);
        ListNode ln5 = new ListNode(2, ln4);
        ListNode ln6 = new ListNode(1, ln5);

        MiddleOfLinkedList middleOfLinkedList = new MiddleOfLinkedList();
        ListNode node = middleOfLinkedList.middleNode(ln6);

        while (node!=null) {
            System.out.println(node.val);
            node = node.next;
        }

    }
}
