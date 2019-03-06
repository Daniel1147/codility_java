package leetcode.all_paths_from_source_to_target;

import java.util.*;

class Solution {
  int[] path;
  int[][] graph;
  int target;
  private List<List<Integer>> result;

  public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
    this.graph = graph;
    path = new int[graph.length];
    target = graph.length - 1;
    result = new ArrayList<List<Integer>> ();

    path[0] = 0;
    dfs(path, 1, 0);

    return result;
  }

  private void dfs (int[] path, int len, int current) {
    int next;
    List<Integer> fullPath;

    if (current == target) {
      fullPath = new ArrayList<Integer> ();
      for (int i = 0; i < len; i++)
        fullPath.add(path[i]);
      result.add(fullPath);
      return;
    }

    for (int i = 0; i < graph[current].length; i++) {
      next = graph[current][i];
      path[len] = next;

      dfs(path, len + 1, next);
    }

    return;
  }
}
