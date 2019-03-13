package leetcode.two_sum_ii;

import java.util.*;

class Solution {
  public int[] twoSum(int[] numbers, int target) {
    int l, r, sum;
    int[] result;

    l = 0;
    r = numbers.length - 1;

    while (l < r) {
      sum = numbers[l] + numbers[r];

      if (sum == target) {
        result = new int[2];
        result[0] = l + 1;
        result[1] = r + 1;

        return result;
      } else if (sum < target)
        l++;
      else
        r--;
    }

    return null;
  }
}
