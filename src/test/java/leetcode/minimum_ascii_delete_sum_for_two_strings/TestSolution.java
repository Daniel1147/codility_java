package leetcode.minimum_ascii_delete_sum_for_two_strings;

import static org.junit.Assert.*;

import java.util.Arrays;
import org.junit.Before;
import org.junit.Test;
import com.google.gson.Gson;

public class TestSolution {
  private int expected, actual;
  private String s1, s2;
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
    s1 = "sea";
    s2 = "eat";
    expected = 231;

    myTest();
  }

  @Test
  public void testLeetcode2() {
    s1 = "delete";
    s2 = "leet";
    expected = 403;

    myTest();
  }

  private void myTest() {
    actual = s.minimumDeleteSum(s1, s2);

    assertEquals(getFailMsg(), expected, actual);
  }

  private String getFailMsg() {
    return String.format("s1: %s, s2: %s", s1, s2);
  }
}
