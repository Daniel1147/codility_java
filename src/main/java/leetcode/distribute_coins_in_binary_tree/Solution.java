package leetcode.distribute_coins_in_binary_tree;

import java.util.*;
import leetcode.util.TreeNode;

class Solution {
  int ans;
  public int distributeCoins(TreeNode root) {
    ans = 0;
    dfsDistribute(root);
    return ans;
  }

  private int dfsDistribute(TreeNode root) {
    int leftDistribute, rightDistribute;

    if (root == null)
      return 0;

    leftDistribute = dfsDistribute(root.left);
    rightDistribute = dfsDistribute(root.right);

    ans += Math.abs(leftDistribute);
    ans += Math.abs(rightDistribute);

    return leftDistribute + rightDistribute + root.val - 1;
  }
}
