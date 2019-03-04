package leetcode.string_to_integer;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import org.junit.Before;
import org.junit.Test;

public class TestSolution {
  private int expected, actual;
  private String str;
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
    str = "42";
    expected = 42;

    myTest();
  }

  @Test
  public void testLeetcode2() {
    str = "   -42";
    expected = -42;

    myTest();
  }

  @Test
  public void testLeetcode3() {
    str = "4193 with words";
    expected = 4193;

    myTest();
  }

  @Test
  public void testLeetcode4() {
    str = "words and 987";
    expected = 0;

    myTest();
  }

  @Test
  public void testLeetcode5() {
    str = "-91283472332";
    expected = -2147483648;

    myTest();
  }

  @Test
  public void test1() {
    str = "-2147483648";
    expected = -2147483648;

    myTest();
  }

  @Test
  public void test2() {
    str = "-2147483649";
    expected = -2147483648;

    myTest();
  }

  @Test
  public void test3() {
    str = "2147483647";
    expected = 2147483647;

    myTest();
  }

  @Test
  public void test4() {
    str = "2147483648";
    expected = 2147483647;

    myTest();
  }

  @Test
  public void testEmpty() {
    str = "";
    expected = 0;

    myTest();
  }

  private void myTest() {
    actual = s.myAtoi(str);
    assertEquals(getFailMsg(), expected, actual);
  }

  private String getFailMsg() {
    return str;
  }
}
