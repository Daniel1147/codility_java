package leetcode.range_sum_of_BST;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import org.junit.Before;
import org.junit.Test;

public class TestSolution {
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

  private void myTest() {
    assertEquals(getFailMsg(), 0, 0);
  }

  private String getFailMsg() {
    return "";
  }
}
