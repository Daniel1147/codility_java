package codility.min_abs_sum_of_two;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import org.junit.Before;
import org.junit.Test;

public class TestSolution {
  private int[] A;
  private int expected, actual;
  private Solution s;

  @Before
  public void setUp() {
    s = new Solution();
  }

  @Test
  public void TestPosOnly() {
    A = new int[] {2, 1, 3};
    expected = 2;
    actual = s.solution(A);
    assertEquals(getFailMsg(), expected, actual);
  }

  @Test
  public void TestNegOnly() {
    A = new int[] {-2, -1, -3};
    expected = 2;
    actual = s.solution(A);
    assertEquals(getFailMsg(), expected, actual);
  }

  @Test
  public void Test1() {
    A = new int[] {1, 4, -3};
    expected = 1;
    actual = s.solution(A);
    assertEquals(getFailMsg(), expected, actual);
  }

  @Test
  public void Test2() {
    A = new int[] {-8, 4, 5, -10, 3};
    expected = 3;
    actual = s.solution(A);
    assertEquals(getFailMsg(), expected, actual);
  }

  @Test
  public void Test3() {
    A = new int[] {21, 22, 23, -14, -15, -16, 1000, -1000};
    expected = 0;
    actual = s.solution(A);
    assertEquals(getFailMsg(), expected, actual);
  }

  private String getFailMsg() {
    return String.format("input: %s\n", Arrays.toString(A));
  }
}
