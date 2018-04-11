package codility.min_abs_sum;

import java.util.Arrays;

class Solution2 {
  public int solution(int[] A) {
    int N = A.length;
    int[] posA = Arrays.copyOf(A, N);
    int diff;

    for (int i = 0; i < N; i++) {
      if (posA[i] < 0) {
        posA[i] *= -1;
      }
    }

    Arrays.sort(posA);

    diff = 0;
    for (int i = N - 1; i >= 0; i--) {
      diff = abs(diff - posA[i]);
    }

    return diff;
  }

  private int abs(int a) {
    if (a < 0)
      return a * -1;

    return a;
  }
}
