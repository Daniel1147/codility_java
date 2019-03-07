package leetcode.all_possible_full_binary_trees;

import static org.junit.Assert.*;

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
    s.allPossibleFBT(7);
    assertTrue(true);
  }

  private void myTest() {
    assertEquals(getFailMsg(), 0, 0);
  }

  private String getFailMsg() {
    return "";
  }
}
