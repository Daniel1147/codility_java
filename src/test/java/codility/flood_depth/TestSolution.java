package codility.flood_depth;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import org.junit.Before;
import org.junit.Test;

public class TestSolution {
  private int[] A;
  private int expected, actual;
  private Solution s;

  @Before
  public void setUp() {
    s = new Solution();
  }

  @Test
  public void TestCompile() {
    A = new int[0];
    actual = s.solution(A);
    assertTrue(getFailMsg(), true);
  }

  @Test
  public void TestSingle() {
    A = new int[] {47};
    expected = 0;
    actual = s.solution(A);
    assertEquals(getFailMsg(), expected, actual);
  }

  @Test
  public void TestTwo1() {
    A = new int[] {47, 48};
    expected = 0;
    actual = s.solution(A);
    assertEquals(getFailMsg(), expected, actual);
  }

  @Test
  public void TestTwo2() {
    A = new int[] {49, 48};
    expected = 0;
    actual = s.solution(A);
    assertEquals(getFailMsg(), expected, actual);
  }

  @Test
  public void TestThree1() {
    A = new int[] {49, 48, 47};
    expected = 0;
    actual = s.solution(A);
    assertEquals(getFailMsg(), expected, actual);
  }

  @Test
  public void TestThree2() {
    A = new int[] {47, 48, 49};
    expected = 0;
    actual = s.solution(A);
    assertEquals(getFailMsg(), expected, actual);
  }

  @Test
  public void TestThree3() {
    A = new int[] {49, 48, 49};
    expected = 1;
    actual = s.solution(A);
    assertEquals(getFailMsg(), expected, actual);
  }

  @Test
  public void TestThree4() {
    A = new int[] {47, 48, 47};
    expected = 0;
    actual = s.solution(A);
    assertEquals(getFailMsg(), expected, actual);
  }

  @Test
  public void Test1() {
    A = new int[] {1, 3, 2, 1, 2, 1, 5, 3, 3, 4, 2};
    expected = 2;
    actual = s.solution(A);
    assertEquals(getFailMsg(), expected, actual);
  }

  private String getFailMsg() {
    return String.format("input: A %s\n", Arrays.toString(A));
  }
}
