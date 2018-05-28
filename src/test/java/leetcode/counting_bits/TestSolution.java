package leetcode.counting_bits;

import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;
import org.junit.Before;
import org.junit.Test;

public class TestSolution {
  private Solution s;
  private int n;
  private int[] expect, actual;

  @Before
  public void setUp() {
    s = new Solution();
  }

  @Test
  public void testLeetcode() {
    n = 5;
    expect = new int[] {0, 1, 1, 2, 1, 2};
    actual = s.countBits(n);

    assertArrayEquals(expect, actual);
  }
}
