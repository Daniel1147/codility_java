package leetcode.all_possible_full_binary_trees;

import java.util.*;
import leetcode.util.TreeNode;

class Solution {
  private List<List<TreeNode>> buildCache;
  private Map<Integer, List<TreeNode>> cache = new HashMap<Integer, List<TreeNode>> ();
  private int MAX_N = 20;

  public List<TreeNode> allPossibleFBT(int N) {
    List<TreeNode> listZero, listOne, leftPFBT, rightPFBT, l;
    TreeNode newRoot;

    if (cache.containsKey(N))
      return cache.get(N);

    buildCache = new ArrayList<List<TreeNode>> ();
    listZero = new ArrayList<TreeNode> ();
    buildCache.add(listZero);

    if (N % 2 == 0)
      return listZero;

    if (N == 1) {
      listOne = new ArrayList<TreeNode> ();
      newRoot = new TreeNode(0);
      listOne.add(newRoot);
      cache.put(1, listOne);
      return listOne;
    }

    l = new ArrayList<TreeNode> ();
    for (int j = 1; j <= N - 2; j += 2) {
      leftPFBT = allPossibleFBT(j);
      rightPFBT = allPossibleFBT(N - 1 - j);

      for (TreeNode leftTree : leftPFBT) {
        for (TreeNode rightTree : rightPFBT) {
          newRoot = new TreeNode(0);
          newRoot.left = leftTree;
          newRoot.right = rightTree;

          l.add(newRoot);
        }
      }
    }

    cache.put(N, l);

    return l;
  }
}
