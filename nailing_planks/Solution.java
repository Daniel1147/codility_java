package codility.nailing_planks;

import java.util.Arrays;

class Solution {
  public int solution(int[] A, int[] B, int[] C) {
    int min, max, M, N, tryNum;
    boolean passTry;

    N = A.length;
    M = C.length;
    min = 1;
    max = N;

    while (min < max) {
      tryNum = (min + max) / 2;
      passTry = tryTry(tryNum, A, B, C);

      // System.out.printf("try try of %d: %s\n", tryNum, passTry);

      if (passTry) {
        max = tryNum;
      } else {
        min = tryNum + 1;
      }
    }

    passTry = tryTry(min, A, B, C);
    if (!passTry) {
      min = -1;
    }

    return min;
  }

  private boolean tryTry(int tryNum, int[] A, int[] B, int[] C) {
    int[] CMap;
    int start, end, rightFisrtNail;
    CMap = getCMap(tryNum, C);

    // System.out.printf("cmap of %d:\n\t%s\n", tryNum, Arrays.toString(CMap));

    for (int i = 0; i < A.length; i++) {
      start = A[i];
      end = B[i];

      rightFisrtNail = CMap[start];

      // System.out.printf("right first nail: %s\n", rightFisrtNail);

      if (rightFisrtNail == -1) {
        // System.out.printf("fail at %d: 0\n", i);

        return false;
      }

      if (rightFisrtNail > end) {
        // System.out.printf("right fisrt nail %d over end %d\n", rightFisrtNail, end);

        return false;
      }
    }

    return true;
  }

  private int[] getCMap(int n, int[] C) {
    int[] cMap = new int[C.length * 2 + 2];
    int[] advancedCMap = new int[C.length * 2 + 2];
    int next;

    for (int i = 0; i < n; i++) {
      cMap[C[i]] = 1;
    }

    next = -1;
    for (int i = advancedCMap.length - 1; i >= 0; i--) {
      if (cMap[i] == 1) {
        next = i;
      }

      advancedCMap[i] = next;
    }

    return advancedCMap;
  }
}
