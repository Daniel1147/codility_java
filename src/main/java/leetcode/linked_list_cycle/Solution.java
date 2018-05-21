package leetcode.linked_list_cycle;

import java.util.*;

class Solution {
  public boolean hasCycle(ListNode head) {
    ListNode slowNode, fastNode;

    if (head == null)
      return false;

    slowNode = head;
    fastNode = head;

    while(fastNode.next != null && fastNode.next.next != null) {
      fastNode = fastNode.next.next;
      slowNode = slowNode.next;

      if (fastNode == slowNode)
        return true;
    }

    return false;
  }
}
