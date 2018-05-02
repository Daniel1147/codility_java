package leetcode.longest_increasing_subsequence;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class TestSolution {
  private int expected, actual;
  private int[] input;
  private Solution2 s;

  @Before
  public void setUp() {
    s = new Solution2();
  }

  @Test
  public void TestCompile() {
    input = new int[0];
    actual = s.lengthOfLIS(input);
    assertTrue(getFailMsg(), true);
  }

  @Test
  public void TestEmpty() {
    input = new int[] {};
    expected = 0;
    actual = s.lengthOfLIS(input);

    assertEquals(getFailMsg(), expected, actual);
  }

  @Test
  public void TestSingle() {
    input = new int[] {1};
    expected = 1;
    actual = s.lengthOfLIS(input);

    assertEquals(getFailMsg(), expected, actual);
  }

  @Test
  public void TestAllIncrease() {
    input = new int[] {1, 2, 3, 4, 5, 6};
    expected = 6;
    actual = s.lengthOfLIS(input);

    assertEquals(getFailMsg(), expected, actual);
  }

  @Test
  public void TestAllDecrease() {
    input = new int[] {6, 5, 4, 3, 2, 1};
    expected = 1;
    actual = s.lengthOfLIS(input);

    assertEquals(getFailMsg(), expected, actual);
  }

  @Test
  public void TestLeetCode1() {
    input = new int[] {10, 9, 2, 5, 3, 7, 101, 18};
    expected = 4;
    actual = s.lengthOfLIS(input);

    assertEquals(getFailMsg(), expected, actual);
  }

  private String getFailMsg() {
    return "";
  }
}
