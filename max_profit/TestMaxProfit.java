package codility.max_profit;

import java.util.ArrayList;
import java.util.Arrays;

class TestMaxProfit {
  public static void main(String[] args) {
    ArrayList<int[]> inputList = new ArrayList<int[]>();

    // input 1
    inputList.add(new int[] {23171, 21011, 21123, 21366, 21013, 21367});

    Solution solution = new Solution();
    for (int[] input : inputList) {
      System.out.printf("input: %s\nans: %d\n", Arrays.toString(input), solution.solution(input));
    }
  }
}
