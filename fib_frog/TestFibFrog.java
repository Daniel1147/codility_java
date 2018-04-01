package codility.fib_frog;

import java.util.ArrayList;
import java.util.Arrays;

class TestCase {
  public int[] A;
  public int expected;

  public TestCase(int[] A, int expected) {
    this.A = A;
    this.expected = expected;
  }
}

class TestFibFrog {
  public static void main(String[] args) {
    ArrayList<TestCase> inputList = new ArrayList<TestCase>();
    int expected, ans;
    int[] A;

    // input 1
    A = new int[]{0, 0, 0, 1, 1, 0, 1, 0, 0, 0, 0};
    expected = 3;
    inputList.add(new TestCase(A, expected));

    // input 2
    A = new int[]{0, 0, 0, 0};
    expected = 1;
    inputList.add(new TestCase(A, expected));

    // input 3
    A = new int[]{1, 1, 1, 1};
    expected = 1;
    inputList.add(new TestCase(A, expected));

    // input 4
    A = new int[]{1, 1, 0, 0, 0};
    expected = 2;
    inputList.add(new TestCase(A, expected));

    // input 5
    A = new int[]{1, 0, 1, 0, 0, 1, 0, 0};
    expected = 2;
    inputList.add(new TestCase(A, expected));

    // input 6
    A = new int[]{};
    expected = 1;
    inputList.add(new TestCase(A, expected));

    // input 7
    A = new int[]{0};
    expected = 1;
    inputList.add(new TestCase(A, expected));

    Solution s = new Solution();
    for (TestCase input : inputList) {
      System.out.printf("\n====\n", Arrays.toString(A));
      A = input.A;
      expected = input.expected;
      ans = s.solution(A);

      System.out.printf("input:\n\tA:\t%s\n", Arrays.toString(A));
      System.out.printf("expected:\t%d\n", expected);
      System.out.printf("got:\t\t%d\n", ans);
    }
  }
}
