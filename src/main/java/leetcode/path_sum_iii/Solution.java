package leetcode.path_sum_iii;

import leetcode.util.TreeNode;
import java.util.Stack;

class Solution {
  int sum;
  Stack<Integer> s;

  public int pathSum(TreeNode root, int sum) {
    this.sum = sum;
    s = new Stack<Integer>();

    if (root == null)
      return 0;

    return helper(root);
  }

  private int helper(TreeNode node) {
    int result, currentSum, parentSum;

    if (s.empty())
      parentSum = 0;
    else
      parentSum = s.peek();

    currentSum = node.val + parentSum;

    if (node.val == sum)
      result = 1;
    else
      result = 0;

    for (Integer ancestorSum : s) {
      if (currentSum - ancestorSum == sum)
        result++;
    }

    s.push(currentSum);

    if (node.left != null)
      result += helper(node.left);

    if (node.right != null)
      result += helper(node.right);

    s.pop();

    return result;
  }
}
