package leetcode.move_zeroes;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import org.junit.Before;
import org.junit.Test;

public class TestSolution {
  private int[] expected, actual, nums;
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
  public void testLeetCode() {
    nums = new int[] {0, 1, 0, 3, 12};
    expected = new int[] {1, 3, 12, 0, 0};

    myTest();
  }

  private void myTest() {
    actual = nums.clone();
    s.moveZeroes(actual);
    assertArrayEquals(getFailMsg(), expected, actual);
  }

  private String getFailMsg() {
    return String.format(
        "nums => %s\nactual => %s\nexpect => %s",
        Arrays.toString(nums), Arrays.toString(actual), Arrays.toString(expected));
  }
}
