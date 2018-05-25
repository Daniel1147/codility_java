package leetcode.path_sum_iii;

import leetcode.util.TreeNode;
import java.util.HashMap;

class Solution {
  int sum;
  HashMap<Integer, Integer> m;

  public int pathSum(TreeNode root, int sum) {
    this.sum = sum;
    m = new HashMap<Integer, Integer>();

    if (root == null)
      return 0;

    return helper(root, 0);
  }

  private int helper(TreeNode node, int parentSum) {
    int result, currentSum;

    currentSum = node.val + parentSum;

    if (currentSum == sum)
      result = 1;
    else
      result = 0;

    if (m.containsKey(currentSum - sum)) {
      result += m.get(currentSum - sum);
    }

    m.merge(currentSum, 1, Integer::sum);

    if (node.left != null)
      result += helper(node.left, currentSum);

    if (node.right != null)
      result += helper(node.right, currentSum);

    m.merge(currentSum, -1, Integer::sum);

    return result;
  }
}
