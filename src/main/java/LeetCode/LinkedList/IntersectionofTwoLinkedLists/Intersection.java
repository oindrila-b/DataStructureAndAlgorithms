package main.java.LeetCode.LinkedList.IntersectionofTwoLinkedLists;

import main.java.LeetCode.LinkedList.ListNode;

import java.util.ArrayList;
import java.util.List;

public class Intersection {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode intersectionNode = null;
            List<ListNode> firstListNodes = new ArrayList<>();
            while (headA!= null) {
                firstListNodes.add(headA);
                headA = headA.next;
            }

            while (headB!= null) {
                if (firstListNodes.contains(headB)) {
                    intersectionNode = headB;
                    break;
                }
                headB = headB.next;
            }

        return intersectionNode;
    }

}
