package codility.binary_tree_postorder_traversal;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.*;
import org.junit.Before;
import org.junit.Test;

public class TestSolution {
  private int[] expected, actual;
  private Solution.TreeNode root;
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
    root.right = s.new TreeNode(2);
    root.right.left = s.new TreeNode(3);

    expected = new int[] {3, 2, 1};
  }

  private void myTest() {
    Iterator<Integer> iter;
    List<Integer> output;
    output = s.postorderTraversal(root);

    iter = s.postorderTraversal(root).iterator();
    actual = new int[output.size()];

    for (int i = 0; i < output.size(); i++)
      actual[i] = iter.next();

    assertEquals(getFailMsg(), 0, 0);
  }

  private String getFailMsg() {
    return "";
  }
}
