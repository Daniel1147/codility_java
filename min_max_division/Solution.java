package codility.min_max_division;

import java.util.Arrays;

class Solution {
  public int solution(int K, int M, int[] A) {
    int max, min, tryNum;
    boolean passTry;

    max = ((A.length / K) + 1) * M;
    tryNum = max;

    while (tryNum >= 0) {
      passTry = available(tryNum, K, A);

      // System.out.printf("pass try of %d is %s\n", tryNum, passTry);
      //
      if (passTry) {
        tryNum--;

        continue;
      }

      return tryNum + 1;
    }

    // System.out.println("return max");

    return 0;
  }

  boolean available(int minMax, int K, int[] A) {
    int blockCount = 0;
    int usedBlock = 1;
    int i = 0;

    while (i < A.length) {
      if (usedBlock > K && A[i] > 0) {
        return false;
      }

      if (blockCount + A[i] > minMax) {
        // System.out.printf("current block %d end at %d with block count %d\n", usedBlock, i - 1, blockCount);

        blockCount = 0;
        usedBlock++;

        continue;
      }

      blockCount += A[i];
      i++;
    }

    return true;
  }
}
