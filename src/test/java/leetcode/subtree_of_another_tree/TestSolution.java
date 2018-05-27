package leetcode.sutree_of_another_tree;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import leetcode.util.TreeNode;
import leetcode.util.LeetcodeTreeBuilder;
import java.util.Arrays;
import org.junit.Before;
import org.junit.Test;

public class TestSolution {
  private boolean expected, actual;
  private TreeNode s, t;
  private Solution sol;

  @Before
  public void setUp() {
    sol = new Solution();
  }

  @Test
  public void testLeetcode1() {
    s = createTree("3 4 5 1 2");
    t = createTree("4 1 2");
    expected = true;

    myTest();
  }

  @Test
  public void testLeetcode2() {
    s = createTree("3 4 5 1 2 x x x x 0");
    t = createTree("4 1 2");
    expected = false;

    myTest();
  }

  private void myTest() {
    actual = sol.isSubtree(s, t);

    assertEquals(expected, actual);
  }

  private TreeNode createTree(String s) {
    LeetcodeTreeBuilder ltb;

    ltb = new LeetcodeTreeBuilder();

    return ltb.levelOrderConstruct(s);
  }
}
