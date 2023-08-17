package main.java.LeetCode.LinkedList.PalindromeLinkedList;

import main.java.LeetCode.LinkedList.ListNode;

public class Main {
    public static void main(String[] args) {

        ListNode l1 = new ListNode(1, null);
        ListNode l2 = new ListNode(2, l1);
        ListNode l3 = new ListNode(2, l2);
        ListNode l4 = new ListNode(1, l3);

        ListNode listNode1 = new ListNode(1, null);
        ListNode listNode2 = new ListNode(2, listNode1);
        ListNode listNode3 = new ListNode(3, listNode2);
        ListNode listNode4 = new ListNode(1, listNode3);

        ListNode ln1 = new ListNode(1, null);
        ListNode ln2 = new ListNode(3, ln1);
        ListNode ln3 = new ListNode(2, ln2);
        ListNode ln4 = new ListNode(4, ln3);
        ListNode ln5 = new ListNode(2, ln4);
        ListNode ln6 = new ListNode(3, ln5);
        ListNode ln7 = new ListNode(1, ln6);

        PalindromeLinkedList palindromeLinkedList = new PalindromeLinkedList();

        System.out.println(palindromeLinkedList.isPalindrome(l4));

        System.out.println(palindromeLinkedList.isPalindrome(listNode4));

        System.out.println(palindromeLinkedList.isPalindromeTwo(ln7));

    }
}
