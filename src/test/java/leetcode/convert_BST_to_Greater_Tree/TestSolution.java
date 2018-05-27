package leetcode.convert_BST_to_Greater_Tree;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import leetcode.util.TreeNode;

public class TestSolution {
  private TreeNode root;
  private Solution s;

  @Before
  public void setUp() {
    s = new Solution();
  }

  @Test
  public void testLeetCode() {
    root = new TreeNode(5);
    root.left = new TreeNode(2);
    root.right = new TreeNode(13);

    s.convertBST(root);

    assertEquals(18, root.val);
    assertEquals(13, root.right.val);
    assertEquals(20, root.left.val);
  }
}
