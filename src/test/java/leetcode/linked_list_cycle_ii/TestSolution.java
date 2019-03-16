package leetcode.linked_list_cycle_ii;

import static org.junit.Assert.*;

import java.util.Arrays;
import org.junit.Before;
import org.junit.Test;
import com.google.gson.Gson;
import leetcode.util.*;
import daniel1147.util.*;

public class TestSolution {
  private ListNode expected, actual;
  private int[] listStruct;
  private int pos;
  private ListNode head;
  private Solution s;
  private Gson g = new Gson();
  private LeetcodeListNodeBuilder builder = new LeetcodeListNodeBuilder();

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
    listStruct = new int[] {3, 2, 0, -4};
    head = builder.fromIntArray(listStruct);
    pos = 1;
    expected = addLoop(head, pos);

    myTest();
  }

  private ListNode addLoop(ListNode head, int loopStartPos) {
    ListNode loopStart, listEnd;
    int cnt;

    if (loopStartPos == -1)
      return null;

    listEnd = head;
    while (listEnd.next != null)
      listEnd = listEnd.next;

    cnt = 0;
    loopStart = head;
    while (loopStartPos != cnt) {
      cnt++;
      loopStart = loopStart.next;
    }

    listEnd.next = loopStart;
    return loopStart;
  }

  private void myTest() {
    actual = s.detectCycle(head);

    assertTrue(getFailMsg(), expected == actual);
  }

  private String getFailMsg() {
    return String.format("list: %s, loop start at %d", g.toJson(listStruct), pos);
  }
}
