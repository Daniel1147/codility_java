package leetcode.longest_palindromic_subsequence;

import static org.junit.Assert.*;

import java.util.Arrays;
import org.junit.Before;
import org.junit.Test;
import com.google.gson.Gson;

public class TestSolution {
  private int expected, actual;
  private String s;
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
    s = "bbbab";
    expected = 4;

    myTest();
  }

  @Test
  public void testLeetcode2() {
    s = "cbbd";
    expected = 2;

    myTest();
  }

  private void myTest() {
    actual = solution.longestPalindromeSubseq(s);
    assertEquals(getFailMsg(), expected, actual);
  }

  private String getFailMsg() {
    return s;
  }
}
