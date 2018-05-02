package codility.slalom_skiing;

import java.util.Arrays;

class Solution {
  int N;
  int copyWorldN, copyWorldLis;
  long[] copyWorld, dp;
  long AMax;

  public int solution(int[] A) {
    N = A.length;
    copyWorldN = N * 3;

    calculateAMax(A);
    buildCopyWorld(A);
    lis();

    return copyWorldLis;
  }

  private void calculateAMax(int[] A) {
    AMax = A[0];
    for (int i = 1; i < N; i++) {
      if (AMax < A[i]) {
        AMax = A[i];
      }
    }
    AMax += 1;
  }

  private void buildCopyWorld(int[] A) {
    copyWorld = new long[copyWorldN];

    long flag;
    for (int i = 0; i < N; i++) {
      flag = (long)A[i];

      // world 3
      copyWorld[i * 3] = flag + 2 * AMax;

      // world 2
      copyWorld[i * 3 + 1] = 2 * AMax - flag;

      // world 1
      copyWorld[i * 3 + 2] = flag;
    }
  }

  private void lis() {
    long flag;
    int insertIndex;

    dp = new long[copyWorldN + 1];
    copyWorldLis = 0;

    for (int i = 0; i < copyWorldN; i++) {
      flag = copyWorld[i];
      insertIndex = getInsertIndex(flag);
      if (copyWorldLis == insertIndex) {
        copyWorldLis++;
      }

      dp[insertIndex] = flag;
    }
  }

  private int getInsertIndex(long flag) {
    int start, end, examIndex;
    long exam;

    dp[copyWorldLis] = flag + 1;

    start = 0;
    end = copyWorldLis;
    while (start < end) {
      examIndex = (start + end) / 2;
      exam = dp[examIndex];

      if (exam < flag) {
        start = examIndex + 1;
      } else {
        end = examIndex;
      }
    }

    return start;
  }
}
