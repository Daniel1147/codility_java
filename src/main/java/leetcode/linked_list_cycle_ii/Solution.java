package leetcode.linked_list_cycle_ii;

import java.util.*;
import leetcode.util.*;

class Solution {
  public ListNode detectCycle(ListNode head) {
    ListNode p1, p2, before;

    if (head == null)
      return null;

    p1 = head;
    p2 = head;

    do {
      if (p2.next == null)
        return null;
      p2 = p2.next;

      if (p2.next == null)
        return null;
      p2 = p2.next;

      before = p1;
      p1 = p1.next;
    } while (p1 != p2);

    p2 = head;
    while (p1 != p2) {
      p1 = p1.next;
      p2 = p2.next;
    }

    return p1;
  }
}
