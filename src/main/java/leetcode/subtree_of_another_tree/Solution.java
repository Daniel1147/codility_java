package leetcode.sutree_of_another_tree;

import leetcode.util.TreeNode;

class Solution {
  public boolean isSubtree(TreeNode s, TreeNode t) {

    return dfsCheck(s, t);
  }

  private boolean dfsCheck(TreeNode big, TreeNode small) {
    if (big == null)
      return false;

    if (big.val == small.val) {
      if (check(big, small))
        return true;
    }

    if (dfsCheck(big.left, small))
      return true;

    if (dfsCheck(big.right, small))
      return true;

    return false;
  }

  private boolean check(TreeNode a, TreeNode b) {
    if (a == null && b == null)
      return true;

    if (a == null || b == null)
      return false;

    if (a.val != b.val)
      return false;

    if (!check(a.left, b.left))
      return false;

    if (!check(a.right, b.right))
      return false;

    return true;
  }
}
