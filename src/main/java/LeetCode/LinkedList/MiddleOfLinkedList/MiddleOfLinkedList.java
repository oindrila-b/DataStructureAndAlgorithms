package main.java.LeetCode.LinkedList.MiddleOfLinkedList;

import main.java.LeetCode.LinkedList.ListNode;

public class MiddleOfLinkedList {
    public ListNode middleNode(ListNode head) {
        ListNode fastNode = head;
        ListNode slowNode = head;

        while (fastNode!=null&&fastNode.next!=null) {
            fastNode = fastNode.next.next;
            slowNode = slowNode.next;
        }

        return slowNode;
    }
}
