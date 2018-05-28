package leetcode.counting_bits;

import java.util.Arrays;

class Solution {
  public int[] countBits(int num) {
    int[] result;

    result = new int[num + 1];

    for (int i = 1; i < num + 1; i++) {
      result[i] = result[i / 2] + (i & 1);
    }

    return result;
  }
}
