package leetcode.shortest_unsorted_continuous_subarray;

import java.util.Arrays;

class Solution {
  public int findUnsortedSubarray(int[] nums) {
    int[] sorted;
    int start, end;

    sorted = nums.clone();
    Arrays.sort(sorted);

    start = nums.length;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] != sorted[i]) {
        start = i;

        break;
      }
    }
    if (start == nums.length)
      return 0;

    end = -1;
    for (int i = nums.length - 1; i >= 0; i--) {
      if (nums[i] != sorted[i]) {
        end = i;

        break;
      }
    }

    return end - start + 1;
  }
}
