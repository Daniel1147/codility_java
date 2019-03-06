package leetcode.all_paths_from_source_to_target;

import java.util.*;

class Solution {
  private List<List<Integer>> result;
  private int[][] graph;
  private int target;
  private int n;

  public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
    List<Integer> path;

    result = new ArrayList<List<Integer>> ();
    this.graph = graph;
    n = graph.length;
    target = n - 1;
    path = new ArrayList<Integer> ();
    path.add(0);
    helper(path, 0);

    return result;
  }

  public void helper(List<Integer> path, int current) {
    int next;
    List<Integer> newPath;
    if (current == target) {
      result.add(path);
    }

    for (int i = 0; i < graph[current].length; i++) {
      next = graph[current][i];
      newPath = new ArrayList<Integer> (path);
      newPath.add(next);
      helper(newPath, next);
    }

    return;
  }
}
