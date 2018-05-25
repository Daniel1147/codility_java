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
  private int[] input;

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
    input = new int[] {1, 2};

    head = fromIntArray(input);
    expected = false;

    myTest();
  }

  @Test
  public void testLeetcode2() {
    input = new int[] {1, 2, 2, 1};

    head = fromIntArray(input);
    expected = true;

    myTest();
  }

  @Test
  public void testLeetcode3() {
    input = new int[] {1, 1, 2, 1};

    head = fromIntArray(input);
    expected = false;

    myTest();
  }

  @Test
  public void test1() {
    input = new int[] {1};

    head = fromIntArray(input);
    expected = true;

    myTest();
  }

  @Test
  public void test2() {
    input = new int[] {};

    head = fromIntArray(input);
    expected = true;

    myTest();
  }

  @Test
  public void test3() {
    input = new int[] {1, 1};

    head = fromIntArray(input);
    expected = true;

    myTest();
  }

  @Test
  public void test4() {
    input = new int[] {2, 1};

    head = fromIntArray(input);
    expected = false;

    myTest();
  }

  @Test
  public void test5() {
    input = new int[] {1, 2, 1};

    head = fromIntArray(input);
    expected = true;

    myTest();
  }

  @Test
  public void test6() {
    input = new int[] {1, 2, 3};

    head = fromIntArray(input);
    expected = false;

    myTest();
  }

  @Test
  public void test7() {
    input = new int[] {1, 2, 3, 4};

    head = fromIntArray(input);
    expected = false;

    myTest();
  }

  @Test
  public void test8() {
    input = new int[] {1, 2, 2, 4};

    head = fromIntArray(input);
    expected = false;

    myTest();
  }

  @Test
  public void test9() {
    input = new int[] {3, 1, 1, 3};

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
