package codility.two_sum;

import java.util.Arrays;

class TestTwoSum {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] testCase = {2, 7, 11, 15};
        int target = 9;

        System.out.println(Arrays.toString(testCase));
        System.out.println(target);
        System.out.println(Arrays.toString(solution.twoSum(testCase, target)));
    }
}
