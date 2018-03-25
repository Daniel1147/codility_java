package codility.flags;

import java.util.Arrays;

class Solution {
  public int solution(int[] A) {
    int[] peakList = new int[A.length];
    int peakNum = 0;

    int length = 2;
    int firstPeak;
    for (int i = A.length - 2; i > 0; i--) {
      if (A[i - 1] < A[i] && A[i] > A[i + 1]) {
        peakList[i] = length;
        firstPeak = i;
        length = 0;
        peakNum++;
      }
      length++;
    }

    int maxFlag = 0;
    for ( int carryFlagNum = 1; carryFlagNum <= peakNum; carryFlagNum++) {
      int usedFlag = 0;
      for (int i = 0; i < peakList.length; i++) {
        if (peakList[i] != 0) {
          usedFlag++;
          // System.out.printf("peak %d\n", i);
          i += carryFlagNum - 1;

          // out of flags
          if (usedFlag == carryFlagNum) {
            break;
          }
        }
      }

      // System.out.printf("carry %d flags, used %d flags\n", carryFlagNum, usedFlag);

      if (usedFlag > maxFlag) {
        maxFlag = usedFlag;
      }

      // not using all flag, max flag does not grow now
      if (usedFlag != carryFlagNum) {
        break;
      }
    }

    // System.out.printf("peakList: %s\npeakNum: %d\n", Arrays.toString(peakList), peakNum);

    return maxFlag;
  }
}
