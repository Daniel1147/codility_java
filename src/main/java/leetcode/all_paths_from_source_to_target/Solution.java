package leetcode.all_paths_from_source_to_target;

import java.util.*;

class Solution {
  public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
    List<List<Integer>> result = new ArrayList<List<Integer>>();
    Queue<ArrayList<Integer>> walkerQueue = new LinkedList<ArrayList<Integer>>();
    ArrayList<Integer> walker, newList;
    int position, target, nextNode;

    target = graph.length - 1;

    ArrayList<Integer> firstWalker = new ArrayList<Integer>();
    firstWalker.add(0);
    walkerQueue.add(firstWalker);

    while (!walkerQueue.isEmpty()) {
      walker = walkerQueue.poll();

      position = walker.get(walker.size() - 1);
      for (int i = 0; i < graph[position].length; i++) {
        nextNode = graph[position][i];
        newList = new ArrayList<Integer> (walker);
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
