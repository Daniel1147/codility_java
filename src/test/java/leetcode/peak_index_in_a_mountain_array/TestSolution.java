package leetcode.peak_index_in_a_mountain_array;

import static org.junit.Assert.*;

import java.util.Arrays;
import org.junit.Before;
import org.junit.Test;
import com.google.gson.Gson;

public class TestSolution {
  private int expected, actual;
  private int[] A;
  private Solution s;
  private Gson g = new Gson();

  @Before
  public void setUp() {
    s = new Solution();
  }

  @Test
  public void testCompile() {
    assertTrue(true);
  }

  @Test
  public void testLeetcode1() {
    A = new int[] {0, 1, 0};
    expected = 1;

    myTest();
  }

  private void myTest() {
    actual = s.peakIndexInMountainArray(A);

    assertEquals(getFailMsg(), expected, actual);
  }

  private String getFailMsg() {
    return g.toJson(A);
  }
}
