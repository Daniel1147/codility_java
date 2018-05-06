package codility.array_inversion_count;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import org.junit.Before;
import org.junit.Test;

public class TestSolution {
  private int expected, actual;
  private Solution s;
  private int A[];

  @Before
  public void setUp() {
    s = new Solution();
  }

  @Test
  public void TestCompile() {
    assertTrue(true);
  }

  @Test
  public void TestEmpty() {
    A = new int[0];
    expected = 0;
    myTest();
  }

  @Test
  public void Test1() {
    A = new int[] {1, 2, 3};
    expected = 0;
    myTest();
  }

  @Test
  public void Test2() {
    A = new int[] {3, 2, 1};
    expected = 3;
    myTest();
  }

  private void myTest() {
    actual = s.solution(A);
    assertEquals(getFailMsg(), expected, actual);
  }

  private String getFailMsg() {
    return String.format("A => %s\n", Arrays.toString(A));
  }
}
