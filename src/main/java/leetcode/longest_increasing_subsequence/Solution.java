package leetcode.longest_increasing_subsequence;


class Solution {
  private int N;
  private int[] dp;
  private int ans;
  private int[] nums;

  public int lengthOfLIS(int[] nums) {
    this.nums = nums;
    N = nums.length;

    if (N == 0) {
      return 0;
    }

    if (N == 1) {
      return 1;
    }

    initDp();
    proceedDp();
    findAns();

    return ans;
  }

  private void initDp() {
    dp = new int[N];

    dp[0] = 1;
  }

  private void proceedDp() {
    for (int i = 1; i < N; i++) {
      innerLoop(i);
    }
  }

  private void innerLoop(int i) {
    int current, max;

    max = 1;
    for (int j = 0; j < i; j++) {
      if (nums[j] < nums[i]) {
        current = dp[j] + 1;
        if (current > max) {
          max = current;
        }
      }
    }

    dp[i] = max;
  }

  private void findAns() {
    ans = 1;
    for (int i = 0; i < N; i++) {
      if (ans < dp[i]) {
        ans = dp[i];
      }
    }
  }
}
