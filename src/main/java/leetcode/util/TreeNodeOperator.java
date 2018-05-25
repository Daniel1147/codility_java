package leetcode.util;

import daniel1147.util.ITree;
import daniel1147.util.ITreeOperator;

public class TreeNodeOperator implements ITreeOperator {
  private TreeNode root;

  public TreeNodeOperator() {
    root = null;
  }

  public ITree getITree() {
    return root;
  }

  public TreeNode getTreeNode() {
    return root;
  }

  public ITree initRoot(int value) {
    root = new TreeNode(value);

    return root;
  }

  public void setRootNull() {
    root = null;
  }
}
