package leetcode.longest_palindromic_substring;

import static org.junit.Assert.*;

import java.util.Arrays;
import org.junit.Before;
import org.junit.Test;
import com.google.gson.Gson;

public class TestSolution {
  private String s;
  private String expected, actual;
  private Solution solution;
  private Gson g = new Gson();

  @Before
  public void setUp() {
    solution = new Solution();
  }

  @Test
  public void testCompile() {
    assertTrue(true);
  }

  @Test
  public void testLeetcode1() {
    s = "babad";
    expected = "bab";

    myTest();
  }

  @Test
  public void testLeetcode2() {
    s = "cbbd";
    expected = "bb";

    myTest();
  }

  private void myTest() {
    actual = solution.longestPalindrome(s);
    assertEquals(getFailMsg(), expected, actual);
  }

  private String getFailMsg() {
    return s;
  }
}
