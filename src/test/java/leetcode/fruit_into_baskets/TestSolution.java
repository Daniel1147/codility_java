package leetcode.fruit_into_baskets;

import static org.junit.Assert.*;

import java.util.Arrays;
import org.junit.Before;
import org.junit.Test;
import com.google.gson.Gson;

public class TestSolution {
  private int[] tree;

  private int expected, actual;
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
    tree = new int[]{1, 2, 1};
    expected = 3;

    myTest();
  }

  @Test
  public void testLeetcode2() {
    tree = new int[]{0,1,2,2};
    expected = 3;

    myTest();
  }

  @Test
  public void testLeetcode3() {
    tree = new int[]{1,2,3,2,2};
    expected = 4;

    myTest();
  }

  @Test
  public void testLeetcode4() {
    tree = new int[]{3,3,3,1,2,1,1,2,3,3,4};
    expected = 5;

    myTest();
  }

  private void myTest() {
    actual = s.totalFruit(tree);

    assertEquals(getFailMsg(), expected, actual);
  }

  private String getFailMsg() {
    return String.format("tree: %s", g.toJson(tree));
  }
}
