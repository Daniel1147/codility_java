package codility.tree_height;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import org.junit.Before;
import org.junit.Test;
import daniel1147.util.IntTree;

public class TestSolution {
  private IntTree t;
  private int expected, actual;
  private Solution s;

  @Before
  public void setUp() {
    s = new Solution();
  }

  @Test
  public void TestCompile() {
    assertTrue(true);
  }

  @Test
  public void TestCodility1() {
    t = IntTree.levelOrderConstruct("5 3 10 20 21 1");
    expected = 2;

    myTest();
  }

  private void myTest() {
    actual = s.solution(t);
    assertEquals(getFailMsg(), expected, actual);
  }

  private String getFailMsg() {
    return String.format("input: %s\n", Arrays.toString(t.inOrder()));
  }
}
