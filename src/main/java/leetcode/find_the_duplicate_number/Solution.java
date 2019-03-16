package leetcode.find_the_duplicate_number;

import java.util.*;

class Solution {
  public int findDuplicate(int[] nums) {
    boolean[] a;
    int fast, slow, slow2, before;
    int cnt;

    if (nums.length == 2)
      return nums[0];

    fast = 0;
    slow = 0;
    before = 0;
    cnt = 0;

    do {
      before = slow;
      slow = nums[slow];
      fast = nums[fast];
      fast = nums[fast];
    } while (fast != slow);

    slow2 = 0;

    while (slow2 != slow) {
      before = slow;
      slow = nums[slow];
      slow2 = nums[slow2];
    }

    return nums[before];
  }
}
