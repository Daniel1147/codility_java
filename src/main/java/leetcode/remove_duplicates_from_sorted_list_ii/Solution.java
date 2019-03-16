package leetcode.remove_duplicates_from_sorted_list_ii;

import java.util.*;
import leetcode.util.*;

class Solution {
  public ListNode deleteDuplicates(ListNode head) {
    ListNode fakeHead, p1, p2, p3;

    fakeHead = new ListNode(0);
    fakeHead.next = head;

    p1 = fakeHead;
    p2 = fakeHead.next;

    while (p2 != null && p2.next != null) {
      p3 = p2.next;
      if (p2.val == p3.val) {
        while (p3 != null && p3.val == p2.val) {
          p3 = p3.next;
        }
        p2 = p3;
        p1.next = p2;
      } else {
        p2 = p2.next;
        p1 = p1.next;
      }
    }

    return fakeHead.next;
  }
}
