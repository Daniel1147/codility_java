package leetcode.split_linked_list_in_parts;

import static org.junit.Assert.*;

import java.util.Arrays;
import org.junit.Before;
import org.junit.Test;
import com.google.gson.Gson;
import leetcode.util.*;
import daniel1147.util.ListNodeComparator;

public class TestSolution {
  private ListNode root;
  private int k;

  private LeetcodeListNodeBuilder builder = new LeetcodeListNodeBuilder();
  private ListNodeComparator comparator = new ListNodeComparator();

  private ListNode[] expected, actual;
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
    root = builder.fromIntArray(new int[]{1, 2, 3});
    k = 5;
    expected = new ListNode[5];
    expected[0] = builder.fromIntArray(new int[]{1});
    expected[1] = builder.fromIntArray(new int[]{2});
    expected[2] = builder.fromIntArray(new int[]{3});
    expected[3] = builder.fromIntArray(new int[0]);
    expected[4] = builder.fromIntArray(new int[0]);

    myTest();
  }

  @Test
  public void testLeetcode2() {
    root = builder.fromIntArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
    k = 3;
    expected = new ListNode[3];
    expected[0] = builder.fromIntArray(new int[]{1, 2, 3, 4});
    expected[1] = builder.fromIntArray(new int[]{5, 6, 7});
    expected[2] = builder.fromIntArray(new int[]{8, 9, 10});

    myTest();
  }

  @Test
  public void testLeetcode3() {
    root = builder.fromIntArray(new int[]{});
    k = 3;
    expected = new ListNode[3];
    expected[0] = builder.fromIntArray(new int[]{});
    expected[1] = builder.fromIntArray(new int[]{});
    expected[2] = builder.fromIntArray(new int[]{});

    myTest();
  }

  private void myTest() {
    boolean pass;
    actual = s.splitListToParts(root, k);

    assertNotNull(actual);

    if (actual.length == expected.length)
      pass = true;
    else
      pass = false;

    assertTrue(String.format("expect array size: %d", expected.length), pass);

    for (int i = 0; i < expected.length; i++) {
      assertTrue(String.format("element %d different", i), comparator.same(expected[i], actual[i]));
    }
  }
}
