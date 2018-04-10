package codility.min_abs_sum;

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
  public void TestEmpty() {
    A = new int[] {};
    expected = 0;
    actual = s.solution(A);
    assertEquals(getFailMsg(), expected, actual);
  }

  @Test
  public void TestSingle() {
    A = new int[] {1};
    expected = 1;
    actual = s.solution(A);
    assertEquals(getFailMsg(), expected, actual);
  }

  @Test
  public void Test1() {
    A = new int[] {1, 5, 2, -2};
    expected = 0;
    actual = s.solution(A);
    assertEquals(getFailMsg(), expected, actual);
  }

  @Test
  public void Test2() {
    A = new int[] {55, 46, 100};
    expected = 1;
    actual = s.solution(A);
    assertEquals(getFailMsg(), expected, actual);
  }

  @Test
  public void Test3() {
    A = new int[] {-100, -100, -1};
    expected = 1;
    actual = s.solution(A);
    assertEquals(getFailMsg(), expected, actual);
  }

  @Test
  public void Test200() {
    int max = 200;
    A = new int[max];
    for (int i = 0; i < max; i++) {
      A[i] = 100;
    }
    expected = 0;
    actual = s.solution(A);
    assertEquals(getFailMsg(), expected, actual);
  }

  @Test
  public void Test101() {
    int max = 101;
    A = new int[max];
    for (int i = 0; i < max; i++) {
      A[i] = 100;
    }
    expected = 100;
    actual = s.solution(A);
    assertEquals(getFailMsg(), expected, actual);
  }

  private String getFailMsg() {
    return String.format("input: A %s\n", Arrays.toString(A));
  }
}
