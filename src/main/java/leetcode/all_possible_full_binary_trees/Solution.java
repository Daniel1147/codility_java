package leetcode.all_possible_full_binary_trees;

import java.util.*;
import leetcode.util.TreeNode;

class Solution {
  private List<List<TreeNode>> cache;
  private int MAX_N = 20;

  public List<TreeNode> allPossibleFBT(int N) {
    List<TreeNode> listZero, listOne, leftPFBT, rightPFBT, l;
    TreeNode newRoot;

    cache = new ArrayList<List<TreeNode>> ();

    listZero = new ArrayList<TreeNode> ();
    cache.add(listZero);

    if (N % 2 == 0)
      return listZero;

    listOne = new ArrayList<TreeNode> ();
    newRoot = new TreeNode(0);
    listOne.add(newRoot);
    cache.add(listOne);

    for (int i = 2; i <= N; i++) {
      l = new ArrayList<TreeNode> ();
      cache.add(l);
      for (int j = 1; j <= i - 2; j+= 2) {
        leftPFBT = cache.get(j);
        rightPFBT = cache.get(i - 1 - j);

        for (TreeNode leftTree : leftPFBT) {
          for (TreeNode rightTree : rightPFBT) {
            newRoot = new TreeNode(0);
            newRoot.left = leftTree;
            newRoot.right = rightTree;

            l.add(newRoot);
          }
        }
      }
    }

    return cache.get(N);
  }
}
