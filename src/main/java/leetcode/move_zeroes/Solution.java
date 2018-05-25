package leetcode.move_zeroes;

class Solution {
  public void moveZeroes(int[] nums) {
    int slow, fast;

    fast = 0;
    slow = 0;

    while (fast < nums.length) {
      if (nums[fast] != 0) {
        nums[slow] = nums[fast];
        slow++;
      }

      fast++;
    }

    while (slow < nums.length) {
      nums[slow] = 0;
      slow++;
    }

    return;
  }
}
