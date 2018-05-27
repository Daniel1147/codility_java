package leetcode.subarray_sum_equals_k;

import java.util.HashMap;

class Solution {
  public int subarraySum(int[] nums, int k) {
    int result, sum, oldHash, remainCount;
    HashMap<Integer, Integer> m;

    m = new HashMap<>();
    result = 0;
    sum = 0;

    m.put(0, 1);
    for (int i = 0; i < nums.length; i++) {
      sum += nums[i];

      // add result
      remainCount = (m.containsKey(sum - k)) ? m.get(sum - k) : 0;
      // System.out.printf("remain count => %d\n", remainCount);
      result += remainCount;


      // add hash
      oldHash = m.containsKey(sum) ? m.get(sum) : 0;
      // System.out.printf("put %d => %d\n", sum, oldHash + 1);
      m.put(sum, oldHash + 1);
    }

    return result;
  }
}
