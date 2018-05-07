package codility.recovery_binary_search_tree;

import java.util.*;

class Solution {
  class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
      val = x;
    }
  }

  boolean firstNode;
  TreeNode error1, error2, lastNode;
  int errorCount, tmp;

  public void recoverTree(TreeNode root) {
    errorCount = 0;

    // search
    lastNode = new TreeNode(Integer.MIN_VALUE);
    inorderTraverse(root);

    // fix
    tmp = error1.val;
    error1.val = error2.val;
    error2.val = tmp;
  }

  private void inorderTraverse(TreeNode node) {
    if (node == null)
      return;

    inorderTraverse(node.left);
    if (errorCount >= 2) return;

    if (lastNode.val > node.val) {
      // System.out.printf("node1 => %d, node2 => %d\n", lastNode.val, node.val);
      errorCount++;
      if (error1 == null) error1 = lastNode;
      error2 = node;
    }

    lastNode = node;

    if (errorCount >= 2) return;

    inorderTraverse(node.right);
  }
}
