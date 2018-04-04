package codility.nailing_planks;

import java.util.ArrayList;
import java.util.Arrays;

class TestCase {
  public int[] A;
  public int[] B;
  public int[] C;
  public int expected;

  public TestCase(int[] A, int[] B, int[] C, int expected) {
    this.A = A;
    this.B = B;
    this.C = C;
    this.expected = expected;
  }

  public void test(int caseNum) {
    int ans;
    Solution s = new Solution();

    System.out.printf("start test %d ====\n", caseNum);

    // get ans
    ans = s.solution(A, B, C);
    if (passTest(ans)) {
      System.out.printf("PASS test %d!\n", caseNum);

      return;
    }

    System.out.printf("failed at test %d.\n", caseNum);
    // print test case
    System.out.printf("input:\n\tA: %s\n\tB: %s\n\tC: %s\n", Arrays.toString(A), Arrays.toString(B),
        Arrays.toString(C));
    System.out.printf("expected:\t%s\n", expected);

    // print ans
    System.out.printf("got:\t\t%d\n", ans);

    return;
  }

  private boolean passTest(int ans) {
    if (ans == expected) {
      return true;
    }

    return false;
  }
}

class TestNailingPlanks {
  public static void main(String[] args) {
    ArrayList<TestCase> inputList = new ArrayList<TestCase>();
    int[] A, B, C;
    int expected, ans;

    // input 1
    A = new int[] {1, 4, 5, 8};
    B = new int[] {4, 5, 9, 10};
    C = new int[] {4, 6, 7, 10, 2};
    expected = 4;
    inputList.add(new TestCase(A, B, C, expected));

    for (int i = 0; i < inputList.size(); i++) {
      TestCase input = inputList.get(i);

      input.test(i + 1);
    }
  }
}
