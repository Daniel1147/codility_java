package codility.min_max_division;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import org.junit.Before;
import org.junit.Test;

public class TestMinMaxDivision {
  private int K, M;
  private int[] A;
  private int expected;
  private int actual;
  private Solution s;

  @Before
  public void setUp() {
    s = new Solution();
  }

  @Test
  public void Test1() {
    K = 3;
    M = 5;
    A = new int[] {2, 1, 5, 1, 2, 2, 2};
    expected = 6;
    actual = s.solution(K, M, A);
    assertEquals(getFailMsg(), expected, actual);
  }

  @Test
  public void Test2() {
    K = 3;
    M = 5;
    A = new int[] {2, 1, 5, 1, 2, 2, 3};
    expected = 7;
    actual = s.solution(K, M, A);
    assertEquals(getFailMsg(), expected, actual);
  }

  @Test
  public void Test3() {
    K = 3;
    M = 5;
    A = new int[] {0, 0, 0, 0, 0, 0};
    expected = 0;
    actual = s.solution(K, M, A);
    assertEquals(getFailMsg(), expected, actual);
  }

  @Test
  public void Test4() {
    K = 3;
    M = 5;
    A = new int[] {1, 0, 0, 0, 0, 0};
    expected = 1;
    actual = s.solution(K, M, A);
    assertEquals(getFailMsg(), expected, actual);
  }

  @Test
  public void Test5() {
    K = 3;
    M = 5;
    A = new int[] {3, 3, 3, 3, 3, 3, 3, 3, 3};
    expected = 9;
    actual = s.solution(K, M, A);
    assertEquals(getFailMsg(), expected, actual);
  }

  @Test
  public void Test6() {
    K = 3;
    M = 3;
    A = new int[] {3, 3, 3, 3, 3, 3, 3, 3, 3};
    expected = 9;
    actual = s.solution(K, M, A);
    assertEquals(getFailMsg(), expected, actual);
  }

  @Test
  public void Test7() {
    K = 3;
    M = 3;
    A = new int[] {3, 3, 3, 0};
    expected = 3;
    actual = s.solution(K, M, A);
    assertEquals(getFailMsg(), expected, actual);
  }

  private String getFailMsg() {
    String msg;
    msg =
        "\nfailed at input:\n"
            + String.format("\tK:\t%d\n", K)
            + String.format("\tM:\t%d\n", M)
            + String.format("\tA:\t%s\n", Arrays.toString(A));
    return msg;
  }
}
