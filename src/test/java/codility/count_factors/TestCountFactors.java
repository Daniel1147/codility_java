package codility.count_factors;

import java.util.ArrayList;
import java.util.Arrays;

class TestCountFactors {
  public static void main(String[] args) {

    // for (int i = 1; i < 11; i++) {
    //   double sqrt = Math.sqrt(i);
    //
    //   System.out.printf("sqrt: %f, sqrt^2: %f, sqrt to int: %d\n", sqrt, sqrt * sqrt, (int) sqrt);
    // }

    ArrayList<Integer> inputList = new ArrayList<Integer>();

    // input 1
    inputList.add(24);

    // input 2
    inputList.add(1);

    // input 3
    inputList.add(4);

    // input 4
    inputList.add(32);

    // input 5
    inputList.add(16);

    Solution solution = new Solution();
    for (Integer input : inputList) {
      System.out.printf("input: %d\nans: %d\n", input, solution.solution(input));
    }
  }
}
