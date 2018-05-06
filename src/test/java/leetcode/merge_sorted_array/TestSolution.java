package leetcode.merge_sorted_array;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;
import org.junit.Before;
import org.junit.Test;

public class TestSolution {
  private int[] nums1, nums2;
  private int m, n;
  private int[] expected, actual;
  private Solution s;

  @Before
  public void setUp() {
    s = new Solution();
  }

  @Test
  public void TestCompile() {
    assertTrue(true);
  }

  private void myTest() {
    actual = s.merge(nums1, m, nums2, n);
    assertArrayEquals(getFailMsg(), expected, actual);
  }

  private String getFailMsg() {
    return String.format("input: nums1 => %s, m => %d, nums2 => %s, n => %d\n", Arrays.toString(nums1), m, Arrays.toString(nums2), n);
  }
}
