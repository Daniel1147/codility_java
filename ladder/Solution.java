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

    fibL[0] = 1;
    fibL[1] = 1;
    fibL[2] = 2;

    for (int i = 3; i < n; i++) {
      fibL[i] = fibL[i - 2] + fibL[i - 1];
    }

    return fibL;
  }
}
