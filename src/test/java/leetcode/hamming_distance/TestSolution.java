package leetcode.hamming_distance;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import org.junit.Before;
import org.junit.Test;

public class TestSolution {
  private int expected, actual, x, y;
  private Solution s;

  @Before
  public void setUp() {
    s = new Solution();
  }

  @Test
  public void testLeetCode() {
    x = 1;
    y = 4;
    expected = 2;

    myTest();
  }

  private void myTest() {
    actual = s.hammingDistance(x, y);

    assertEquals(expected, actual);
  }
}
