package codility.flags;

import java.util.Arrays;

class Solution {
  public int solution(int[] A) {
    int[] peakList = new int[A.length];
    int peakNum = 0;

    for (int i = 1; i < A.length - 1; i++) {
      if (A[i - 1] < A[i] && A[i] > A[i + 1]) {
        peakList[i] = 1;
        peakNum++;
      }
    }

    int maxFlag = 0;
    for ( int carryFlagNum = peakNum; carryFlagNum > 0; carryFlagNum--) {
      int usedFlag = 0;
      for (int i = 0; i < peakList.length; i++) {
        if (peakList[i] == 1) {
          usedFlag++;
          // System.out.printf("peak %d\n", i);
          i += carryFlagNum - 1;
          if (usedFlag == carryFlagNum) {
            break;
          }
        }
      }

      // System.out.printf("carry %d flags, used %d flags\n", carryFlagNum, usedFlag);

      if (usedFlag > maxFlag) {
        maxFlag = usedFlag;
      }
    }

    // System.out.printf("peakList: %s\npeakNum: %d\n", Arrays.toString(peakList), peakNum);

    return maxFlag;
  }
}
