package codility.longest_substring_without_repeating_characters;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import org.junit.Before;
import org.junit.Test;

public class TestSolution {
  private String str;
  private int expected, actual;
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
  public void testLeetcode1() {
    str = "abcabcbb";
    expected = 3;
    myTest();
  }

  @Test
  public void testLeetcode2() {
    str = "bbbbb";
    expected = 1;
    myTest();
  }

  @Test
  public void testLeetcode3() {
    str = "pwwkew";
    expected = 3;
    myTest();
  }

  private void myTest() {
    actual = s.lengthOfLongestSubstring(str);
    assertEquals(getFailMsg(), expected, actual);
  }

  private String getFailMsg() {
    return String.format("s => %s\n", str);
  }
}
