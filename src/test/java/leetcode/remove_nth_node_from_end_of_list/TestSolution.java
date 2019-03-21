package leetcode.remove_nth_node_from_end_of_list;

import static org.junit.Assert.*;

import java.util.Arrays;
import org.junit.Before;
import org.junit.Test;
import com.google.gson.Gson;
import leetcode.util.*;
import daniel1147.util.*;

public class TestSolution {
  private ListNode head, oriHead;
  private int n;

  private ListNodeComparator comparator = new ListNodeComparator();
  private LeetcodeListNodeBuilder builder = new LeetcodeListNodeBuilder();
  private ListConvertor convertor = new ListConvertor();
  private ListNode expected, actual;
  private Solution s;
  private Gson g = new Gson();

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
    oriHead = builder.fromIntArray(new int[]{1, 2, 3, 4, 5});
    head = builder.fromIntArray(new int[]{1, 2, 3, 4, 5});
    n = 2;
    expected = builder.fromIntArray(new int[]{1, 2, 3, 5});

    myTest();
  }

  @Test
  public void testLeetcode2() {
    oriHead = builder.fromIntArray(new int[]{1});
    head = builder.fromIntArray(new int[]{1});
    n = 1;
    expected = builder.fromIntArray(new int[]{});

    myTest();
  }

  @Test
  public void testLeetcode3() {
    oriHead = builder.fromIntArray(new int[]{1, 2});
    head = builder.fromIntArray(new int[]{1, 2});
    n = 2;
    expected = builder.fromIntArray(new int[]{2});

    myTest();
  }

  private void myTest() {
    actual = s.removeNthFromEnd(head, n);

    assertTrue(getFailMsg(), comparator.same(expected, actual));
  }

  private String getFailMsg() {
    String oriList, expectedList, actualList;

    oriList = Arrays.toString(convertor.toIntArray(oriHead));
    expectedList = Arrays.toString(convertor.toIntArray(expected));
    actualList = Arrays.toString(convertor.toIntArray(actual));

    return String.format("head: %s\nexpected: %s\nactual: %s", oriList, expectedList, actualList);
  }
}
