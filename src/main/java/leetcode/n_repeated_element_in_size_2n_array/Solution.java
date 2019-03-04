package leetcode.n_repeated_element_in_size_2n_array;

import java.util.*;

class Solution {
  private int ELEMENT_MAX = 10000;

  public int repeatedNTimes(int[] A) {
    int n = A.length;
    Set<Integer> s= new HashSet<Integer>();
    int iElement;
    int targetRepeatTimes = n / 2;

    for (int i = 0; i < n; i++) {
      iElement = A[i];

      if (s.contains(iElement))
        return iElement;

      s.add(iElement);
    }

    return -1;
  }
}
