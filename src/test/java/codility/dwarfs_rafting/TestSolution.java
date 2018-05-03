package codility.dwarfs_rafting;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import org.junit.Before;
import org.junit.Test;

public class TestSolution {
  private int N;
  private String S, T;
  private int expected, actual;
  private Solution s;

  @Before
  public void setUp() {
    s = new Solution();
  }

  @Test
  public void TestCompile() {
    assertTrue(getFailMsg(), true);
  }

  @Test
  public void TestCodility1() {
    N = 4;
    S = "1B 1C 4B 1D 2A";
    T = "3B 2D";
    expected = 6;
    assertion();
  }

  @Test
  public void TestCodility2() {
    N = 2;
    S = "";
    T = "";
    expected = 4;
    assertion();
  }

  @Test
  public void TestCodility3() {
    N = 4;
    S = "1B 2A 4B";
    T = "";
    expected = 10;
    assertion();
  }

  private void assertion() {
    actual = s.solution(N, S, T);
    assertEquals(getFailMsg(), expected, actual);
  }

  private String getFailMsg() {
    return String.format("input: N => %d, S => %s, T => %s\n", N, S, T);
  }
}
