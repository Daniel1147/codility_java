package leetcode.rotate_list;

import static org.junit.Assert.*;

import java.util.Arrays;
import org.junit.Before;
import org.junit.Test;
import com.google.gson.Gson;
import leetcode.util.*;
import daniel1147.util.ListNodeComparator;
import daniel1147.util.ListConvertor;

public class TestSolution {
  private ListNode head;
  private int k;
  private int[] headStruct;

  private ListNode expected, actual;
  private Solution s;
  private Gson g = new Gson();
  private ListNodeComparator comparator = new ListNodeComparator();
  private LeetcodeListNodeBuilder builder = new LeetcodeListNodeBuilder();
  private ListConvertor convertor = new ListConvertor();

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
    headStruct = new int[]{1, 2, 3, 4, 5};
    head = builder.fromIntArray(headStruct);
    k = 2;
    expected = builder.fromIntArray(new int[]{4, 5, 1, 2, 3});

    myTest();
  }

  private void myTest() {
    actual = s.rotateRight(head, k);
    assertTrue(getFailMsg(), comparator.same(expected, actual));
  }

  private String getFailMsg() {
    return String.format("head: %s, k: %d, actual: %s", g.toJson(headStruct),
        k, g.toJson(convertor.toIntArray(actual)));
  }
}
