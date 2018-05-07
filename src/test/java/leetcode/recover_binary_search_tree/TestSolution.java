package codility.recovery_binary_search_tree;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import org.junit.Before;
import org.junit.Test;

public class TestSolution {
  private Solution.TreeNode root;
  private int expected, actual;
  private Solution s;

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
    root = s.new TreeNode(1);
    root.left = s.new TreeNode(3);
    root.left.right = s.new TreeNode(2);

    s.recoverTree(root);
    assertEquals(root.val, 3);
    assertEquals(root.left.val, 1);
  }

  @Test
  public void testLeetcode2() {
    root = s.new TreeNode(3);
    root.left = s.new TreeNode(1);
    root.right = s.new TreeNode(4);
    root.right.left = s.new TreeNode(2);

    s.recoverTree(root);

    assertEquals(root.val, 2);
    assertEquals(root.right.left.val, 3);
  }

  private String getFailMsg() {
    return "";
  }
}
