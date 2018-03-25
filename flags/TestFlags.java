package codility.flags;

import java.util.ArrayList;
import java.util.Arrays;

class TestFlags {
  public static void main(String[] args) {

    ArrayList<int[]> inputList = new ArrayList<int[]>();

    // input 1
    inputList.add(new int[]{1, 5, 3, 4, 3, 4, 1, 2, 3, 4, 6, 2});

    Solution solution = new Solution();
    for (int[] input : inputList) {
      System.out.printf("input: %s\nans: %d\n", Arrays.toString(input), solution.solution(input));
    }
  }
}
