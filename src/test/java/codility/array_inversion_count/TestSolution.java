package codility.array_inversion_count;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import org.junit.Before;
import org.junit.Test;

public class TestSolution {
  private int expected, actual;
  private Solution s;
  private int A[];

  @Before
  public void setUp() {
    s = new Solution();
  }

  @Test
  public void TestCompile() {
    assertTrue(true);
  }

  private void myTest() {
    actual = s.solution(A);
    assertEquals(getFailMsg(), expected, actual);
  }

  private String getFailMsg() {
    return String.format("A => %s\n", Arrays.toString(A));
  }
}
