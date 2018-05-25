package leetcode.util;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import org.junit.Test;
import daniel1147.util.ListBuilder;
import leetcode.util.ListNodeOperator;

public class TestListNode {
  @Test
  public void simpleTest() {
    ListNode root;
    root = new ListNode(0);
    root.next = new ListNode(1);
    root.next.next = new ListNode(2);

    assertEquals(root.val, 0);
    assertEquals(root.next.val, 1);
    assertEquals(root.next.next.val, 2);
  }

  @Test
  public void testCreation() {
    ListNode head;
    ListNodeOperator lno;
    ListBuilder lb;

    lno = new ListNodeOperator();
    lb = new ListBuilder(lno);
    lb.fromNumArray(new int[] {0, 1, 2, 3});
    head = lno.getConcreteRoot();

    assertEquals("0 1 2 3", head.toString());
  }
}
