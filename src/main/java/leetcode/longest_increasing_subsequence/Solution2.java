package leetcode.longest_increasing_subsequence;

import java.util.Arrays;

class Solution2 {
  private int N;
  private int[] dp, nums;
  private int len;

  public int lengthOfLIS(int[] nums) {
    int insertIndex;

    this.nums = nums;
    N = nums.length;
    len = 0;

    dp = new int[N];

    for (int i = 0; i < N; i++) {
      insertIndex = countIndex(nums[i]);
      if (insertIndex == len) {
        len++;
      }

      dp[insertIndex] = nums[i];
    }

    return len;
  }

  private int countIndex(int currentNum) {
    int start, end, toExam, toExamIndex;
    start = 0;
    end = len;

    dp[len] = currentNum + 1;

    while(start < end) {
      toExamIndex = (start + end) / 2;

      toExam = dp[toExamIndex];

      if (toExam < currentNum) {
        start = toExamIndex + 1;
      } else {
        end = toExamIndex;
      }
    }

    return start;
  }
}
