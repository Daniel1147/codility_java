package daniel1147.util;

import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;
import org.junit.Before;
import org.junit.Test;

public class TestTreeTraversor {
  ITree root;
  int[] expected, preOrder;
  TreeTraversor tt;

  @Before
  public void setUp() {
    TreeBuilder tb = new TreeBuilder(new SampleTreeOperator());
    tb.levelOrderConstruct("1 2 3 4 5 6");
    root = tb.getITree();
    tt = new TreeTraversor(root);
  }

  @Test
  public void TestPreOrder() {
    expected = new int[] {1, 2, 4, 5, 3, 6};
    preOrder = tt.preOrder();

    String errorMsg =
        String.format(
            "expected => %s, actual => %s\n", Arrays.toString(expected), Arrays.toString(preOrder));
    assertArrayEquals(errorMsg, expected, preOrder);
  }

  @Test
  public void TestInOrder() {
    int[] expected, inOrder;

    expected = new int[] {4, 2, 5, 1, 6, 3};
    inOrder = tt.inOrder();

    String errorMsg =
        String.format(
            "expected => %s, actual => %s\n", Arrays.toString(expected), Arrays.toString(inOrder));
    assertArrayEquals(errorMsg, expected, inOrder);
  }

  @Test
  public void TestPostOrder() {
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
  public void TestLevelOrder() {
    int[] expected, levelOrder;

    expected = new int[] {1, 2, 3, 4, 5, 6};
    levelOrder = tt.levelOrder();

    String errorMsg =
        String.format(
            "expected => %s, actual => %s\n",
            Arrays.toString(expected), Arrays.toString(levelOrder));
    assertArrayEquals(errorMsg, expected, levelOrder);
  }
}
