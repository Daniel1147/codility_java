package codility.max_slice_sum;

import java.util.ArrayList;
import java.util.Arrays;

class TestMaxSliceSum {
  public static void main(String args[]) {
    ArrayList<int[]> inputList = new ArrayList<int[]>();

    // input 1
    inputList.add(new int[] {3, 2, -6, 4, 0});

    Solution solution = new Solution();
    for (int[] input : inputList) {
      System.out.printf("input: %s\nans: %d\n", Arrays.toString(input), solution.solution(input));
    }
  }
}
