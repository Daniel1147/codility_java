package leetcode.diameter_of_binary_tree;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import org.junit.Before;
import org.junit.Test;
import leetcode.util.TreeNode;
import daniel1147.util.TreeBuilder;
import leetcode.util.TreeNodeOperator;

public class TestSolution {
  private int expected, actual;
  private Solution s;
  private TreeNode root;

  @Before
  public void setUp() {
    s = new Solution();
  }

  @Test
  public void testLeetcode() {
    root = buildTree("1 2 3 4 5");
    expected = 3;

    myTest();
  }

  private void myTest() {
    actual = s.diameterOfBinaryTree(root);

    assertEquals(expected, actual);
  }

  private TreeNode buildTree(String s) {
    TreeNodeOperator tno;
    TreeBuilder tb;

    tno = new TreeNodeOperator();
    tb = new TreeBuilder(tno);

    tb.levelOrderConstruct(s);
    return tno.getTreeNode();
  }
}
