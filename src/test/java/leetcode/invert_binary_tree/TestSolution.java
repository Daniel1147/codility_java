package leetcode.invert_binary_tree;

import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;
import org.junit.Before;
import org.junit.Test;
import leetcode.util.TreeNode;
import leetcode.util.TreeNodeOperator;
import daniel1147.util.TreeBuilder;
import daniel1147.util.TreeTraversor;

public class TestSolution {
  private Solution s;

  @Before
  public void setUp() {
    s = new Solution();
  }

  @Test
  public void testLeetcode() {
    // build tree
    TreeNodeOperator tno;
    TreeBuilder tb;
    TreeNode root;

    tno = new TreeNodeOperator();
    tb = new TreeBuilder(tno);
    tb.levelOrderConstruct("4 2 7 1 3 6 9");
    root = tno.getTreeNode();

    // get reuslt
    TreeNode resultTree;

    resultTree = s.invertTree(root);

    // exam
    int[] actual, expect;
    TreeTraversor tt;

    tt = new TreeTraversor(resultTree);
    expect = new int[] {4, 7, 2, 9, 6, 3, 1};
    actual = tt.levelOrder();

    assertArrayEquals(errorMsg(expect, actual), expect, actual);
  }

  private String errorMsg(int[] expect, int[] actual) {
    return String.format("expect => %s\n actual => %s\n", Arrays.toString(expect), Arrays.toString(actual));
  }
}
