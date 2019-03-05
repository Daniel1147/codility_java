package leetcode.all_paths_from_source_to_target;

import java.util.*;

class Solution {
  private int target;
  private int[][] graph;
  private List<Integer> path;

  public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
    List<List<Integer>> result = new LinkedList<List<Integer>>();

    target = graph.length - 1;
    this.graph = graph;

    return helper(0);
  }

  private List<List<Integer>> helper(int start) {
    List<List<Integer>> result, subResult;
    int next, subPathNum;

    result = new LinkedList<List<Integer>>();

    if (start == target) {
      path = new LinkedList<Integer> ();
      path.add(target);
      result.add(path);

      return result;
    }

    for (int i = 0; i < graph[start].length; i++) {
      next = graph[start][i];
      subResult = helper(next);
      subPathNum = subResult.size();
      for (int j = 0; j < subPathNum; j++) {
        path = subResult.get(j);
        path.add(0, start);
        result.add(path);
      }
    }

    return result;
  }
}
