package leetcode.rotate_list;

import java.util.*;
import leetcode.util.*;

class Solution {
  public ListNode rotateRight(ListNode head, int k) {
    ListNode tail, newHead, newTail;
    int cnt;

    if (head == null)
      return null;

    tail = head;
    cnt = 1;
    while (tail.next != null) {
      cnt++;
      tail = tail.next;
    }

    tail.next = head;
    newHead = head;
    newTail = tail;
    k = ((k * -1) % cnt) + cnt;
    while (k > 0) {
      newTail = newHead;
      newHead = newHead.next;
      k--;
    }
    newTail.next = null;

    return newHead;
  }
}
