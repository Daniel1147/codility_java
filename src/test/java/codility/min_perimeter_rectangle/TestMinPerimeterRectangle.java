package codility.min_perimeter_rectangle;

import java.util.ArrayList;
import java.util.Arrays;

class TestMinPerimeterRectangle {
  public static void main(String[] args) {

    ArrayList<Integer> inputList = new ArrayList<Integer>();

    // input 1
    inputList.add(30);

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
