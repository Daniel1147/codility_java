package leetcode.spiral_matrix_iii;

import static org.junit.Assert.*;

import java.util.Arrays;
import org.junit.Before;
import org.junit.Test;
import com.google.gson.Gson;

public class TestSolution {
  private int[][] expected, actual;
  private Solution s;
  private Gson g = new Gson();
  private int R, C, r0, c0;

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
    R = 1;
    C = 4;
    r0 = 0;
    c0 = 0;
    expected = new int[][] {{0,0},{0,1},{0,2},{0,3}};

    myTest();
  }

  @Test
  public void testLeetcode2() {
    R = 5;
    C = 6;
    r0 = 1;
    c0 = 4;
    expected = new int[][] {{1,4},{1,5},{2,5},{2,4},{2,3},{1,3},{0,3},{0,4},{0,5},{3,5},{3,4},{3,3},{3,2},{2,2},{1,2},{0,2},{4,5},{4,4},{4,3},{4,2},{4,1},{3,1},{2,1},{1,1},{0,1},{4,0},{3,0},{2,0},{1,0},{0,0}};

    myTest();
  }

  private void myTest() {
    actual = s.spiralMatrixIII(R, C, r0, c0);
    assertArrayEquals(getFailMsg(), expected, actual);
  }

  private String getFailMsg() {
    return String.format("R: %d, C: %d, r0: %d, c0: %d\nactual: %s\nexpected: %s\n", R, C, r0, c0, g.toJson(actual), g.toJson(expected));
  }
}
