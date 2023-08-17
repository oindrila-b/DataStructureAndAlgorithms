package main.java.LeetCode.LinkedList.PalindromeLinkedList;

import main.java.LeetCode.LinkedList.ListNode;

import java.util.ArrayList;
import java.util.List;

public class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        List<Integer> list = new ArrayList<>();

        while (head!= null) {
            list.add(head.val);
            head = head.next;
        }
        int k = 0;
        for (int i = list.size () -1; i >=0 ; i--) {
            if (list.get(k++) != list.get(i)) {
                return false;
            }
        }
        return true;
    }

    public boolean isPalindromeTwo(ListNode listNode) {

        ListNode slow = listNode;
        ListNode fast = listNode;

        while (fast!= null && fast.next!= null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        slow = reverseNode(slow);
        fast = listNode;

        while (slow!= null) {
            if (slow.val != fast.val){
                return false;
            }
            slow = slow.next;
            fast = fast.next;
        }
    return true;
    }

    private ListNode reverseNode(ListNode node) {
        ListNode prevNode = null;
        ListNode currentNode = node;

        while (currentNode!= null) {
            ListNode next = currentNode.next;
            currentNode.next = prevNode;
            prevNode = currentNode;
            currentNode = next;
        }
        return  prevNode;
    }
}
