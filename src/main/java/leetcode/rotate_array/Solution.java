package leetcode.rotate_array;

import java.util.*;

class Solution {
  public void rotate(int[] nums, int k) {
    int n, position;

    n = nums.length;

    k = k % n;

    reverse(nums, 0, n - 1);
    reverse(nums, 0, k - 1);
    reverse(nums, k, n - 1);

    return;
  }

  public void reverse(int[] nums, int start, int end) {
    int tmp;
    for (int i = 0; i < ((end - start) + 1) / 2; i++) {
      tmp = nums[start + i];
      nums[start + i] = nums[end - i];
      nums[end - i] = tmp;
    }

    return;
  }
}
