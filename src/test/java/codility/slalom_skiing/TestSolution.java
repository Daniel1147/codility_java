package codility.slalom_skiing;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

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
  public void TestCompile() {
    assertTrue(getFailMsg(), true);
  }

  @Test
  public void TestCodility1() {
    A = new int[]{15, 13, 5, 7, 4, 10, 12, 8, 2, 11, 6, 9, 3};
    expected = 8;
    actual = s.solution(A);

    assertEquals(getFailMsg(), expected, actual);
  }

  private String getFailMsg() {
    return String.format("input: A => %s\n", Arrays.toString(A), expected);
  }
}
