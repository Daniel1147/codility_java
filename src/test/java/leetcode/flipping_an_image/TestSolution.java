package leetcode.flipping_an_image;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import org.junit.Before;
import org.junit.Test;
import com.google.gson.Gson;

public class TestSolution {
  private int[][] expected, actual;
  private int[][] A;
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
    A = new int[][] {
      {1,1,0},
      {1,0,1},
      {0,0,0}
    };

    expected = new int[][] {
      {1,0,0},
      {0,1,0},
      {1,1,1}
    };

    myTest();
  }

  private void myTest() {
    actual = s.flipAndInvertImage(A);

    assertEquals(getFailMsg(), expected.length, actual.length);

    for (int i = 0; i < expected.length; i++) {
      assertArrayEquals(getFailMsg(), expected[i], actual[i]);
    }
  }

  private String getFailMsg() {
    Gson gson = new Gson();
    return gson.toJson(A) + "///" + gson.toJson(actual);
  }
}
