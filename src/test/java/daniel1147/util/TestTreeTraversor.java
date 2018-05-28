package daniel1147.util;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import java.util.Arrays;
import org.junit.Before;
import org.junit.Test;

public class TestTreeTraversor {
  ITree root;
  int[] expected, preOrder;
  TreeTraversor tt;

  @Before
  public void setUp() {
    root = buildTree("1 2 3 4 5 6");
    tt = getTreeTraversor(root);
  }

  @Test
  public void testPreOrder() {
    expected = new int[] {1, 2, 4, 5, 3, 6};
    preOrder = tt.preOrder();

    String errorMsg =
        String.format(
            "expected => %s, actual => %s\n", Arrays.toString(expected), Arrays.toString(preOrder));
    assertArrayEquals(errorMsg, expected, preOrder);
  }

  @Test
  public void testInOrder() {
    int[] expected, inOrder;

    expected = new int[] {4, 2, 5, 1, 6, 3};
    inOrder = tt.inOrder();

    String errorMsg =
        String.format(
            "expected => %s, actual => %s\n", Arrays.toString(expected), Arrays.toString(inOrder));
    assertArrayEquals(errorMsg, expected, inOrder);
  }

  @Test
  public void testPostOrder() {
    int[] expected, postOrder;

    expected = new int[] {4, 5, 2, 6, 3, 1};
    postOrder = tt.postOrder();

    String errorMsg =
        String.format(
            "expected => %s, actual => %s\n",
            Arrays.toString(expected), Arrays.toString(postOrder));
    assertArrayEquals(errorMsg, expected, postOrder);
  }

  @Test
  public void testLevelOrder() {
    int[] expected, levelOrder;

    expected = new int[] {1, 2, 3, 4, 5, 6};
    levelOrder = tt.levelOrder();

    String errorMsg =
        String.format(
            "expected => %s, actual => %s\n",
            Arrays.toString(expected), Arrays.toString(levelOrder));
    assertArrayEquals(errorMsg, expected, levelOrder);
  }

  @Test
  public void testSame() {
    ITree t1, t2;

    t1 = buildTree("1 2 3");
    t2 = buildTree("1 2 3");
    tt = getTreeTraversor(t1);

    assertTrue(tt.same(t2));

    t1 = buildTree("1 2 3");
    t2 = buildTree("1 2");
    tt = getTreeTraversor(t1);

    assertFalse(tt.same(t2));

    t1 = buildTree("1 2");
    t2 = buildTree("1 2 3");
    tt = getTreeTraversor(t1);

    assertFalse(tt.same(t2));

    t1 = buildTree("1 2 3");
    t2 = buildTree("1 2 4");
    tt = getTreeTraversor(t1);

    assertFalse(tt.same(t2));
  }

  private ITree buildTree(String s) {
    TreeBuilder tb = new TreeBuilder(new SampleTreeOperator());
    tb.levelOrderConstruct(s);

    return tb.getITree();
  }

  private TreeTraversor getTreeTraversor(ITree root) {
    return new TreeTraversor(root);
  }
}
