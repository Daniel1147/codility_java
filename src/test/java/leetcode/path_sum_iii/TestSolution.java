package leetcode.path_sum_iii;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import org.junit.Before;
import org.junit.Test;
import leetcode.util.TreeNode;
import leetcode.util.TreeNodeOperator;
import daniel1147.util.TreeBuilder;

public class TestSolution {
  private int expected, actual, sum;
  private TreeNode root;
  private Solution s;
  private String treeStr;

  @Before
  public void setUp() {
    s = new Solution();
  }

  @Test
  public void testCompile() {
    assertTrue(true);
  }

  @Test
  public void testNull() {
    root = null;
    sum = 8;
    expected = 0;

    myTest();
  }

  @Test
  public void testLeetcode() {
    // [10,5,-3,3,2,null,11,3,-2,null,1]
    treeStr = "10 5 -3 3 2 x 11 3 -2 x 1";
    root = buildTree(treeStr);
    sum = 8;
    expected = 3;

    myTest();
  }

  private void myTest() {
    actual = s.pathSum(root, sum);
    assertEquals(getFailMsg(), expected, actual);
  }

  private String getFailMsg() {
    return "";
  }

  private TreeNode buildTree(String treeStr) {
    TreeNodeOperator tno;
    TreeBuilder tb;

    tno = new TreeNodeOperator();
    tb = new TreeBuilder(tno);

    tb.levelOrderConstruct(treeStr);

    return tno.getTreeNode();
  }
}
