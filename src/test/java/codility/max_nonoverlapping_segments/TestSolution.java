package codility.max_nonoverlapping_segments;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import org.junit.Before;
import org.junit.Test;

public class TestSolution {
  private int[] A, B;
  private int expected, actual;
  private Solution s;

  @Before
  public void setUp() {
    s = new Solution();
  }

  @Test
  public void TetsEmpty() {
    A = new int[0];
    B = new int[0];
    expected = 0;
    actual = s.solution(A, B);
    assertEquals(getFailMsg(), expected, actual);
  }

  @Test
  public void Tets1() {
    A = new int[] {1, 3, 7, 9, 9};
    B = new int[] {5, 6, 8, 9, 10};
    expected = 3;
    actual = s.solution(A, B);
    assertEquals(getFailMsg(), expected, actual);
  }

  @Test
  public void TetsOneElement() {
    A = new int[] {1};
    B = new int[] {5};
    expected = 1;
    actual = s.solution(A, B);
    assertEquals(getFailMsg(), expected, actual);
  }

  private String getFailMsg() {
    return String.format("input: A %s, B %s\n", Arrays.toString(A), Arrays.toString(B));
  }
}
