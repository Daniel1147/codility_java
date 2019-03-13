package leetcode._3sum;

import java.util.*;

class Solution {
  public List<List<Integer>> threeSum(int[] nums) {
    List<List<Integer>> result;
    int i1, i2, i3, sum, oldI1, oldI2;

    result = new ArrayList<List<Integer>>();

    if (nums.length < 3)
      return result;

    Arrays.sort(nums);
    i1 = 0;
    i2 = 1;
    while (i1 < nums.length - 2) {
      sum = (nums[i1] + nums[i2]) * -1;
      for (i3 = nums.length - 1; i3 > i2; i3--) {
        if (nums[i3] == sum) {
          result.add(build(nums, i1, i2, i3));
          break;
        }
      }
      oldI2 = nums[i2];
      i2++;
      while(i2 < nums.length && oldI2 == nums[i2])
        i2++;
      if (i2 > nums.length - 2) {
        oldI1 = nums[i1];
        i1++;
        while(i1 < nums.length && oldI1 == nums[i1])
          i1++;
        i2 = i1 + 1;
      }
    }

    return result;
  }

  private List<Integer> build(int[] nums, int a, int b, int c) {
    List<Integer> result;

    result = new ArrayList<Integer>();
    result.add(nums[a]);
    result.add(nums[b]);
    result.add(nums[c]);

    return result;
  }
}
