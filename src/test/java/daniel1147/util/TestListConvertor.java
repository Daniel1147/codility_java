package daniel1147.util;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;
import org.junit.Before;

public class TestListConvertor {
  ListConvertor lc;
  IListNode head;
  int[] expected, actual;

  @Before
  public void setUp() {
    lc = new ListConvertor();
  }

  @Test
  public void test1() {
    head = null;

    expected = new int[0];
    actual = lc.toIntArray(head);

    assertArrayEquals(expected, actual);
  }

  @Test
  public void test2() {
    head = new SampleListNode(1);

    expected = new int[] {1};
    actual = lc.toIntArray(head);

    assertArrayEquals(expected, actual);
  }

  @Test
  public void test3() {
    IListNode current;
    head = new SampleListNode(2);
    current = head.append(3);
    current = current.append(4);

    expected = new int[] {2, 3, 4};
    actual = lc.toIntArray(head);

    assertArrayEquals(expected, actual);
  }
}
