package leetcode.find_the_duplicate_number;

import java.util.*;

class Solution {
  public int findDuplicate(int[] nums) {
    Set<Integer> s = new HashSet<Integer>();

    for (int i = 0; i < nums.length; i++) {
      if (s.contains(nums[i]))
        return nums[i];

      s.add(nums[i]);
    }

    return -1;
  }
}
