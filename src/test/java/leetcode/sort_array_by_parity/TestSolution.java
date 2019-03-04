package leetcode.sort_array_by_parity;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import org.junit.Before;
import org.junit.Test;
import com.google.gson.Gson;

public class TestSolution {
  private int[] expected, actual;
  private int[] A;
  private Solution s;

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
    A = new int[] {3, 1, 2, 4};
    expected = new int[] {2, 4, 1, 3};

    myTest();
  }

  private void myTest() {
    actual = s.sortArrayByParity(A);

    assertArrayEquals(getFailMsg(), expected, actual);
  }

  private String getFailMsg() {
    Gson gson = new Gson();

    return gson.toJson(A);
  }
}
