package codility.str_symmetry_point;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import org.junit.Before;
import org.junit.Test;

public class TestSolution {
  private String S;
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
  public void Test1() {
    S = "aba";
    expected = 1;
    myTest();
  }

  @Test
  public void Test2() {
    S = "abb";
    expected = -1;
    myTest();
  }

  @Test
  public void TestCodility1() {
    S = "racecar";
    expected = 3;
    myTest();
  }

  @Test
  public void TestCodility2() {
    S = "x";
    expected = 0;
    myTest();
  }

  private void myTest() {
    actual = s.solution(S);
    assertEquals(getFailMsg(), expected, actual);
  }

  private String getFailMsg() {
    return String.format("S => %s", S);
  }
}
