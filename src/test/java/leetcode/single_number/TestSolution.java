package leetcode.single_number;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import org.junit.Before;
import org.junit.Test;

public class TestSolution {
  private int[] nums;
  private int expected, actual;
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
  public void testLeetcode1() {
    nums = new int[] {2, 2, 1};
    expected = 1;
    myTest();
  }

  @Test
  public void testLeetcode2() {
    nums = new int[] {4, 1, 2, 1, 2};
    expected = 4;
    myTest();
  }

  private void myTest() {
    actual = s.singleNumber(nums);
    assertEquals(getFailMsg(), expected, actual);
  }

  private String getFailMsg() {
    return String.format("nums => %s\n", Arrays.toString(nums));
  }
}
