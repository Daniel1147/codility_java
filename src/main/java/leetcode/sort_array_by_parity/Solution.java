package leetcode.sort_array_by_parity;

import java.util.*;

class Solution {
  public int[] sortArrayByParity(int[] A) {
    int[] result = new int[A.length];
    int evenIndex, oddIndex;

    evenIndex = 0;
    oddIndex = A.length - 1;

    for (int i = 0; i < A.length; i++) {
      if (A[i] % 2 == 0) {
        result[evenIndex] = A[i];
        evenIndex++;
      } else {
        result[oddIndex] = A[i];
        oddIndex--;
      }
    }

    return result;
  }
}
