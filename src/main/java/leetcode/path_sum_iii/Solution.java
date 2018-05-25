package leetcode.path_sum_iii;

import leetcode.util.TreeNode;

class Solution {
  private final int MAX_NODE = 1000;

  int sum, ancestorNum;
  int[] ancestorSum;

  public int pathSum(TreeNode root, int sum) {
    this.sum = sum;
    ancestorSum = new int[MAX_NODE];
    ancestorNum = 0;

    if (root == null)
      return 0;

    return helper(root);
  }

  private int helper(TreeNode node) {
    int result, currentSum, parentSum;

    if (ancestorNum == 0)
      parentSum = 0;
    else
      parentSum = ancestorSum[ancestorNum - 1];

    currentSum = node.val + parentSum;

    if (currentSum == sum)
      result = 1;
    else
      result = 0;

    for (int i = 0; i < ancestorNum; i++) {
      if (currentSum - ancestorSum[i] == sum) {
        // System.out.println("node.val => " + node.val);
        // System.out.println("currentSum => " + currentSum);
        // System.out.println("ancestorSum => " + ancestorSum);
        result++;
      }
    }

    ancestorSum[ancestorNum] = currentSum;
    ancestorNum++;

    if (node.left != null)
      result += helper(node.left);

    if (node.right != null)
      result += helper(node.right);

    ancestorNum--;

    return result;
  }
}
