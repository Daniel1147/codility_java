package leetcode.linked_list_cycle;

import java.util.*;

class Solution {
  public boolean hasCycle(ListNode head) {
    ListNode falseNode, currentNode, nextNode;

    falseNode = new ListNode(0);
    currentNode = head;
    while(currentNode != null) {
      if (currentNode.next == falseNode)
        return true;

      nextNode = currentNode.next;
      currentNode.next = falseNode;
      currentNode = nextNode;
    }

    return false;
  }
}
