package leetcode.intersection_of_two_linked_lists;

import java.util.*;
import leetcode.util.ListNode;

class Solution {
  public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    int lenA, lenB;

    if (headA == null || headB == null) {
      return null;
    }

    lenA = getLen(headA);
    lenB = getLen(headB);

    if (lenA > lenB)
      headA = forward(headA, lenA - lenB);
    else
      headB = forward(headB, lenB - lenA);

    while (headA != headB) {
      headA = headA.next;
      headB = headB.next;
    }

    return headA;
  }

  private int getLen(ListNode n) {
    int counter;

    counter = 0;
    while(n != null) {
      counter++;
      n = n.next;
    }

    return counter;
  }

  private ListNode forward(ListNode n, int steps) {
    while(steps > 0) {
      n = n.next;
      steps--;
    }

    return n;
  }
}
