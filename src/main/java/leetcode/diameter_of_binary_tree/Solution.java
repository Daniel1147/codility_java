package leetcode.diameter_of_binary_tree;

import leetcode.util.TreeNode;

class Solution {
  private int max;

  public int diameterOfBinaryTree(TreeNode root) {
    max = 0;

    if (root == null)
      return 0;

    maxDownPath(root);

    return max;
  }

  private int maxDownPath(TreeNode n) {
    int l, r;

    if (n == null)
      return 0;

    l = maxDownPath(n.left);
    r = maxDownPath(n.right);

    if (max < l + r) {
      max = l + r;
    }

    return (l > r) ? l + 1 : r + 1;
  }
}
