package codility.fib_frog;

import java.util.Arrays;

class Solution {
  public int solution(int[] A) {
    int[] fibMap = getFibMap();
    int[] riverMap = getRiverMap(A);

    // System.out.printf("%s\n", Arrays.toString(fibMap));
    // System.out.printf("%s\n", Arrays.toString(riverMap));

    int currentP = 0;
    int distance;
    int stepCounter = 0;
    int i, startP;

    while (currentP != riverMap.length - 1) {
      startP = currentP;
      for (i = riverMap.length - 1; i > startP; i--) {
        distance = riverMap[i] - riverMap[currentP];
        if (isFibNum(distance, fibMap)) {
          currentP = i;
          stepCounter++;

          // System.out.printf("jump from %d to %d\n", riverMap[startP], riverMap[currentP]);

          break;
        }
      }

      if (i <= startP) {
        return -1;
      }
    }

    return stepCounter;
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
    int leafCount = 1;

    riverMap[0] = -1;

    for (int i = 0; i < A.length; i++) {
      if (A[i] == 1) {
        riverMap[leafCount] = i;
        leafCount++;
      }
    }

    riverMap[leafCount] = A.length;
    leafCount++;

    return Arrays.copyOfRange(riverMap, 0, leafCount);
  }

  private boolean isFibNum(int n, int[] fibMap) {
    for (int i = 0; i < fibMap.length; i++) {
      if (n == fibMap[i]) {
        return true;
      }
    }

    return false;
  }
}
