package leetcode.maximum_binary_tree;

import java.util.*;
import leetcode.util.TreeNode;

class Solution {
  public TreeNode constructMaximumBinaryTree(int[] nums) {
    TreeNode result = helper(nums, 0, nums.length);

    return result;
  }

  private TreeNode helper(int[] nums, int start, int end) {
    TreeNode root;
    int iMaximum;

    if (start >= end)
      return null;

    iMaximum = -1;
    for (int i = start; i < end; i++) {
      if (iMaximum == -1)
        iMaximum = i;
      else if (nums[iMaximum] < nums[i])
        iMaximum = i;
    }

    root = new TreeNode(nums[iMaximum]);
    root.left = helper(nums, start, iMaximum);
    root.right = helper(nums, iMaximum + 1, end);

    return root;
  }
}
