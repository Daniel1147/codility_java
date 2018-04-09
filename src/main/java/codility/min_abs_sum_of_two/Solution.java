package codility.min_abs_sum_of_two;

import java.util.Arrays;

class Solution {
  private int N, counterNA, counterPA;
  private int[] nA, pA;

  public int solution(int[] A) {
    int min = -1;

    N = A.length;

    nA = new int[N];
    pA = new int[N];
    counterNA = 0;
    counterPA = 0;

    buildDoubleA(A);

    // System.out.printf("pa: %s\n", Arrays.toString(pA));
    // System.out.printf("na: %s\n", Arrays.toString(nA));
    if (counterPA == 0) {
      return nA[0] * 2;
    }

    if (counterNA == 0) {
      return pA[0] * 2;
    }

    min = getMinBoth();

    if (min > nA[0] * 2)
      min = nA[0] * 2;

    if (min > pA[0] * 2)
      min = pA[0] * 2;

    return min;
  }

  private int getMinBoth() {
    int indexPA, indexNA, minBoth, bothAbs;

    // init
    indexPA = 0;
    indexNA = 0;
    minBoth = abs(pA[indexPA] - nA[indexNA]);

    while(indexPA < counterPA && indexNA < counterNA) {
      bothAbs = abs(pA[indexPA] - nA[indexNA]);

      if (minBoth > bothAbs)
        minBoth = bothAbs;

      if (pA[indexPA] < nA[indexNA]) {
        indexPA++;
      } else {
        indexNA++;
      }
    }

    return minBoth;
  }

  private int abs(int a) {
    if (a < 0)
      return a * -1;

    return a;
  }

  private void buildDoubleA(int[] A) {
    for (int i = 0; i < A.length; i++) {
      if (A[i] >= 0) {
        nA[counterNA] = A[i];
        counterNA++;

        continue;
      }

      pA[counterPA] = A[i] * -1;
      counterPA++;
    }

    Arrays.sort(pA, 0, counterPA);
    Arrays.sort(nA, 0, counterNA);
  }
}
