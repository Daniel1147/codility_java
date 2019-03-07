package leetcode.score_after_flipping_matrix;

import static org.junit.Assert.*;

import java.util.Arrays;
import org.junit.Before;
import org.junit.Test;
import com.google.gson.Gson;

public class TestSolution {
  private int expected, actual;
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
    A = new int[][] {{0,0,1,1},{1,0,1,0},{1,1,0,0}};
    expected = 39;

    myTest();
  }

  private void myTest() {
    actual = s.matrixScore(A);

    assertEquals(getFailMsg(), expected, actual);
  }

  private String getFailMsg() {
    Gson g = new Gson();

    return g.toJson(A);
  }
}
