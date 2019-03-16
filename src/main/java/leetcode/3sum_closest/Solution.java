package leetcode._3sum_closest;

import java.util.*;

class Solution {
  public int threeSumClosest(int[] nums, int target) {
    int diff, p1, p2, p3, closest, sum;

    Arrays.sort(nums);

    diff = 1 << 31 - 1;
    closest = 0;

    for (p1 = 0; p1 < nums.length - 2; p1++) {
      p2 = p1 + 1;
      p3 = nums.length - 1;
      while (p2 < p3) {
        sum = nums[p1] + nums[p2] + nums[p3];
        if (sum == target)
          return sum;

        if (Math.abs(sum - target) < diff) {
          closest = sum;
          diff = Math.abs(sum - target);
        }

        if (sum > target) {
          p3--;
        } else {
          p2++;
        }
      }
    }

    return closest;
  }
}
