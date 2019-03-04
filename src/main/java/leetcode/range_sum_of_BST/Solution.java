package leetcode.range_sum_of_BST;

import java.util.*;
import leetcode.util.TreeNode;

class Solution {
  public int rangeSumBST(TreeNode root, int L, int R) {
    int currentVal;

    if (root == null)
      return 0;

    if (root.val >= L && root.val <= R)
      currentVal = root.val;
    else
      currentVal = 0;

    return currentVal + rangeSumBST(root.left, L, R) + rangeSumBST(root.right, L, R);
  }
}
