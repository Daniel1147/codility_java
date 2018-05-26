package leetcode.find_all_numbers_disappeared_in_an_array;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

class Solution {
  public List<Integer> findDisappearedNumbers(int[] nums) {
    int value, targetValue;
    List<Integer> result = new ArrayList<Integer>();

    if (nums == null || nums.length < 2)
      return result;

    for (int i = 0; i < nums.length; i++) {
      value = nums[i];
      if (value < 0)
        value = value * -1;

      targetValue = nums[value - 1];
      if (targetValue > 0)
        nums[value - 1]  = targetValue * -1;
    }

    for (int i = 0; i < nums.length; i++) {
      if (nums[i] > 0) {
        result.add(i + 1);
      }
    }

    return result;

  }
}
