package main.java.LeetCode.LinkedList.RemoveLinkedListElements;

import main.java.LeetCode.LinkedList.ListNode;
public class RemoveLinkedListElements   {
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummyNode = new ListNode(0);
        dummyNode.next = head;
        ListNode currentNode = dummyNode;

        while (currentNode.next != null) {
            if (currentNode.next.val == val) {
                currentNode.next = currentNode.next.next;
            } else {
                currentNode = currentNode.next;
            }
        }
        return dummyNode.next;
    }
}
