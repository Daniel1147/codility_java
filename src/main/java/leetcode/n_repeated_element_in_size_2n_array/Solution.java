package leetcode.n_repeated_element_in_size_2n_array;

import java.util.*;

class Solution {
  private int ELEMENT_MAX = 10000;

  public int repeatedNTimes(int[] A) {
    int n = A.length;
    int[] count = new int[ELEMENT_MAX + 1];
    int iElement;
    int targetRepeatTimes = n / 2;

    for (int i = 0; i < n; i++) {
      iElement = A[i];
      count[iElement]++;

      if (count[iElement] == targetRepeatTimes) {
        return iElement;
      }
    }

    return -1;
  }
}
