package leetcode.palindrome_linked_list;

import leetcode.util.ListNode;

class Solution {
  public boolean isPalindrome(ListNode head) {
    int len, toNull, startRevert;
    boolean skipMiddle;
    ListNode leftHead, rightHead;

    len = len(head);

    if (len <= 1) {
      return true;
    }

    toNull = len / 2;

    if (len % 2 == 0)
      skipMiddle = false;
    else
      skipMiddle = true;

    leftHead = head;
    rightHead = revert(head, toNull, skipMiddle);

    // System.out.println("left head => " + leftHead);
    // System.out.println("right head => " + rightHead);

    while(leftHead != null && rightHead != null) {
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

  private ListNode revert(ListNode head, int toNull, boolean skipMiddle) {
    int counter;
    ListNode next, last, current;

    for (int i = 0; i < toNull - 1; i++) {
      head = head.next;
    }

    next = head.next;
    head.next = null;

    if (skipMiddle)
      next = next.next;

    last = null;
    current = next;
    while (current.next != null) {
      next = current.next;
      current.next = last;
      last = current;
      current = next;
    }

    current.next = last;

    return current;
  }
}
