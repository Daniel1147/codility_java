package leetcode.subarray_sum_equals_k;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import org.junit.Before;
import org.junit.Test;

public class TestSolution {
  private int k, expected, actual;
  private int[] nums;
  private Solution s;

  @Before
  public void setUp() {
    s = new Solution();
  }

  @Test
  public void testLeetcode() {
    nums = new int[] {1, 1, 1};
    k = 2;
    expected = 2;

    myTest();
  }

  private void myTest() {
    actual = s.subarraySum(nums, k);

    assertEquals(expected, actual);
  }
}
