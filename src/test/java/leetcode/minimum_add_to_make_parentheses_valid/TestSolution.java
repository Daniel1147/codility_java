package leetcode.minimum_add_to_make_parentheses_valid;

import static org.junit.Assert.*;

import java.util.Arrays;
import org.junit.Before;
import org.junit.Test;

public class TestSolution {
  private int expected, actual;
  private String S;
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
  public void testLeetcode1() {
    S = "())";
    expected = 1;

    myTest();
  }

  @Test
  public void testLeetcode2() {
    S = "(((";
    expected = 3;

    myTest();
  }

  @Test
  public void testLeetcode3() {
    S = "()";
    expected = 0;

    myTest();
  }

  @Test
  public void testLeetcode4() {
    S = "()))((";
    expected = 4;

    myTest();
  }

  private void myTest() {
    actual = s.minAddToMakeValid(S);

    assertEquals(getFailMsg(), expected, actual);
  }

  private String getFailMsg() {
    return S;
  }
}
