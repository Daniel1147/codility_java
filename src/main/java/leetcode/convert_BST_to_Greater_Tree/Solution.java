package leetcode.convert_BST_to_Greater_Tree;

import leetcode.util.TreeNode;

class Solution {
  private int sum;

  public TreeNode convertBST(TreeNode root) {
    sum = 0;

    dfs(root);

    return root;
  }

  private void dfs(TreeNode n) {
    int v;

    if (n == null)
      return;

    dfs(n.right);
    v = n.val;
    n.val += sum;
    sum += v;
    dfs(n.left);
  }
}
