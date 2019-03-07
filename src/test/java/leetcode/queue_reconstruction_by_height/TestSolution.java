package leetcode.queue_reconstruction_by_height;

import static org.junit.Assert.*;

import java.util.Arrays;
import org.junit.Before;
import org.junit.Test;
import com.google.gson.Gson;

public class TestSolution {
  private int[][] expected, actual;
  private int[][] people;
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
    people = new int[][] {{7,0}, {4,4}, {7,1}, {5,0}, {6,1}, {5,2}};
    expected = new int[][] {{5,0}, {7,0}, {5,2}, {6,1}, {4,4}, {7,1}};

    myTest();
  }

  private void myTest() {
    actual = s.reconstructQueue(people);
    // System.out.println(g.toJson(actual));
    assertArrayEquals(getFailMsg(), expected, actual);
    // assertTrue(getFailMsg(), Arrays.equals(expected, actual));
  }

  private String getFailMsg() {
    return g.toJson(people);
  }
}
