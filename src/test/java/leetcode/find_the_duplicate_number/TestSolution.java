package leetcode.find_the_duplicate_number;

import static org.junit.Assert.*;

import java.util.Arrays;
import org.junit.Before;
import org.junit.Test;
import com.google.gson.Gson;

public class TestSolution {
  private int expected, actual;
  private int[] nums;
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
    nums = new int[] {1, 3, 4, 2, 2};
    expected = 2;

    myTest();
  }

  @Test
  public void testLeetcode2() {
    nums = new int[] {3, 1, 3, 4, 2};
    expected = 3;

    myTest();
  }

  private void myTest() {
    actual = s.findDuplicate(nums);

    assertEquals(getFailMsg(), expected, actual);
  }

  private String getFailMsg() {
    return g.toJson(nums);
  }
}
