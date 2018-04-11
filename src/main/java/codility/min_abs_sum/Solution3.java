package codility.min_abs_sum;

import java.util.Arrays;

class Solution3 {
  public int solution(int[] A) {
    int N, sum, a, perfectGoal, max;
    int[] posA;
    int[] count;

    N = A.length;
    sum = 0;
    posA = new int[N];
    for (int i = 0; i < N; i++) {
      if (A[i] > 0) {
        a = A[i];
      } else {
        a = A[i] * -1;
      }

      sum += a;
      posA[i] = a;
    }

    perfectGoal = sum / 2;

    count = new int[perfectGoal + 1];
    count[0] = 1;

    for (int i = 0; i < N; i++) {
      a = posA[i];
      for (int j = 0; j <= perfectGoal; j++) {
        if (count[j] == 1 && j + a <= perfectGoal) {
          count[j + a] = 1;
        }
      }
    }

    for (max = perfectGoal; max >= 0; max--) {
      if (count[max] == 1) {
        break;
      }
    }

    return (sum - max) - max;
  }
}
