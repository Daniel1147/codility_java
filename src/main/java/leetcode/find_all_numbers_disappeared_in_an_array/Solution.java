package leetcode.find_all_numbers_disappeared_in_an_array;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

class Solution {
  public List<Integer> findDisappearedNumbers(int[] nums) {
    int tmp, target, indexScan;
    List<Integer> result;

    result = new ArrayList<Integer>();

    if (nums == null || nums.length == 0)
      return result;
    // swap
    indexScan = 0;
    while (indexScan < nums.length) {
      target = nums[indexScan] - 1;

      if (target == indexScan) {
        indexScan++;

        continue;
      }

      if (nums[target] == target + 1) {
        indexScan++;

        continue;
      }

      tmp = nums[target];
      nums[target] = nums[indexScan];
      nums[indexScan] = tmp;
    }

    for (int i = 0; i < nums.length; i++) {
      if (nums[i] != i + 1)
        result.add(i + 1);
    }

    return result;
  }
}
