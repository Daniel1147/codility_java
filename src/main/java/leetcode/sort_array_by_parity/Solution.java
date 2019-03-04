package leetcode.sort_array_by_parity;

import java.util.*;

class Solution {
  public int[] sortArrayByParity(int[] A) {
    int oddHead = A.length;
    int tmp;

    for (int i = 0; i < oddHead; i++) {
      if (A[i] % 2 == 1) {
        oddHead--;
        tmp = A[i];
        A[i] = A[oddHead];
        A[oddHead] = tmp;

        i--;
      }
    }

    return A;
  }
}
