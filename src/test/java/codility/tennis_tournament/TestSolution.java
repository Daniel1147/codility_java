package codility.tennis_tournament;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import org.junit.Before;
import org.junit.Test;

public class TestSolution {
  private int expected, actual, P, C;
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
  public void TestCodility1() {
    P = 10;
    C = 3;
    expected = 3;
    myTest();
  }

  @Test
  public void TestCodility2() {
    P = 5;
    C = 3;
    expected = 2;
    myTest();
  }

  private void myTest() {
    actual = s.solution(P, C);
    assertEquals(getFailMsg(), expected, actual);
  }

  private String getFailMsg() {
    return "";
  }
}
