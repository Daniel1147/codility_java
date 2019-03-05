package leetcode.all_paths_from_source_to_target;

import java.util.*;

class Solution {
  public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
    List<List<Integer>> result = new LinkedList<List<Integer>>();
    Queue<LinkedList<Integer>> walkerQueue = new LinkedList<LinkedList<Integer>>();
    LinkedList<Integer> walker, newList;
    int position, target, nextNode;

    target = graph.length - 1;

    LinkedList<Integer> firstWalker = new LinkedList<Integer>();
    firstWalker.add(0);
    walkerQueue.add(firstWalker);

    while (!walkerQueue.isEmpty()) {
      walker = walkerQueue.poll();

      position = walker.getLast();
      for (int i = 0; i < graph[position].length; i++) {
        nextNode = graph[position][i];
        newList = new LinkedList<Integer> (walker);
        newList.add(nextNode);
        if (nextNode == target) {
          result.add(newList);
        } else {
          walkerQueue.add(newList);
        }
      }
    }

    return result;
  }
}
