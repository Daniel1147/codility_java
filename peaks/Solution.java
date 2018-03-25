package codility.peaks;

import java.util.Arrays;

class Solution {
  public int solution(int[] A) {
    int[] peakList = new int[A.length];
    int[] nextPeakList = new int[A.length];
    int maxBlock = 0;
    int peakCount = 0;

    for (int i = 1; i < A.length - 1; i++) {
      if (A[i] > A[i - 1] && A[i] > A[i + 1]) {
        peakList[i] = 1;
        peakCount++;
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

    // System.out.printf("peak list: %s\nnext peak list: %s\n", Arrays.toString(peakList), Arrays.toString(nextPeakList));
    int blockNum = peakCount;
    while(blockNum > 0) {
      if (A.length % blockNum != 0) {
        blockNum--;

        continue;
      }

      boolean available = true;
      int blockSize = A.length / blockNum;
      for (int i = 0; i < A.length; i += blockSize) {
        if (nextPeakList[i] < 0 || nextPeakList[i] >= i + blockSize) {
          available = false;

          break;
        }
      }

      if (available == true) {
        break;
      }

      blockNum--;
    }

    return blockNum;
  }
}
