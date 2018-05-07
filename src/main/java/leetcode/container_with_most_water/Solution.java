package leetcode.container_with_most_water;

import java.util.*;

class Solution {
  public int maxArea(int[] height) {
    int N, indexLeft, indexRight, max, currentArea, currentHeight;

    max = 0;
    N = height.length;
    indexLeft = 0;
    indexRight = N - 1;

    while (indexLeft < indexRight) {
      currentArea = area(height, indexLeft, indexRight);

      if (max < currentArea)
        max = currentArea;

      if (height[indexLeft] < height[indexRight]) {
        currentHeight = height[indexLeft];
        indexLeft++;
        while(indexLeft < indexRight && currentHeight >= height[indexLeft]) {
          indexLeft++;
        }
      }
      else {
        currentHeight = height[indexRight];
        indexRight--;
        while(indexLeft < indexRight && currentHeight >= height[indexRight]) {
          indexRight--;
        }
      }
    }

    return max;
  }

  private int area(int[] height, int indexLeft, int indexRight) {
    return (indexRight - indexLeft) * Math.min(height[indexLeft], height[indexRight]);
  }
}
