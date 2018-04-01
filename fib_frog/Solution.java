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

    stepCounter = countStep(fibMap, riverMap, currentP);

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

  private int countStep(int[] fibMap, int[] riverMap, int currentP) {
    int nextP;
    int nextCountStep;
    for (nextP = riverMap.length - 1; nextP > currentP; nextP--) {
      if (reachable(fibMap, riverMap, currentP, nextP)) {
        /* System.out.printf("jump from %d to %d\n", riverMap[currentP], riverMap[nextP]); */

        if (nextP == riverMap.length - 1) {
          return 1;
        }

        nextCountStep = countStep(fibMap, riverMap, nextP);
        if (nextCountStep >= 0) {
          return countStep(fibMap, riverMap, nextP) + 1;
        }
      }
    }

    return -1;
  }

  private boolean reachable(int[] fibMap, int[] riverMap, int startP, int targetP) {
    int distance = riverMap[targetP] - riverMap[startP];

    for (int i = fibMap.length - 1; i > 0; i--) {
      if (distance == fibMap[i]) {
        return true;
      }
    }

    return false;
  }
}
