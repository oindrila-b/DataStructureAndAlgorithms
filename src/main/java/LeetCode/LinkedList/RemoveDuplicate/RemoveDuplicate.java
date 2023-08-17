package main.java.LeetCode.LinkedList.RemoveDuplicate;

import main.java.LeetCode.LinkedList.ListNode;

public class RemoveDuplicate {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummyNode =  head;

        if (head==null) return head;

        while (dummyNode.next!= null){
            if (dummyNode.val != dummyNode.next.val) {
                dummyNode = dummyNode.next;
            } else {
                dummyNode.next = dummyNode.next.next;
            }
        }
        return head;
    }
}
