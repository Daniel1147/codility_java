package leetcode.remove_nth_node_from_end_of_list;

import java.util.*;
import leetcode.util.*;

class Solution {
  public ListNode removeNthFromEnd(ListNode head, int n) {
    ListNode toHead, toSlow, fast;

    toHead = new ListNode(0);
    toHead.next = head;

    toSlow = toHead;

    fast = head;
    while (n > 0) {
      n--;
      fast = fast.next;
    }

    while (fast != null) {
      fast = fast.next;
      toSlow = toSlow.next;
    }

    toSlow.next = toSlow.next.next;

    return toHead.next;
  }
}
