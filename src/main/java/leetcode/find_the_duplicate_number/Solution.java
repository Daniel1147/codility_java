package leetcode.find_the_duplicate_number;

import java.util.*;

class Solution {
  public int findDuplicate(int[] nums) {
    boolean[] a;
    int n;

    a = new boolean[nums.length + 1];

    for (int i = 0; i < nums.length; i++) {
      n = nums[i];
      if (a[n])
        return n;

      a[n] = true;
    }

    return -1;
  }
}
