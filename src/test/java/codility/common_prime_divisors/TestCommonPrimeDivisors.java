package codility.common_prime_divisors;

import java.util.ArrayList;
import java.util.Arrays;

class TestCase {
  public int[] A;
  public int[] B;
  public int expected;

  public TestCase(int[] A, int[] B, int expected) {
    this.A = A;
    this.B = B;
    this.expected = expected;
  }
}

class TestCommonPrimeDivisors {
  public static void main(String[] args) {
    ArrayList<TestCase> inputList = new ArrayList<TestCase>();
    int expected, ans;
    int[] A, B;

    // input 1
    A = new int[]{15, 10, 3};
    B = new int[]{75, 30, 5};
    expected = 1;
    inputList.add(new TestCase(A, B, expected));

    Solution s = new Solution();
    for (TestCase input : inputList) {
      A = input.A;
      B = input.B;
      expected = input.expected;
      ans = s.solution(A, B);

      System.out.printf("input:\n\tA:\t%s\n\tB:\t%s\n", Arrays.toString(A), Arrays.toString(B));
      System.out.printf("expected:\t%d\n", expected);
      System.out.printf("got:\t%d\n", ans);
    }
  }
}
