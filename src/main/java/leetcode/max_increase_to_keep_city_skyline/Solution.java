package leetcode.max_increase_to_keep_city_skyline;

import java.util.Arrays;

class Solution {
  public int maxIncreaseKeepingSkyline(int[][] grid) {
    int l, w, h, result, max;
    int[] lView, wView;

    l = grid.length;

    if (l == 0)
      return 0;

    w = grid[0].length;

    if (w == 0)
      return 0;

    lView = new int[l];
    wView = new int[w];

    for (int i = 0; i < l; i++) {
      for (int j = 0; j < w; j++) {
        h = grid[i][j];

        if (lView[i] < h)
          lView[i] = h;

        if (wView[j] < h)
          wView[j] = h;
      }
    }

    // System.out.println(Arrays.toString(lView));
    // System.out.println(Arrays.toString(wView));

    result = 0;
    for (int i = 0; i < l; i++) {
      for (int j = 0; j < w; j++) {
        h = grid[i][j];

        max = Math.min(lView[i], wView[j]);

        // System.out.printf("h => %d, max => %d, lview => %d, wview => %d\n", h, max, lView[i], wView[j]);

        result += max - h;
      }
    }

    return result;
  }
}
