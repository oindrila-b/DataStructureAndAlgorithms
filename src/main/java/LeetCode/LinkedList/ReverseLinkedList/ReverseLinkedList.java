package main.java.LeetCode.LinkedList.ReverseLinkedList;

import main.java.LeetCode.LinkedList.ListNode;

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode prevNode = null;
        ListNode currentNode = head;

        while (currentNode!= null) {
            ListNode next = currentNode.next;
            currentNode.next = prevNode;
            prevNode = currentNode;
            currentNode = next;
        }
        return prevNode;
    }
}
