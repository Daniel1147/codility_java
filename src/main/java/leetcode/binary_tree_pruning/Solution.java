package leetcode.binary_tree_pruning;

import java.util.*;
import leetcode.util.*;

class Solution {
  public TreeNode pruneTree(TreeNode root) {
    TreeNode l, r;
    if (root == null)
      return null;

    l = pruneTree(root.left);
    r = pruneTree(root.right);

    if (l == null)
      root.left = null;

    if (r == null)
      root.right = null;

    if (l != null || r != null || root.val != 0)
      return root;

    return null;
  }
}
