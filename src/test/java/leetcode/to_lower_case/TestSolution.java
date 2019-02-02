package leetcode.to_lower_case;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class TestSolution {
  private String expected, actual, input;
  private Solution s;

  @Before
  public void setUp() {
    s = new Solution();
  }

  @Test
  public void testCompile() {
    assertTrue(true);
  }

  @Test
  public void testLeetCode1() {
    input = "Hello";
    expected = "hello";
    myTest();
  }

  @Test
  public void testLeetCode2() {
    input = "here";
    expected = "here";
    myTest();
  }

  @Test
  public void testLeetCode3() {
    input = "LOVELY";
    expected = "lovely";
    myTest();
  }

  private void myTest() {
    actual = s.toLowerCase(input);
    assertEquals(getFailMsg(), expected, actual);
  }

  private String getFailMsg() {
    return "";
  }
}
