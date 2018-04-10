package codility.number_solitaire;

import static org.junit.Assert.assertEquals;

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
  public void Test1() {
    A = new int[] {1, -2, 0, 9, -1, -2};
    expected = 8;
    actual = s.solution(A);
    assertEquals(getFailMsg(), expected, actual);
  }

  @Test
  public void Test2() {
    A = new int[] {1, 2};
    expected = 3;
    actual = s.solution(A);
    assertEquals(getFailMsg(), expected, actual);
  }

  @Test
  public void Test3() {
    A = new int[] {-1, -2};
    expected = -3;
    actual = s.solution(A);
    assertEquals(getFailMsg(), expected, actual);
  }

  private String getFailMsg() {
    return String.format("input: A %s\n", Arrays.toString(A));
  }
}
