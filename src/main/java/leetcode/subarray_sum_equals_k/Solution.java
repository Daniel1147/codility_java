package leetcode.subarray_sum_equals_k;

class Solution {
  public int subarraySum(int[] nums, int k) {
    int[] leftSum;
    int result, sumToI;

    if (nums == null || nums.length == 0)
      return 0;

    leftSum = new int[nums.length + 1];

    for (int i = 0; i < nums.length; i++) {
      leftSum[i + 1] = leftSum[i] + nums[i];
    }

    result = 0;
    for (int i = 0; i < nums.length; i++) {
      sumToI = leftSum[i + 1];
      for (int j = 0; j <= i; j++) {
        if (sumToI - leftSum[j] == k) {
          result++;
        }
      }
    }

    return result;
  }
}
