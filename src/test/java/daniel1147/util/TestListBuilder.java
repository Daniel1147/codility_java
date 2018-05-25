package daniel1147.util;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;
import org.junit.Before;

public class TestListBuilder {
  ListConvertor lc;
  ListBuilder lb;
  IListNode head;
  IListNodeOperator lno;
  int[] expect, actual;

  @Before
  public void setUp() {
    lc = new ListConvertor();
    lno = new SampleListNodeOperator();
    lb = new ListBuilder(lno);
  }

  @Test
  public void test1() {
    expect = new int[0];
    head = lb.fromNumArray(expect);
    actual = lc.toIntArray(head);

    assertArrayEquals(expect, actual);
  }

  @Test
  public void test2() {
    expect = new int[] {10};
    head = lb.fromNumArray(expect);
    actual = lc.toIntArray(head);

    assertArrayEquals(expect, actual);
  }

  @Test
  public void test3() {
    expect = new int[] {1, 2, 3, 4, 5, 6};
    head = lb.fromNumArray(expect);
    actual = lc.toIntArray(head);

    assertArrayEquals(expect, actual);
  }
}
