package leetcode.kth_smallest_element_in_a_bst;

import static org.junit.Assert.*;

import java.util.Arrays;
import org.junit.Before;
import org.junit.Test;
import com.google.gson.Gson;
import leetcode.util.*;

public class TestSolution {
  private int expected, actual;
  private String rootStructure;
  private TreeNode root;
  private int k;
  private Solution s;
  private Gson g = new Gson();
  private LeetcodeTreeBuilder tb = new LeetcodeTreeBuilder();

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
    rootStructure = "3 1 4 x 2";
    root = tb.levelOrderConstruct(rootStructure);
    k = 1;
    expected = 1;

    myTest();
  }

  @Test
  public void testLeetcode2() {
    rootStructure = "5 3 6 2 4 x x 1";
    root = tb.levelOrderConstruct(rootStructure);
    k = 3;
    expected = 3;

    myTest();
  }

  private void myTest() {
    actual = s.kthSmallest(root, k);

    assertEquals(getFailMsg(), expected, actual);
  }

  private String getFailMsg() {
    return rootStructure;
  }
}
