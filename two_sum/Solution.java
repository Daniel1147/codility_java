package codility.two_sum;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            int ans = twoSumWithIndex(nums, i + 1, target - nums[i]);
            if (ans != -1) {
                return new int[]{i, ans};
            }
        }
        return new int[]{-1, -1};
    }

    private int twoSumWithIndex(int[] nums, int index, int target) {
        for (int i = index; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }

        return -1;
    }
}
