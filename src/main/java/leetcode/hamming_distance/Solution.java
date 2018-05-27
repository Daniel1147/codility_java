package leetcode.hamming_distance;

import java.util.*;

class Solution {
  public int hammingDistance(int x, int y) {
    int xor, one, count, result;

    xor = x ^ y;
    one = 1;
    count = 0;
    result = 0;

    while (count < 32) {
      result += one & xor;

      xor = xor >> 1;

      count++;
    }

    return result;
  }
}
