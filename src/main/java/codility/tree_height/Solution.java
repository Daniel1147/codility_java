package codility.tree_height;

import java.util.*;
import codility.util.Tree;

class Solution {
  public int solution(Tree t) {
    Queue<Tree> q;
    int levelCount, levelNodeCount, nextLevelCount;
    Tree node;

    if (t == null)
      return -1;

    q = new ArrayDeque<Tree>();
    q.add(t);
    levelNodeCount = 1;
    nextLevelCount = 0;
    levelCount = 0;

    while(!q.isEmpty()) {
      if (levelNodeCount == 0) {
        levelCount++;
        levelNodeCount = nextLevelCount;
        nextLevelCount = 0;
      }

      levelNodeCount--;
      node = q.poll();
      if (node.l != null) {
        q.add(node.l);
        nextLevelCount++;
      }

      if (node.r != null) {
        q.add(node.r);
        nextLevelCount++;
      }
    }

    return levelCount;
  }
}
