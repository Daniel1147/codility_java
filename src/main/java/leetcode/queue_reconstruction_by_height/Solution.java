package leetcode.queue_reconstruction_by_height;

import java.util.*;

class Solution {
  public int[][] reconstructQueue(int[][] people) {
    int n = people.length;
    List<int[]> resultList = new ArrayList<int[]>();

    Arrays.sort(people, new Comparator<int[]>() {
      @Override
      public int compare(int[] a, int[] b) {
        if (a[0] == b[0]) {
          return a[1] - b[1];
        }

        return b[0] - a[0];
      }
    });

    for (int i = 0; i < people.length; i++) {
      resultList.add(people[i][1], people[i]);
    }

    for (int i = 0; i < people.length; i++) {
      people[i] = resultList.get(i);
    }

    return people;
  }
}
