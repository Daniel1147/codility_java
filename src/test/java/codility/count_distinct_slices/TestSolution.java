package codility.count_distinct_slices;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import org.junit.Before;
import org.junit.Test;

public class TestSolution {
  private int M;
  private int[] A;
  private Solution s;
  private int expected, actual;

  @Before
  public void setUp() {
    s = new Solution();
  }

  @Test
  public void Test1() {
    M = 6;
    A = new int[] {3, 4, 5, 5, 2};
    expected = 9;
    actual = s.solution(M, A);
    assertEquals(getFailMsg(), expected, actual);
  }

  private String getFailMsg() {
    return String.format("failed at input: M %d, A %s\n", M, Arrays.toString(A));
  }
}
