package leetcode.n_repeated_element_in_size_2n_array;

import java.util.*;

class Solution {
  private int ELEMENT_MAX = 10000;

  public int repeatedNTimes(int[] A) {
    int n = A.length;
    int i1, i2;
    Random rand = new Random();

    while (true) {
      i1 = rand.nextInt(n);
      i2 = rand.nextInt(n);
      while (i1 == i2) {
        i2 = rand.nextInt(n);
      }

      if (A[i1] == A[i2]) {
        return A[i1];
      }
    }
  }
}
