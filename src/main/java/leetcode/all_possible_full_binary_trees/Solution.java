package leetcode.all_possible_full_binary_trees;

import java.util.*;
import leetcode.util.TreeNode;

class Solution {
  private List<List<TreeNode>> cache;
  private int MAX_N = 20;

  public List<TreeNode> allPossibleFBT(int N) {
    List<TreeNode> listZero, leftPFBT, rightPFBT, l;
    TreeNode newRoot;

    cache = new ArrayList<List<TreeNode>> ();

    listZero = new ArrayList<TreeNode> ();
    listZero.add(null);
    cache.add(listZero);

    for (int i = 1; i <= N; i++) {
      l = new ArrayList<TreeNode> ();
      cache.add(l);
      for (int j = 0; j < i; j++) {
        leftPFBT = cache.get(j);
        rightPFBT = cache.get(i - 1 - j);

        for (TreeNode leftTree : leftPFBT) {
          for (TreeNode rightTree : rightPFBT) {
            if (leftTree == null && rightTree != null)
              continue;

            if (leftTree != null && rightTree == null)
              continue;

            newRoot = new TreeNode(0);
            newRoot.left = treeCopy(leftTree);
            newRoot.right = treeCopy(rightTree);

            l.add(newRoot);
          }
        }
      }
    }

    return cache.get(N);
  }

  public TreeNode treeCopy(TreeNode root) {
    TreeNode newRoot;

    if (root == null)
      return null;

    newRoot = new TreeNode(root.val);
    newRoot.left = treeCopy(root.left);
    newRoot.right = treeCopy(root.right);

    return newRoot;
  }
}
