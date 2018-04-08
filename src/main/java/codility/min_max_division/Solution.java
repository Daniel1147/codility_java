package codility.min_max_division;

import java.util.Arrays;

class Solution {
  public int solution(int K, int M, int[] A) {
    int max, min, tryNum;
    boolean passTry;

    max = ((A.length / K) + 1) * M;
    min = 0;

    while (min < max) {
      tryNum = (min + max) / 2;
      passTry = available(tryNum, K, A);
      // System.out.printf("num %d pass try %s\n", tryNum, passTry);
      if (passTry) {
        max = tryNum;
      } else {
        min = tryNum + 1;
      }
    }

    return min;
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

    // System.out.printf("try num: %s, used block %d\n", minMax, usedBlock);

    return true;
  }
}
