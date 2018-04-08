package codility.dominator;

import java.util.ArrayList;
import java.util.Arrays;

class TestDominator {
  public static void main(String[] args) {
    ArrayList<int[]> inputList = new ArrayList<int[]>();

    // input 1
    inputList.add(new int[] {3, 4, 3, 2, 3, -1, 3, 3});

    // input 2
    inputList.add(new int[] {1, 1, 1, 1, 2, 2, 2, 2});

    // input 3
    inputList.add(new int[] {1, 1, 1, 1, 1, 2, 2, 2});

    // input 4
    inputList.add(new int[] {1, 1, 1, 2, 2, 2, 5});

    Solution solution = new Solution();
    for (int[] input : inputList) {
      System.out.printf("input: %s\nans: %d\n", Arrays.toString(input), solution.solution(input));
    }
  }
}
