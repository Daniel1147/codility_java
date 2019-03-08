package leetcode.distribute_coins_in_binary_tree;

import static org.junit.Assert.*;

import java.util.Arrays;
import org.junit.Before;
import org.junit.Test;
import com.google.gson.Gson;
import leetcode.util.TreeNode;
import daniel1147.util.TreeTraversor;
import leetcode.util.LeetcodeTreeBuilder;

public class TestSolution {
  private int expected, actual;
  private Solution s;
  private TreeNode root;
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
    LeetcodeTreeBuilder tb = new LeetcodeTreeBuilder();
    root = tb.levelOrderConstruct("3 0 0");
    expected = 2;

    myTest();
  }

  @Test
  public void testLeetcode2() {
    LeetcodeTreeBuilder tb = new LeetcodeTreeBuilder();
    root = tb.levelOrderConstruct("0 3 0");
    expected = 3;

    myTest();
  }

  @Test
  public void testLeetcode3() {
    LeetcodeTreeBuilder tb = new LeetcodeTreeBuilder();
    root = tb.levelOrderConstruct("1 0 2");
    expected = 2;

    myTest();
  }

  @Test
  public void testLeetcode4() {
    LeetcodeTreeBuilder tb = new LeetcodeTreeBuilder();
    root = tb.levelOrderConstruct("1 0 0 x 3");
    expected = 4;

    myTest();
  }

  private void myTest() {
    actual = s.distributeCoins(root);
    assertEquals(getFailMsg(), expected, actual);
  }

  private String getFailMsg() {
    TreeTraversor t = new TreeTraversor(root);
    int[] A = t.fullBinaryTreeArray();
    return g.toJson(A);
  }
}
