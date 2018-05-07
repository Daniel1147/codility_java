package codility.binary_tree_postorder_traversal;

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

  public List<Integer> postorderTraversal(TreeNode root) {
    if (root == null)
      return new LinkedList<Integer>();

    List<Integer> left, right, result;

    left = postorderTraversal(root.left);
    right = postorderTraversal(root.right);
    result = left;
    result.addAll(right);

    result.add(root.val);

    return result;
  }
}
