package leetcode.counting_bits;

import java.util.Arrays;

class Solution {
  public int[] countBits(int num) {
    int count;
    int[] bits, result;

    bits = new int[32];
    result = new int[num + 1];

    count = 0;
    result[0] = count;

    for (int i = 1; i < num + 1; i++) {
      for (int j = 31; j >= 0; j--) {
        if (bits[j] == 0) {
          bits[j] = 1;
          count++;

          break;
        }

        bits[j] = 0;
        count --;
      }

      result[i] = count;
    }

    return result;
  }
}
