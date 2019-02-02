package leetcode.squares_of_a_sorted_array;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import org.junit.Before;
import org.junit.Test;

public class TestSolution {
  private int[] expected, actual, input;
  private Solution s;

  @Before
  public void setUp() {
    s = new Solution();
  }

  @Test
  public void testCompile() {
    assertTrue(true);
  }

  @Test
  public void testLeetCode1() {
    input = new int[] {-4, -1, 0, 3, 10};
    expected = new int[] {0, 1, 9, 16, 100};
    myTest();
  }

  @Test
  public void testLeetCode2() {
    input = new int[] {-7, -3, 2, 3, 11};
    expected = new int[] {4, 9, 9, 49, 121};
    myTest();
  }

  private void myTest() {
    actual = s.sortedSquares(input);
    assertArrayEquals(getFailMsg(), expected, actual);
  }

  private String getFailMsg() {
    return "";
  }
}
