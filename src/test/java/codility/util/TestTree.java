package codility.util;

import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;
import org.junit.Test;

public class TestTree {
  @Test
  public void TestPreOrder() {
    Tree root = sample1();
    int[] expected, preOrder;

    expected = new int[] {1, 2, 4, 5, 3, 6};
    preOrder = root.preOrder();

    String errorMsg =
        String.format(
            "expected => %s, actual => %s\n", Arrays.toString(expected), Arrays.toString(preOrder));
    assertArrayEquals(errorMsg, expected, preOrder);
  }

  @Test
  public void TestInOrder() {
    Tree root = sample1();
    int[] expected, inOrder;

    expected = new int[] {4, 2, 5, 1, 6, 3};
    inOrder = root.inOrder();

    String errorMsg =
        String.format(
            "expected => %s, actual => %s\n", Arrays.toString(expected), Arrays.toString(inOrder));
    assertArrayEquals(errorMsg, expected, inOrder);
  }

  @Test
  public void TestPostOrder() {
    Tree root = sample1();
    int[] expected, postOrder;

    expected = new int[] {4, 5, 2, 6, 3, 1};
    postOrder = root.postOrder();

    String errorMsg =
        String.format(
            "expected => %s, actual => %s\n",
            Arrays.toString(expected), Arrays.toString(postOrder));
    assertArrayEquals(errorMsg, expected, postOrder);
  }

  @Test
  public void TestLevelOrder() {
    Tree root = sample1();
    int[] expected, levelOrder;

    expected = new int[] {1, 2, 3, 4, 5, 6};
    levelOrder = root.levelOrder();

    String errorMsg =
        String.format(
            "expected => %s, actual => %s\n",
            Arrays.toString(expected), Arrays.toString(levelOrder));
    assertArrayEquals(errorMsg, expected, levelOrder);
  }

  @Test
  public void TestLevelOrderConstruct() {
    String input;
    Tree root;

    input = "1 2 3 4 5 6 x x x 7 8 x 9";
    root = Tree.levelOrderConstruct(input);
    int[] expectInOrder, expectPreOrder, expectPostOrder, expectLevelOrder, actual;

    expectPreOrder = new int[] {1, 2, 4, 5, 7, 8, 3, 6, 9};
    actual = root.preOrder();
    assertArrayEquals(expectPreOrder, actual);

    expectInOrder = new int[] {4, 2, 7, 5, 8, 1, 6, 9, 3};
    actual = root.inOrder();
    assertArrayEquals(expectInOrder, actual);

    expectPostOrder = new int[] {4, 7, 8, 5, 2, 9, 6, 3, 1};
    actual = root.postOrder();
    assertArrayEquals(expectPostOrder, actual);

    expectLevelOrder = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9};
    actual = root.levelOrder();
    assertArrayEquals(expectLevelOrder, actual);
  }

  private Tree sample1() {
    Tree root;
    root = Tree.levelOrderConstruct("1 2 3 4 5 6");

    return root;
  }
}
