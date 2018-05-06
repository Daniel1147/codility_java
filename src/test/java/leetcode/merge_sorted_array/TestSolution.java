package leetcode.merge_sorted_array;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import org.junit.Before;
import org.junit.Test;

public class TestSolution {
  private int[] nums1, nums2;
  private int m, n;
  private int[] expected;
  private Solution s;

  @Before
  public void setUp() {
    s = new Solution();
  }

  @Test
  public void TestCompile() {
    assertTrue(true);
  }

  @Test
  public void TestLeetCode1() {
    nums1 = new int[] {1, 2, 3, 0, 0, 0};
    m = 3;
    nums2 = new int[] {2, 5, 6};
    n = 3;
    expected = new int[] {1, 2, 2, 3, 5, 6};
    myTest();
  }

  private void myTest() {
    s.merge(nums1, m, nums2, n);
    assertArrayEquals(getFailMsg(), expected, nums1);
  }

  private String getFailMsg() {
    return String.format(
        "input: nums1 => %s, m => %d, nums2 => %s, n => %d\nexpect => %s, actual => %s\n",
        Arrays.toString(nums1),
        m,
        Arrays.toString(nums2),
        n,
        Arrays.toString(expected),
        Arrays.toString(nums1));
  }
}
