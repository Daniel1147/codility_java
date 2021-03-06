package codility.tree_height;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import org.junit.Before;
import org.junit.Test;
import codility.util.Tree;
import codility.util.TreeOperator;
import daniel1147.util.TreeBuilder;
import daniel1147.util.TreeTraversor;

public class TestSolution {
  private Tree t;
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
  public void TestEmpty() {
    t = levelOrderConstruct("");
    expected = -1;

    myTest();
  }

  @Test
  public void Test1() {
    t = levelOrderConstruct("1 2 3 4 x x x 5");
    expected = 3;

    myTest();
  }

  @Test
  public void TestCodility1() {
    t = levelOrderConstruct("5 3 10 20 21 1");
    expected = 2;

    myTest();
  }

  private void myTest() {
    actual = s.solution(t);
    assertEquals(getFailMsg(), expected, actual);
  }

  private String getFailMsg() {
    String inputStr;
    TreeTraversor tt = new TreeTraversor(t);

    if (t == null)
      inputStr = "[]";
    else
      inputStr = Arrays.toString(tt.inOrder());

    return String.format("input: %s\n", inputStr);
  }

  private Tree levelOrderConstruct(String s) {
    TreeOperator to = new TreeOperator();
    TreeBuilder tb = new TreeBuilder(to);

    tb.levelOrderConstruct(s);

    return to.getTree();
  }
}
