package codility.max_nonoverlapping_segments;

import java.util.Arrays;

class Solution {
  public int solution(int[] A, int[] B) {
    int N = A.length;
    int counter;
    int left;

    if (N == 0) {
      return 0;
    }

    // init
    counter = 1;
    left = B[0];
    for (int i = 1; i < N; i++) {
      if (A[i] > left) {
        left = B[i];
        counter++;
      }
    }

    return counter;
  }
}
