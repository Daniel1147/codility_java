package codility.flags;

import java.util.Arrays;

class Solution {
  public int solution(int[] A) {
    int[] peakList = new int[A.length];
    int[] nextPeakList = new int[A.length];

    for (int i = 1; i < A.length - 1; i++) {
      if (A[i] > A[i - 1] && A[i] > A[i + 1]) {
        peakList[i] = 1;
      }
    }

    int lastPeak = -1;
    for (int i = peakList.length - 1; i >= 0; i--) {
      nextPeakList[i] = lastPeak;
      if (peakList[i] != 0) {
        lastPeak = i;
        nextPeakList[i] = lastPeak;
      }
    }

    int maxFlag = 0;

    for (int carryFlagNum = 1; carryFlagNum <= A.length; carryFlagNum++) {
      int flagCount = 0;
      int nextFlag = nextPeakList[0];
      while(nextFlag > 0) {
        /* System.out.printf("carry %d, flag %d\n", carryFlagNum, nextFlag); */
        flagCount++;

        if (flagCount == carryFlagNum) {
          break;
        }

        if (nextFlag + carryFlagNum >= nextPeakList.length) {
          break;
        }
        nextFlag = nextPeakList[nextFlag + carryFlagNum];
      }

      if (flagCount > maxFlag) {
        maxFlag = flagCount;
      }

      if (flagCount < carryFlagNum) {
        break;
      }
    }

    /* System.out.printf("peak list: %s\nnext peak list: %s\nmax limit: %d\n", Arrays.toString(peakList), Arrays.toString(nextPeakList), maxFlagLimit); */

    return maxFlag;
  }
}
