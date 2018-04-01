package codility.chocolates_by_numbers;

import java.util.ArrayList;
import java.util.Arrays;

class TestCase {
  public int N;
  public int M;
  public int expected;

  public TestCase(int N, int M, int expected) {
    this.N = N;
    this.M = M;
    this.expected = expected;
  }
}

class TestChocolatesByNumbers {
  public static void main(String[] args) {
    ArrayList<TestCase> inputList = new ArrayList<TestCase>();
    int N, M, expected, ans;

    // input 1
    N = 10;
    M = 4;
    expected = 5;
    inputList.add(new TestCase(N, M, expected));

    Solution s = new Solution();
    for (TestCase input : inputList) {
      N = input.N;
      M = input.M;
      ans = s.solution(N, M);
      expected = input.expected;

      System.out.printf("input:\n\tN:\t%d\n\tM:\t%d\n", N, M);
      System.out.printf("expected:\t%d\n", expected);
      System.out.printf("got:\t%d\n", ans);
    }
  }
}
