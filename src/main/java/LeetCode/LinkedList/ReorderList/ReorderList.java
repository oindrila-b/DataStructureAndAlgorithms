package main.java.LeetCode.LinkedList.ReorderList;

import main.java.LeetCode.LinkedList.ListNode;

public class ReorderList {

    /***
     *  LOGIC :
     *  Find the middle by moving fast & slow iterators.
     * Remember right part beginning and cut off left part from the right.
     * Reverse right list, remember it new beginning.
     * Iterate left part from beginning and right part merging right list nodes into left list.
     * */
    public void reorderList(ListNode head) {

        ListNode fastNode = head;
        ListNode slowNode = head;

        while (fastNode!=null&&fastNode.next!=null) {
            fastNode = fastNode.next.next;
            slowNode = slowNode.next;
        }

        ListNode prev =  null;
        ListNode current = slowNode;

        while (current!=null) {
            ListNode next  = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        while (prev!= null && head!=null) {
            ListNode next = head.next;
            head.next = prev;
            head = next;
            prev = prev.next;
        }

    }
}
