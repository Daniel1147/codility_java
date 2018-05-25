package leetcode.util;

import daniel1147.util.IListNode;

public class ListNode implements IListNode {
  public static class Factory {
    public ListNode fromNumArray(int[] nums) {
      ListNode head, current;

      if (nums.length == 0)
        return null;

      head = new ListNode(nums[0]);
      current = head;

      for (int i = 1; i < nums.length; i++) {
        current.next = new ListNode(nums[i]);
        current = current.next;
      }

      return head;
    }
  }

  public int val;
  public ListNode next;
  public ListNode(int x) {
    val = x;
    next = null;
  }

  @Override
  public String toString() {
    ListNode nextNode;
    String result;

    result = Integer.toString(val);
    nextNode = next;
    while(nextNode != null) {
      result = result.concat(" ".concat(Integer.toString(nextNode.val)));
      nextNode = nextNode.next;
    }

    return result;
  }

  @Override
  public int value() {
    return val;
  }

  @Override
  public void setValue(int value) {
    val = value;
  }

  @Override
  public void appendNull() {
    next = null;
  }

  @Override
  public IListNode next() {
    return next;
  }

  @Override
  public IListNode append(int value) {
    next = new ListNode(value);

    return next;
  }
}
