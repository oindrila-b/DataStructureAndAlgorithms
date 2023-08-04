package main.java.LeetCode.LinkedList.MergeLinkedList;

import main.java.LeetCode.LinkedList.ListNode;

public class MergedLinkedList2 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummyNode = new ListNode();
        ListNode tail = new ListNode();
        tail = dummyNode;


        while (list1!= null && list2!= null) {
          if (list1.val < list2.val) {
              tail.next = list1;
              list1 = list1.next;
          } else {
              tail.next = list2;
              list2 = list2.next;
          }
          tail = tail.next;
        }

        if (list1 == null)  tail.next = list2;
        if (list2 == null)  tail.next = list1;

        return dummyNode.next;
    }
}
