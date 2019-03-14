package leetcode.kth_smallest_element_in_a_bst;

import java.util.*;
import leetcode.util.TreeNode;

class Solution {
  private int counter;
  private int k;

  public int kthSmallest(TreeNode root, int k) {
    counter = 1;
    this.k = k;

    return inOrder(root);
  }

  public int inOrder(TreeNode root) {
    int result;

    if (root == null) return -1;

    result = inOrder(root.left);
    if (result != -1)
      return result;

    if (counter == k)
      return root.val;

    counter++;

    return inOrder(root.right);
  }
}
