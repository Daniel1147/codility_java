package codility.tree_height;

import java.util.*;
import daniel1147.util.IntTree;

class Solution {
  public int solution(IntTree t) {
    Queue<IntTree> q;
    int levelCount, levelNodeCount, nextLevelCount;
    IntTree node;

    if (t == null)
      return -1;

    q = new ArrayDeque<IntTree>();
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
