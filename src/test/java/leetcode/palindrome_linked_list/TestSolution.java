package leetcode.palindrome_linked_list;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import org.junit.Before;
import org.junit.Test;
import daniel1147.util.ListBuilder;
import leetcode.util.ListNode;
import leetcode.util.ListNodeOperator;

public class TestSolution {
  private boolean expected, actual;
  private ListNode head;
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
  public void testLeetcode1() {
    int[] input;

    input = new int[] {1, 2};

    head = fromIntArray(input);
    expected = false;

    myTest();
  }

  @Test
  public void testLeetcode2() {
    int[] input;

    input = new int[] {1, 2, 2, 1};

    head = fromIntArray(input);
    expected = true;

    myTest();
  }

  private void myTest() {
    actual = s.isPalindrome(head);
    assertEquals(getFailMsg(), expected, actual);
  }

  private String getFailMsg() {
    return String.format("head => %s", head);
  }

  private ListNode fromIntArray(int[] num) {
    ListBuilder lb;
    ListNodeOperator lno;

    lno = new ListNodeOperator();
    lb = new ListBuilder(lno);

    lb.fromNumArray(num);

    return lno.getConcreteRoot();
  }
}
