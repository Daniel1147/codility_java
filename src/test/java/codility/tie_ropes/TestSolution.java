package codility.tie_ropes;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import org.junit.Before;
import org.junit.Test;

public class TestSolution {
  private int[] A;
  private int K;
  private int expected, actual;
  private Solution s;

  @Before
  public void setUp() {
    s = new Solution();
  }

  @Test
  public void TestSingleNon() {
    A = new int[] {4};
    K = 5;
    expected = 0;
    actual = s.solution(K, A);
    assertEquals(getFailMsg(), expected, actual);
  }

  @Test
  public void TestSingle() {
    A = new int[] {4};
    K = 4;
    expected = 1;
    actual = s.solution(K, A);
    assertEquals(getFailMsg(), expected, actual);
  }

  @Test
  public void TestTemplate() {
    A = new int[] {1, 2, 3, 4, 1, 1, 3};
    K = 4;
    expected = 3;
    actual = s.solution(K, A);
    assertEquals(getFailMsg(), expected, actual);
  }

  private String getFailMsg() {
    return String.format("input: A %s\n", Arrays.toString(A));
  }
}
