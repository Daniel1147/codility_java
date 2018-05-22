package leetcode.intersection_of_two_linked_lists;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import leetcode.util.ListNode;
import org.junit.Before;
import org.junit.Test;

public class TestSolution {
  private ListNode expected, actual, headA, headB;
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
  public void testLeetcode() {
    ListNode.Factory f = new ListNode.Factory();

    headA = f.fromNumArray(new int[] {1, 2, 3, 4, 5});

    headB = f.fromNumArray(new int[] {6, 7, 8});
    headB.next.next.next = headA.next.next;

    expected = headA.next.next;
    myTest();
  }

  @Test
  public void testNull() {
    ListNode.Factory f = new ListNode.Factory();

    headA = f.fromNumArray(new int[] {1, 2, 3, 4, 5});

    headB = f.fromNumArray(new int[] {6, 7, 8});

    expected = null;
    myTest();
  }

  @Test
  public void testNull1() {
    headA = null;
    headB = null;

    expected = null;
    myTest();
  }

  @Test
  public void test1() {
    ListNode.Factory f = new ListNode.Factory();

    headA = f.fromNumArray(new int[] {1, 2, 3, 4, 5});
    headB = headA.next.next;

    expected = headB;
    myTest();
  }

  private void myTest() {
    actual = s.getIntersectionNode(headA, headB);
    assertEquals(getFailMsg(), expected, actual);
  }

  private String getFailMsg() {
    return String.format("headA => %s\n headB => %s\n", headA, headB);
  }
}
