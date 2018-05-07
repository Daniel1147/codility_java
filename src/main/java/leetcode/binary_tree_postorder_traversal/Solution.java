package codility.binary_tree_postorder_traversal;

import java.util.*;

class Solution {

  List<Integer> result;

  class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
      val = x;
    }
  }

  public List<Integer> postorderTraversal(TreeNode root) {
    List<Integer> left, right;

    result = new LinkedList<Integer>();

    if (root == null) return result;

    postorder(root.left);
    postorder(root.right);
    result.add(root.val);

    return result;
  }

  private void postorder(TreeNode node) {
    if (node == null) return;

    postorder(node.left);
    postorder(node.right);
    result.add(node.val);

    return;
  }
}
