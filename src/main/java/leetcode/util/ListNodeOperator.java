package leetcode.util;

import daniel1147.util.IListNodeOperator;
import daniel1147.util.IListNode;

public class ListNodeOperator implements IListNodeOperator {
  ListNode root, tail;

  public ListNodeOperator() {
    root = null;
    tail = null;
  }

  @Override
  public IListNode getListNodeRoot() {
    return root;
  }

  public ListNode getConcreteRoot() {
    return root;
  }

  @Override
  public void add(int value) {
    if (root == null) {
      root = create(value);
      tail = root;

      return;
    }

    ListNode newNode;

    newNode = create(value);
    tail.next = newNode;
    tail = newNode;
  }

  private ListNode create(int value) {
    return new ListNode(value);
  }
}
