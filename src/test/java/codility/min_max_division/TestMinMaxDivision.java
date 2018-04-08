package codility.min_max_division;

import java.util.ArrayList;
import java.util.Arrays;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

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

  public String failMsg() {
    String msg;
    msg = "\nfailed at input:\n"
      + String.format("\tK:\t%d\n", K)
      + String.format("\tM:\t%d\n", M)
      + String.format("\tA:\t%s\n", Arrays.toString(A));
    return msg;
  }
}

public class TestMinMaxDivision {
  @Test
  public void TestSolution() {
    ArrayList<TestCase> inputList = new ArrayList<TestCase>();
    int expected;
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
      Solution s = new Solution();
      TestCase input = inputList.get(i);
      K = input.K;
      M = input.M;
      A = input.A;
      expected = input.expected;

      int actual = s.solution(K, M, A);

      assertEquals(input.failMsg(), expected, actual);
    }
  }
}
