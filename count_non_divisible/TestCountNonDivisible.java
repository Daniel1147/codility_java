package codility.count_non_divisible;

import java.util.ArrayList;
import java.util.Arrays;

class TestCase {
  public int[] A;
  public int[] expected;

  public TestCase(int[] testA, int[] testExpected) {
    A = testA;
    expected = testExpected;
  }
}

class TestCountNonDivisible {
  public static void main(String[] args) {
    ArrayList<TestCase> inputList = new ArrayList<TestCase>();
    int[] testA, testExpected;
    int testN;

    // input 1
    testA = new int[]{3, 1, 2, 3, 6};
    testExpected = new int[]{2, 4, 3, 2, 0};
    inputList.add(new TestCase(testA, testExpected));

    Solution s = new Solution();
    for (TestCase input : inputList) {
      int[] A = input.A;
      int[] expected = input.expected;

      int[] ans = s.solution(A);

      System.out.printf(
          "input:\nA:\t\t%s\nans:\t\t%s\nexpected:\t%s\n",
          Arrays.toString(A), Arrays.toString(ans), Arrays.toString(expected));
    }
  }
}
