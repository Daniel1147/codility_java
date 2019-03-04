package leetcode.insert_into_a_binary_search_tree;

import java.util.*;
import leetcode.util.TreeNode;

class Solution {
  public TreeNode insertIntoBST(TreeNode root, int val) {
    if (root == null)
      return new TreeNode(val);

    if (root.val < val) {
      root.right = insertIntoBST(root.right, val);
      return root;
    }

    root.left = insertIntoBST(root.left, val);
    return root;
  }
}
