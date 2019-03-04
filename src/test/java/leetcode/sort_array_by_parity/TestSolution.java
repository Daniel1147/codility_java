package leetcode.sort_array_by_parity;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;
import org.junit.Before;
import org.junit.Test;
import com.google.gson.Gson;

public class TestSolution {
  private int[] actual;
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

    myTest();
  }

  private void myTest() {
    int evenCount;
    actual = s.sortArrayByParity(A);

    if (A.length != actual.length) {
      assertTrue(getFailMsg(), false);
      return;
    }

    evenCount = 0;
    for (int i = 0; i < A.length; i++) {
      if (A[i] % 2 == 0)
        evenCount++;
    }

    for (int i = 0; i < evenCount; i++) {
      if (actual[i] % 2 == 1) {
        assertTrue(getFailMsg(), false);
        return;
      }
    }

    for (int i = A.length - 1; i >= evenCount; i--) {
      if (actual[i] % 2 == 0) {
        assertTrue(getFailMsg(), false);
        return;
      }
    }

    Arrays.sort(A);
    Arrays.sort(actual);
    assertArrayEquals(getFailMsg(), A, actual);
  }

  private String getFailMsg() {
    Gson gson = new Gson();

    return gson.toJson(A);
  }
}
