package codility.count_semiprimes;

import java.util.ArrayList;
import java.util.Arrays;

class TestCase {
  public int N;
  public int[] P;
  public int[] Q;

  public TestCase(int testN, int[] testP, int[] testQ) {
    N = testN;
    P = testP;
    Q = testQ;
  }
}

class TestCountSemiprimes {
  public static void main(String[] args) {
    ArrayList<TestCase> inputList = new ArrayList<TestCase>();
    int[] testP, testQ;
    int testN;

    // input 2
    testN = 26;
    testP = new int[] {1, 4, 16};
    testQ = new int[] {26, 10, 20};
    inputList.add(new TestCase(testN, testP, testQ));

    Solution s = new Solution();
    for (TestCase input : inputList) {
      testN = input.N;
      testP = input.P;
      testQ = input.Q;

      int[] ans = s.solution(testN, testP, testQ);

      System.out.printf(
          "input:\nN:\t%d\nP:\t%s\nQ:\t%s\nans:\t%s\n",
          testN, Arrays.toString(testP), Arrays.toString(testQ), Arrays.toString(ans));
    }

    /* ArrayList<int[]> inputList = new ArrayList<int[]>(); */
    /*  */
    /* // input 1 */
    /* inputList.add(new int[]{1, 5, 3, 4, 3, 4, 1, 2, 3, 4, 6, 2}); */
    /*  */
    /* // input 2 */
    /* inputList.add(new int[]{0, 1, 0, 0, 1, 0, 0, 1, 0}); */
    /*  */
    /* Solution solution = new Solution(); */
  }
}
