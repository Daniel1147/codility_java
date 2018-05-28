package leetcode.shortest_unsorted_continuous_subarray;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import org.junit.Before;
import org.junit.Test;

public class TestSolution {
  private int expected, actual;
  private int[] nums;
  private Solution s;

  @Before
  public void setUp() {
    s = new Solution();
  }

  @Test
  public void testLeetcode() {
    nums = new int[] {2, 6, 4, 8, 10, 9, 15};
    expected = 5;

    myTest();
  }

  private void myTest() {
    actual = s.findUnsortedSubarray(nums);

    assertEquals(expected, actual);
  }
}
