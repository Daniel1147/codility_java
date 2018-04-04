package codility.min_max_division;

import java.util.ArrayList;
import java.util.Arrays;

class TestCase {
  public int K;
  public int M;
  public int[] A;
  public int expected;

  public TestCase(int K, int M, int[] A, int expected) {
    this.K = K;
    this.M = M;
    this.A = A;
    this.expected = expected;
  }

  public void test(int caseNum) {
    int ans;
    Solution s = new Solution();

    System.out.printf("start test %d ====\n", caseNum);

    // get ans
    ans = s.solution(K, M, A);
    if (passTest(ans)) {
      System.out.printf("PASS test %d!\n", caseNum);

      return;
    }

    System.out.printf("failed at test %d.\n", caseNum);
    // print test case
    System.out.printf("input:\tK = %d, M = %d,\n\tA = %s\n", K, M, Arrays.toString(A));
    System.out.printf("expected:\t%d\n", expected);

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

class TestMinMaxDivision {
  public static void main(String[] args) {
    ArrayList<TestCase> inputList = new ArrayList<TestCase>();
    int expected, ans;
    int K, M;
    int[] A;

    // input 1
    K = 3;
    M = 5;
    A = new int[] {2, 1, 5, 1, 2, 2, 2};
    expected = 6;
    inputList.add(new TestCase(K, M, A, expected));

    // input 2
    K = 3;
    M = 5;
    A = new int[] {2, 1, 5, 1, 2, 2, 3};
    expected = 7;
    inputList.add(new TestCase(K, M, A, expected));

    // input 3
    K = 3;
    M = 5;
    A = new int[] {0, 0, 0, 0, 0, 0};
    expected = 0;
    inputList.add(new TestCase(K, M, A, expected));

    // input 4
    K = 3;
    M = 5;
    A = new int[] {1, 0, 0, 0, 0, 0};
    expected = 1;
    inputList.add(new TestCase(K, M, A, expected));

    // input 5
    K = 3;
    M = 5;
    A = new int[] {3, 3, 3, 3, 3, 3, 3, 3, 3};
    expected = 9;
    inputList.add(new TestCase(K, M, A, expected));

    // input 6
    K = 3;
    M = 3;
    A = new int[] {3, 3, 3, 3, 3, 3, 3, 3, 3};
    expected = 9;
    inputList.add(new TestCase(K, M, A, expected));

    // input 7
    K = 3;
    M = 3;
    A = new int[] {3, 3, 3, 0};
    expected = 3;
    inputList.add(new TestCase(K, M, A, expected));

    for (int i = 0; i < inputList.size(); i++) {
      TestCase input = inputList.get(i);

      input.test(i + 1);
    }
  }
}
