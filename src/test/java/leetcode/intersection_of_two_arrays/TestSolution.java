package leetcode.intersection_of_two_arrays;

import static org.junit.Assert.*;

import java.util.Arrays;
import org.junit.Before;
import org.junit.Test;
import com.google.gson.Gson;

public class TestSolution {
  private int[] expected, actual;
  private int[] nums1, nums2;
  private Solution s;
  private Gson g = new Gson();

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
    nums1 = new int[] {1, 2, 2, 1};
    nums2 = new int[] {2, 2};
    expected = new int[] {2};

    myTest();
  }

  private void myTest() {
    actual = s.intersection(nums1, nums2);

    Arrays.sort(expected);
    Arrays.sort(actual);

    assertArrayEquals(getFailMsg(), expected, actual);
  }

  private String getFailMsg() {
    return String.format("nums1: %s, nums2: %s", g.toJson(nums1), g.toJson(nums2));
  }
}
