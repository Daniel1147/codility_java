package leetcode._3sum;

import java.util.*;

class Solution {
  public List<List<Integer>> threeSum(int[] nums) {
    List<List<Integer>> result;
    int i1, i2, i3, sum, oldI1, oldI2, oldI3, layer1I3;

    result = new ArrayList<List<Integer>>();

    if (nums.length < 3)
      return result;

    Arrays.sort(nums);

    i1 = 0;
    layer1I3 = nums.length - 1;
    while (i1 < nums.length - 2) {
      i2 = i1 + 1;
      i3 = layer1I3;
      while (i2 < i3) {
        sum = -1 * (nums[i1] + nums[i2]);

        i3 = bSearch(nums, i2 + 1, i3, sum);
        if (sum == nums[i3])
          result.add(build(nums[i1], nums[i2], nums[i3]));

        if (i2 == i1 + 1)
          layer1I3 = i3;

        oldI2 = nums[i2];
        i2++;
        while (i2 < nums.length - 1 && nums[i2] == oldI2)
          i2++;
      }

      oldI1 = nums[i1];
      i1++;
      while (i1 < nums.length - 2 && nums[i1] == oldI1)
        i1++;
    }

    return result;
  }

  private List<Integer> build(int a, int b, int c) {
    List<Integer> result;

    result = new ArrayList<Integer>();
    result.add(a);
    result.add(b);
    result.add(c);

    return result;
  }

  private int bSearch(int[] nums, int start, int end, int ceiling) {
    int middle;
    if (start >= end)
      return start;

    middle = ((start + end) / 2) + 1;
    if (nums[middle] == ceiling) {
      while (middle - 1 >= start && nums[middle - 1] == ceiling)
        middle--;
      return middle;
    }

    if (nums[middle] > ceiling) {
      return bSearch(nums, start, middle - 1, ceiling);
    }

    return bSearch(nums, middle, end, ceiling);
  }
}
