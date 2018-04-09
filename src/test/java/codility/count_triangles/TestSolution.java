package codility.count_triangles;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import org.junit.Before;
import org.junit.Test;

public class TestSolution {
  private int expected, actual;
  private int[] A;
  private Solution s;

  @Before
  public void setUp() {
    s = new Solution();
  }

  @Test
  public void TestEmptyA() {
    A = new int[0];
    expected = 0;
    actual = s.solution(A);
    assertEquals(getFailMsg(), expected, actual);
  }

  @Test
  public void TestFewElements() {
    A = new int[] {0, 1};
    expected = 0;
    actual = s.solution(A);
    assertEquals(getFailMsg(), expected, actual);
  }

  @Test
  public void Test1() {
    A = new int[] {10, 2, 5, 1, 8, 12};
    expected = 4;
    actual = s.solution(A);
    assertEquals(getFailMsg(), expected, actual);
  }

  private String getFailMsg() {
    return String.format("input: %s\n", Arrays.toString(A));
  }
}
