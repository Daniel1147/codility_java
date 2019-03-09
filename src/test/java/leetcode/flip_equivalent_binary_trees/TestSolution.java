package leetcode.flip_equivalent_binary_trees;

import static org.junit.Assert.*;

import java.util.Arrays;
import org.junit.Before;
import org.junit.Test;
import com.google.gson.Gson;
import leetcode.util.*;

public class TestSolution {
  private String s1, s2;
  private TreeNode root1, root2;
  private boolean expected, actual;
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
    s1 = "1 2 3 4 5 6 x x x 7 8";
    root1 = tb.levelOrderConstruct(s1);
    s2 = "1 3 2 x 6 4 5 x x x x 8 7";
    root2 = tb.levelOrderConstruct(s2);
    expected = true;

    myTest();
  }

  private void myTest() {
    actual = s.flipEquiv(root1, root2);
    assertEquals(getFailMsg(), expected, actual);
  }

  private String getFailMsg() {
    return String.format("s1: %s, s2: %s", s1, s2);
  }
}
