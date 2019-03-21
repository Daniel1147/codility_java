package leetcode.rotate_array;

import static org.junit.Assert.*;

import java.util.Arrays;
import org.junit.Before;
import org.junit.Test;
import com.google.gson.Gson;

public class TestSolution {
  private int[] nums, oriNums;
  private int k;

  private int[] expected, actual;
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
    nums = new int[]{1, 2, 3, 4, 5, 6, 7};
    k = 3;
    expected = new int[]{5, 6, 7, 1, 2, 3, 4};

    myTest();
  }

  @Test
  public void testLeetcode2() {
    nums = new int[]{-1, -100, 3, 99};
    k = 2;
    expected = new int[]{3, 99, -1, -99};

    myTest();
  }

  private void myTest() {
    oriNums = nums.clone();
    s.rotate(nums, k);
    actual = nums;

    assertArrayEquals(getFailMsg(), expected, actual);
  }

  private String getFailMsg() {
    return String.format("nums: %s, k: %s", g.toJson(oriNums), k);
  }
}
