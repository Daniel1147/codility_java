package codility.min_abs_sum;

import java.util.Arrays;

class Solution4 {
  private int sum, max;
  private int[] dp, count;
  public int solution(int[] A) {
    int target;
    int[] count;

    getSumAndMax(A);

    fillCount(A);

    initDp();

    runDp();

    target = getTarget();

    return sum - target - target;
  }

  private void fillCount(int[] A) {
    count = new int[max + 1];

    for (int i = 0; i < A.length; i++) {
      if (A[i] > 0) {
        count[A[i]]++;
      } else {
        count[A[i] * -1]++;
      }
    }
  }

  private void getSumAndMax(int[] A) {
    max = 0;
    sum = 0;
    for (int i = 0; i < A.length; i++) {
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
  }

  private void initDp() {
    dp = new int[sum / 2 + 1];
    for (int i = 0; i <= sum / 2; i++) {
      dp[i] = -1;
    }

    dp[0] = 0;
  }

  private void runDp() {
    int range, move;
    for (range = 1; range <= max; range++) {
      if (count[range] == 0)
        continue;

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
  }

  private int getTarget() {
    int target = sum;
    for (int i = sum / 2; i >= 0; i--) {
      if (dp[i] >= 0) {
        target = i;
        break;
      }
    }

    return target;
  }
}
