package leetcode.palindromic_substrings;

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
    s = "abc";
    expected = 3;

    myTest();
  }

  @Test
  public void testLeetcode2() {
    s = "aaa";
    expected = 6;

    myTest();
  }

  @Test
  public void testLeetcode3() {
    s = "dnncbwoneinoplypwgbwktmvkoimcooyiwirgbxlcttgteqthcvyoueyftiwgwwxvxvg";
    expected = 77;

    myTest();
  }

  private void myTest() {
    actual = solution.countSubstrings(s);
    assertEquals(getFailMsg(), expected, actual);
  }

  private String getFailMsg() {
    return s;
  }
}
