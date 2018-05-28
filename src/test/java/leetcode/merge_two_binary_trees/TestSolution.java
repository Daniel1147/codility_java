package leetcode.merge_two_binary_trees;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import org.junit.Before;
import org.junit.Test;
import leetcode.util.TreeNode;
import leetcode.util.LeetcodeTreeBuilder;
import daniel1147.util.TreeTraversor;

public class TestSolution {
  private Solution s;
  private TreeNode t1, t2, actual, expect;

  @Before
  public void setUp() {
    s = new Solution();
  }

  @Test
  public void testLeetcode() {
    t1 = buildTree("1 3 2 5");
    t2 = buildTree("2 1 3 x 4 x 7");

    actual = s.mergeTrees(t1, t2);
    expect = buildTree("3 4 5 5 4 x 7");

    assertTrue(same(expect, actual));
  }

  private TreeNode buildTree(String s) {
    LeetcodeTreeBuilder ltb;

    ltb = new LeetcodeTreeBuilder();
    return ltb.levelOrderConstruct(s);
  }

  private boolean same(TreeNode t1, TreeNode t2) {
    TreeTraversor tt;

    tt = new TreeTraversor(t1);

    return tt.same(t2);
  }
}
