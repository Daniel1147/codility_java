package leetcode._3sum;

import java.util.*;

class Solution {
  public List<List<Integer>> threeSum(int[] nums) {
    List<List<Integer>> result;
    List<Integer> list;
    int i1, i2, i3, sum;

    result = new ArrayList<List<Integer>>();

    if (nums.length < 3)
      return result;

    Arrays.sort(nums);

    i1 = 0;
    while (i1 < nums.length - 2) {
      i2 = i1 + 1;
      i3 = nums.length - 1;

      while (i2 < i3) {
        sum = nums[i1] + nums[i2] + nums[i3];
        if (sum == 0) {
          list = new ArrayList<Integer>();
          list.add(nums[i1]);
          list.add(nums[i2]);
          list.add(nums[i3]);
          result.add(list);

          while (i2 < i3 && nums[i2 + 1] == nums[i2])
            i2++;
          i2++;

          while (i3 > i2 && nums[i3 - 1] == nums[i3])
            i3--;
          i3--;
        } else if (sum < 0)
          i2++;
        else
          i3--;
      }

      // to next i1
      while (i1 + 1 < nums.length && nums[i1 + 1] == nums[i1])
        i1++;
      i1++;
    }

    return result;
  }
}
