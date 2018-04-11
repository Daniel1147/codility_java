package codility.min_abs_sum;

import java.util.Arrays;

class Solution4 {
  public int solution(int[] A) {
    int N = A.length;
    int sum, max, range, move, target;
    int[] count, dp;

    max = 0;
    sum = 0;
    for (int i = 0; i < N; i++) {
      if (A[i] > 0) {
        sum += A[i];

        if (max < A[i]) {
          max = A[i];
        }
      } else {
        sum -= A[i];

        if (max < A[i] * -1) {
          max = A[i] * -1;
        }
      }
    }

    count = new int[max + 1];
    fillCount(count, A);

    dp = new int[sum / 2 + 1];
    for (int i = 0; i <= sum / 2; i++) {
      dp[i] = -1;
    }

    dp[0] = 0;
    for (range = 1; range <= max; range++) {
      for (int i = sum / 2; i >= 0; i--) {
        if (dp[i] >= 0) {
          dp[i] = count[range];
          move = 0;

          while (dp[i + move] > 0 && i + move + range <= sum / 2) {
            dp[i + move + range] = dp[i + move] - 1;
            move += range;
          }
        }
      }
    }

    target = sum;
    for (int i = sum / 2; i >= 0; i--) {
      if (dp[i] >= 0) {
        target = i;
        break;
      }
    }

    return sum - target - target;
  }

  private void fillCount(int[] count, int[] A) {
    for (int i = 0; i < A.length; i++) {
      if (A[i] > 0) {
        count[A[i]]++;
      } else {
        count[A[i] * -1]++;
      }
    }
  }
}
