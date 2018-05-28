package leetcode.shortest_unsorted_continuous_subarray;

import java.util.Arrays;

class Solution {
  public int findUnsortedSubarray(int[] nums) {
    int rLeft, rRight, min, max, start, end;

    // rLeft
    rLeft = -1;

    for (int i = 0; i < nums.length - 1; i++) {
      if (nums[i] > nums[i + 1]) {
        rLeft = i;

        break;
      }
    }
    if (rLeft == -1)
      return 0;

    // rRight
    rRight = -1;
    for (int i = nums.length - 1; i > 0; i--) {
      if (nums[i - 1] > nums[i]) {
        rRight = i;

        break;
      }
    }

    // min
    min = nums[rLeft];
    max = nums[rLeft];
    for (int i = rLeft; i <= rRight; i++) {
      if (min > nums[i])
        min = nums[i];

      if (max < nums[i])
        max = nums[i];
    }

    // start
    start = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] > min) {
        start = i;

        break;
      }
    }

    // end
    end = nums.length - 1;
    for (int i = nums.length - 1; i >= 0; i--) {
      if (nums[i] < max) {
        end = i;

        break;
      }
    }

    return end - start + 1;
  }
}
