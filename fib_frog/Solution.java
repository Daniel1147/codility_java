package codility.fib_frog;

import java.util.Arrays;

class Solution {
  public int solution(int[] A) {
    int[] fibMap = getFibMap();
    int[] riverMap = getRiverMap(A);

    /* System.out.printf("%s\n", Arrays.toString(fibMap)); */
    /* System.out.printf("river map: %s\n", Arrays.toString(riverMap)); */

    int[] fibCount = new int[A.length + 2];
    fibCount[0] = 1;

    for (int i = 1; i < A.length + 2; i++) {
      if (riverMap[i] == 1) {
        fibCount[i] = getFibCount(fibMap, riverMap, fibCount, i);
      }
    }
    /* System.out.printf("fib count: %s\n", Arrays.toString(fibCount)); */

    return fibCount[A.length + 1] - 1;
  }

  private int[] getFibMap() {
    int[] rawFib = new int[35];
    int fibCount = 2;
    int currentFib = 1;
    rawFib[0] = 1;
    rawFib[1] = 1;
    for (int i = 2; currentFib < 100002; i++) {
      currentFib = rawFib[i - 2] + rawFib[i - 1];
      rawFib[i] = currentFib;
      fibCount++;
    }

    int[] fib = new int[fibCount];

    for (int i = 0; i < fibCount; i++) {
      fib[i] = rawFib[i];
    }

    return Arrays.copyOfRange(rawFib, 0, fibCount);
  }

  private int[] getRiverMap(int[] A) {
    int[] riverMap = new int[A.length + 2];
    riverMap[0] = 1;
    for (int i = 0; i < A.length; i++) {
      riverMap[i + 1] = A[i];
    }

    riverMap[A.length + 1] = 1;

    return riverMap;
  }

  private int getFibCount(int[] fibMap, int[] riverMap, int[] fibCount, int target) {
    int min = riverMap.length;
    int previousP;
    int currentCount;
    for (int i = 0; i < fibMap.length; i++) {
      if (target - fibMap[i] < 0) {
        break;
      }

      previousP = target - fibMap[i];
      if (riverMap[previousP] == 1 && fibCount[previousP] > 0) {
        currentCount = fibCount[previousP] + 1;
        if (min > currentCount) {
          min = currentCount;
        }
      }
    }

    if (min == riverMap.length) {
      return 0;
    }

    return min;
  }
}
