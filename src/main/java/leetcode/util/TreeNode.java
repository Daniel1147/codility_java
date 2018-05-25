package leetcode.util;

import daniel1147.util.ITree;

public class TreeNode implements ITree {
  public int val;
  public TreeNode left;
  public TreeNode right;

  public TreeNode(int x) {
    val = x;
  }

  public ITree left() {
    return left;
  }
  public ITree right() {
    return right;
  }

  public int value() {
    return val;
  }

  public ITree lAppend(int value) {
    left = create(value);

    return left;
  }

  public ITree rAppend(int value) {
    right = create(value);

    return right;
  }

  public void lAppendNull() {
    left = null;
  }

  public void rAppendNull() {
    right = null;
  }

  private TreeNode create(int value) {
    return new TreeNode(value);
  }
}
