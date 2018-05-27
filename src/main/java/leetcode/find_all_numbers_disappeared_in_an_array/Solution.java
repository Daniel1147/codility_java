package leetcode.find_all_numbers_disappeared_in_an_array;

import java.util.ArrayList;
import java.util.List;

class Solution {
  public List<Integer> findDisappearedNumbers(int[] nums) {
    List<Integer> result = new ArrayList<Integer>();
    int n;

    n = nums.length;

    for (int i = 0; i < n; i++)
      nums[(nums[i] - 1) % n] += n;

    for (int i = 0; i < n; i++) {
      if (nums[i] <= n)
        result.add(i + 1);
    }


    return result;
  }
}
