package codility.peaks;

import java.util.ArrayList;
import java.util.Arrays;

class TestPeaks {
  public static void main(String[] args) {

    ArrayList<int[]> inputList = new ArrayList<int[]>();

    // input 1
    inputList.add(new int[]{1, 2, 3, 4, 3, 4, 1, 2, 3, 4, 6, 2});

    // input 2
    inputList.add(new int[]{1, 5, 3, 4, 3, 4, 1, 2, 3, 4, 6, 2});

    // input 3
    inputList.add(new int[]{0, 1, 0, 0, 1, 0, 0, 1, 0});

    // input 4
    inputList.add(new int[]{0, 1, 0, 1, 0, 0, 0, 0, 0});

    Solution solution = new Solution();
    for (int[] input : inputList) {
      System.out.printf("input: %s\nans: %d\n", Arrays.toString(input), solution.solution(input));
    }
  }
}
