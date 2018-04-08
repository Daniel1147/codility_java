package codility.abs_distinct;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.Before;
import java.util.Arrays;

public class TestSolution {
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
    A = new int[] {-5, -3, -1, 0, 3, 6};
    expected = 5;

    actual = s.solution(A);
    assertEquals(errorMsg(), expected, actual);
  }

  @Test
  public void TestPosOnly() {
    A = new int[] {1, 2, 2};
    expected = 2;

    actual = s.solution(A);
    assertEquals(errorMsg(), expected, actual);
  }

  @Test
  public void TestNegOnly() {
    A = new int[] {-2, -2, -1};
    expected = 2;

    actual = s.solution(A);
    assertEquals(errorMsg(), expected, actual);
  }

  @Test
  public void TestNoZero() {
    A = new int[] {-2, -1, 3, 4};
    expected = 4;

    actual = s.solution(A);
    assertEquals(errorMsg(), expected, actual);
  }

  @Test
  public void TestWithZero() {
    A = new int[] {-2, -1, 0, 3, 4};
    expected = 5;

    actual = s.solution(A);
    assertEquals(errorMsg(), expected, actual);
  }

  @Test
  public void TestAllZero() {
    A = new int[] {0, 0, 0};
    expected = 1;

    actual = s.solution(A);
    assertEquals(errorMsg(), expected, actual);
  }

  @Test
  public void TestOverflow() {
    A = new int[] {1 << 31, 1 << 31};
    expected = 1;

    actual = s.solution(A);
    assertEquals(errorMsg(), expected, actual);
  }

  private String errorMsg() {
    return String.format("failed at input A: %s\n", Arrays.toString(A));
  }
}
