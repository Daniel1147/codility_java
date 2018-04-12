package codility.longest_password;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import org.junit.Before;
import org.junit.Test;

public class TestSolution {
  String S;
  private int expected, actual;
  private Solution s;

  @Before
  public void setUp() {
    s = new Solution();
  }

  @Test
  public void test1() {
    S = "test1";
    expected = 5;
    actual = s.solution(S);
    assertEquals(getFailMsg(), expected, actual);
  }

  @Test
  public void test2() {
    S = "test02";
    expected = -1;
    actual = s.solution(S);
    assertEquals(getFailMsg(), expected, actual);
  }

  @Test
  public void test3() {
    S = "test 5 a0a pass007 ?xy1";
    expected = 7;
    actual = s.solution(S);
    assertEquals(getFailMsg(), expected, actual);
  }

  @Test
  public void testOddsLetter() {
    S = "test1a";
    expected = -1;
    actual = s.solution(S);
    assertEquals(getFailMsg(), expected, actual);
  }

  @Test
  public void testIllegalChar() {
    S = "test1*";
    expected = -1;
    actual = s.solution(S);
    assertEquals(getFailMsg(), expected, actual);
  }

  private String getFailMsg() {
    return String.format("input: %s\n", S);
  }
}
