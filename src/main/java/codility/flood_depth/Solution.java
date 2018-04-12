package codility.flood_depth;

import java.util.Arrays;

class Solution {
  private int N;
  private int[] leftMax, rightMax;

  public int solution(int[] A) {
    int ans = 0;
    int h;
    N = A.length;

    buildSideMax(A);

    for (int i = 0; i < N; i++) {
      if (leftMax[i] > rightMax[i]) {
        h = rightMax[i];
      } else {
        h = leftMax[i];
      }

      if (h - A[i] > ans) {
        ans = h - A[i];
      }
    }

    return ans;
  }

  private void buildSideMax(int[] A) {
    int currentMax = 0;

    leftMax = new int[N];
    rightMax = new int[N];

    for (int i = 0; i < N; i++) {
      leftMax[i] = currentMax;
      if (currentMax < A[i])
        currentMax = A[i];
    }

    currentMax = 0;
    for (int i = N - 1; i >= 0; i--) {
      rightMax[i] = currentMax;
      if (currentMax < A[i])
        currentMax = A[i];
    }
  }
}
