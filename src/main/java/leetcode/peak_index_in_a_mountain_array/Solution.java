package leetcode.peak_index_in_a_mountain_array;

import java.util.*;

class Solution {
  public int peakIndexInMountainArray(int[] A) {

    return bSearch(A, 0, A.length - 1);
  }

  private int bSearch(int[] A, int start, int end) {
    int middle, l, m, r;

    if (start >= end)
      return start;

    middle = (start + end) / 2;
    l = A[middle - 1];
    m = A[middle];
    r = A[middle + 1];
    if (m > l && m > r)
      return middle;

    if (r > m) {
      return bSearch(A, middle, end);
    }

    return bSearch(A, start, middle);
  }
}
