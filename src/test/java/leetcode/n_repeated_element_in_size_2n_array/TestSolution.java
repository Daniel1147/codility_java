package leetcode.n_repeated_element_in_size_2n_array;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import org.junit.Before;
import org.junit.Test;
import com.google.gson.Gson;

public class TestSolution {
  private int expected, actual;
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
    A = new int[] {1,2,3,3};
    expected = 3;
    myTest();
  }

  private void myTest() {
    actual = s.repeatedNTimes(A);
    assertEquals(getFailMsg(), actual, expected);
  }

  private String getFailMsg() {
    Gson gson = new Gson();

    return gson.toJson(A);
  }
}
