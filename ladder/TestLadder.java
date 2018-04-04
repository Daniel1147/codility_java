package codility.ladder;

import java.util.ArrayList;
import java.util.Arrays;

class TestCase {
  public int[] A;
  public int[] B;
  public int[] expected;

  public TestCase(int[] A, int[] B, int[] expected) {
    this.A = A;
    this.B = B;
    this.expected = expected;
  }

  public void test(int caseNum) {
    int[] ans;
    Solution s = new Solution();

    System.out.printf("start test %d ====\n", caseNum);

    // get ans
    ans = s.solution(A, B);
    if (passTest(ans)) {
      System.out.printf("PASS test %d!\n", caseNum);

      return;
    }

    System.out.printf("failed at test %d.\n", caseNum);
    // print test case
    System.out.printf("input:\n\tA: %s\n\tB: %s\n", Arrays.toString(A), Arrays.toString(B));
    System.out.printf("expected:\t%s\n", Arrays.toString(expected));

    // print ans
    System.out.printf("got:\t\t%s\n", Arrays.toString(ans));

    return;
  }

  private boolean passTest(int[] ans) {
    if (Arrays.equals(ans, expected)) {
      return true;
    }

    return false;
  }
}

class TestLadder {
  public static void main(String[] args) {
    ArrayList<TestCase> inputList = new ArrayList<TestCase>();
    int[] A, B, expected, ans;

    // input 1
    A = new int[] {4, 4, 5, 5, 1};
    B = new int[] {3, 2, 4, 3, 1};
    expected = new int[] {5, 1, 8, 0, 1};
    inputList.add(new TestCase(A, B, expected));

    for (int i = 0; i < inputList.size(); i++) {
      TestCase input = inputList.get(i);

      input.test(i + 1);
    }
  }
}
