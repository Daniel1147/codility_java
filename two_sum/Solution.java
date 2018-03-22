import java.util.Arrays;

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

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] testCase = {2, 7, 11, 15};
        int target = 9;

        System.out.println(Arrays.toString(testCase));
        System.out.println(target);
        System.out.println(Arrays.toString(solution.twoSum(testCase, target)));
    }
}
