package leetcode.linked_list_cycle;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import org.junit.Before;
import org.junit.Test;
import leetcode.util.ListNode;

public class TestSolution {
  private boolean expected, actual;
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
  public void test1() {
    ListNode root = new ListNode(0);
    expected = false;
    actual = s.hasCycle(root);

    assertEquals(expected, actual);
  }

  @Test
  public void test2() {
    ListNode root = new ListNode(0);
    root.next = new ListNode(1);
    root.next.next = root;

    expected = true;
    actual = s.hasCycle(root);

    assertEquals(expected, actual);
  }

  private String getFailMsg() {
    return "";
  }
}
