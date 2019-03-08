package leetcode.distribute_coins_in_binary_tree;

import java.util.*;
import leetcode.util.TreeNode;

class Solution {
  private int[] nodeNum;
  private int MAX_NODE = 100;
  private int[] treeNodeNum, treeCoinSum;
  private int dfsCnt;

  public int distributeCoins(TreeNode root) {
    treeNodeNum = new int[MAX_NODE];
    treeCoinSum = new int[MAX_NODE];

    dfsCnt = 0;
    dfsCountNode(root);

    dfsCnt = 0;
    dfsCountCoin(root);

    dfsCnt = 0;
    return dfsCountMove(root);
  }

  private int dfsCountNode(TreeNode root) {
    int iNode, leftNodeNum, rightNodeNum;
    if (root == null)
      return 0;

    iNode = dfsCnt;
    dfsCnt++;

    leftNodeNum = dfsCountNode(root.left);
    rightNodeNum = dfsCountNode(root.right);
    treeNodeNum[iNode] = leftNodeNum + rightNodeNum + 1;
    return treeNodeNum[iNode];
  }

  private int dfsCountCoin(TreeNode root) {
    int iNode, leftCoinSum, rightCoinSum;
    if (root == null)
      return 0;

    iNode = dfsCnt;
    dfsCnt++;

    leftCoinSum = dfsCountCoin(root.left);
    rightCoinSum = dfsCountCoin(root.right);
    treeCoinSum[iNode] = leftCoinSum + rightCoinSum + root.val;
    return treeCoinSum[iNode];
  }

  private int dfsCountMove(TreeNode root) {
    int ans, leftCountMove, rightCountMove, leftChildMove, rightChildMove, nodeNum, coinSum;
    int iNode, iLeftNode, iRightNode;

    if (root == null)
      return 0;

    iNode = dfsCnt;
    dfsCnt++;

    iLeftNode = dfsCnt;
    leftCountMove = dfsCountMove(root.left);
    iRightNode = dfsCnt;
    rightCountMove = dfsCountMove(root.right);
    if (root.left == null)
      leftChildMove = 0;
    else {
      leftChildMove = Math.abs(treeNodeNum[iLeftNode] - treeCoinSum[iLeftNode]);
    }

    if (root.right == null)
      rightChildMove = 0;
    else {
      rightChildMove = Math.abs(treeNodeNum[iRightNode] - treeCoinSum[iRightNode]);
    }

    ans = leftCountMove + rightCountMove + leftChildMove + rightChildMove;
    return ans;
  }
}
