package leetcode._3sum_closest;

import static org.junit.Assert.*;

import java.util.Arrays;
import org.junit.Before;
import org.junit.Test;
import com.google.gson.Gson;

public class TestSolution {
  private int[] nums;
  private int target;

  private int expected, actual;
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
    nums = new int[] {-1, 2, 1, -4};
    target = 1;
    expected = 2;

    myTest();
  }

  private void myTest() {
    actual = s.threeSumClosest(nums, target);

    assertEquals(getFailMsg(), expected, actual);
  }

  private String getFailMsg() {
    return String.format("nums: %s, target: %d", g.toJson(nums), target);
  }
}
