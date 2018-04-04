package codility.ladder;

import java.util.Arrays;

class Solution {
  public int[] solution(int[] A, int[] B) {
    int L = A.length;
    int[] fibL;
    int[] ans = new int[L];
    int modulo;

    fibL = getFibL(L + 1);

    for (int i = 0; i < L; i++) {
      modulo = 1 << B[i];
      ans[i] = fibL[A[i]] % modulo;
    }

    // System.out.printf("fibL: %s\n", Arrays.toString(fibL));

    return ans;
  }

  private int[] getFibL(int n) {
    if (n < 3) {
      n = 3;
    }
    int[] fibL = new int[n];
    int newFib;
    int max = 1 << 30;

    fibL[0] = 1;
    fibL[1] = 1;
    fibL[2] = 2;

    for (int i = 3; i < n; i++) {
      newFib = fibL[i - 2] + fibL[i - 1];
      while (newFib >= max) {
        newFib -= max;
      }
      fibL[i] = newFib;
    }

    return fibL;
  }
}
