package leetcode.single_number;

import java.util.*;

class Solution {
  public int singleNumber(int[] nums) {
    int result;

    result = 0;
    for (int i = 0; i < nums.length; i++)
      result = result ^ nums[i];

    return result;
  }
}
