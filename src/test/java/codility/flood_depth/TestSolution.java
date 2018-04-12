package codility.flood_depth;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

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
  public void TestCompile() {
    A = new int[0];
    actual = s.solution(A);
    assertTrue(getFailMsg(), true);
  }

  private String getFailMsg() {
    return String.format("input: A %s\n", Arrays.toString(A));
  }
}
