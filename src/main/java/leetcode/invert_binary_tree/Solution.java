package leetcode.invert_binary_tree;

import java.util.*;
import leetcode.util.TreeNode;

class Solution {
  public TreeNode invertTree(TreeNode root) {
    TreeNode l, r;

    if (root == null) {
      return null;
    }

    l = invertTree(root.right);
    r = invertTree(root.left);

    root.right = r;
    root.left = l;

    return root;
  }
}
