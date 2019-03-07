package leetcode.partition_labels;

import static org.junit.Assert.*;

import java.util.*;
import org.junit.Before;
import org.junit.Test;
import com.google.gson.Gson;

public class TestSolution {
  private List<Integer> expected, actual;
  private String S;
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
    S = "ababcbacadefegdehijhklij";
    expected = Arrays.asList(new Integer[] {9, 7, 8});

    myTest();
  }

  private void myTest() {
    actual = s.partitionLabels(S);
    assertEquals(getFailMsg(), expected, actual);
  }

  private String getFailMsg() {
    return S;
  }
}
