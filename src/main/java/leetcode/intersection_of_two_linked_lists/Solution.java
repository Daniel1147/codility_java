package leetcode.intersection_of_two_linked_lists;

import java.util.*;
import leetcode.util.ListNode;

class Solution {
  public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    ListNode A, B;

    if (headA == null || headB == null)
      return null;

    A = headA;
    B = headB;

    while (A != B) {
      if (A.next == null && B.next == null)
        return null;

      if (A.next == null)
        A = headB;
      else
        A = A.next;

      if (B.next == null)
        B = headA;
      else
        B = B.next;
    }

    return A;
  }
}
