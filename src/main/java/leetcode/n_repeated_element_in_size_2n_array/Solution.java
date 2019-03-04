package leetcode.n_repeated_element_in_size_2n_array;

import java.util.*;

class Solution {
  private int ELEMENT_MAX = 10000;

  public int repeatedNTimes(int[] A) {
    int n = A.length;
    int[] record = new int[ELEMENT_MAX + 1];
    int i_element;

    for (int i = 0; i < n; i++) {
      i_element = A[i];
      record[i_element]++;
    }

    for (int i = 0; i < ELEMENT_MAX + 1; i++) {
      if (record[i] == n / 2)
        return i;
    }

    return -1;
  }
}
