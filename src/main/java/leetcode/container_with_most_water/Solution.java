package leetcode.container_with_most_water;

import java.util.*;

class Solution {
  public int maxArea(int[] height) {
    int N, indexLeft, indexRight, maxLeft, maxRight, max, currentArea;

    max = 0;
    N = height.length;
    indexLeft = 0;
    indexRight = N - 1;
    maxLeft = height[indexLeft] - 1;
    maxRight = height[indexRight] - 1;

    while (indexLeft < indexRight) {
      if (height[indexLeft] > maxLeft || height[indexRight] > maxRight) {
        currentArea = area(height, indexLeft, indexRight);

        if (height[indexLeft] > maxLeft)
          maxLeft = height[indexLeft];

        if (height[indexRight] > maxRight)
          maxLeft = height[indexRight];

        if (max < currentArea)
          max = currentArea;
      }
      if (height[indexLeft] < height[indexRight])
        indexLeft++;
      else
        indexRight--;
    }

    return max;
  }

  private int area(int[] height, int indexLeft, int indexRight) {
    return (indexRight - indexLeft) * Math.min(height[indexLeft], height[indexRight]);
  }
}
