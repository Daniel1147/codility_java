package daniel1147.util;

import org.junit.Test;
import java.util.Arrays;
import static org.junit.Assert.assertArrayEquals;

public class TestIntTree {
  @Test
  public void TestPreOrder() {
    IntTree root = sample1();
    int[] expected, preOrder;

    expected = new int[] {1, 2, 4, 5, 3, 6};
    preOrder = root.preOrder();

    String errorMsg = String.format("expected => %s, actual => %s\n", Arrays.toString(expected), Arrays.toString(preOrder));
    assertArrayEquals(errorMsg, expected, preOrder);
  }

  @Test
  public void TestInOrder() {
    IntTree root = sample1();
    int[] expected, inOrder;

    expected = new int[] {4, 2, 5, 1, 6, 3};
    inOrder = root.inOrder();

    String errorMsg = String.format("expected => %s, actual => %s\n", Arrays.toString(expected), Arrays.toString(inOrder));
    assertArrayEquals(errorMsg, expected, inOrder);
  }

  @Test
  public void TestPostOrder() {
    IntTree root = sample1();
    int[] expected, postOrder;

    expected = new int[] {4, 5, 2, 6, 3, 1};
    postOrder = root.postOrder();

    String errorMsg = String.format("expected => %s, actual => %s\n", Arrays.toString(expected), Arrays.toString(postOrder));
    assertArrayEquals(errorMsg, expected, postOrder);
  }

  @Test
  public void TestLevelOrder() {
    IntTree root = sample1();
    int[] expected, levelOrder;

    expected = new int[] {1, 2, 3, 4, 5, 6};
    levelOrder = root.levelOrder();

    String errorMsg = String.format("expected => %s, actual => %s\n", Arrays.toString(expected), Arrays.toString(levelOrder));
    assertArrayEquals(errorMsg, expected, levelOrder);
  }

  private IntTree sample1() {
    IntTree root = new IntTree(1);
    root.l = new IntTree(2);
    root.l.l = new IntTree(4);
    root.l.r = new IntTree(5);
    root.r = new IntTree(3);
    root.r.l = new IntTree(6);

    return root;
  }
}
