package leetcode.palindrome_linked_list;

import leetcode.util.ListNode;

class Solution {
  public boolean isPalindrome(ListNode head) {
    int len, leftHalfLen;
    ListNode last, current, next, leftHead, rightHead;

    // System.out.println("head => " + head);

    len = len(head);

    if (len <= 1) {
      return true;
    }

    leftHalfLen = len / 2;

    last = null;
    current = head;
    next = head.next;

    for (int i = 0; i < leftHalfLen; i++) {
      current.next = last;
      last = current;
      current = next;
      next = next.next;
    }

    leftHead = last;

    if (len % 2 == 0)
      rightHead = current;
    else
      rightHead = next;

    // System.out.println("leftHead => " + leftHead);
    // System.out.println("rightHead => " + rightHead);

    while(leftHead != null) {
      if (leftHead.val != rightHead.val)
        return false;

      leftHead = leftHead.next;
      rightHead = rightHead.next;
    }

    return true;
  }

  private int len(ListNode head) {
    int counter;

    counter = 0;

    while(head != null) {
      head = head.next;
      counter++;
    }

    return counter;
  }
}
