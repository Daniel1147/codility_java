package leetcode.longest_increasing_subsequence;

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
  public void TestCompile() {
    actual = s.solution();
    assertTrue(getFailMsg(), true);
  }

  private String getFailMsg() {
    return "";
  }
}
