package leetcode.find_all_anagrams_in_a_string;

import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.hamcrest.CoreMatchers.is;

import java.util.Arrays;
import java.util.List;
import org.junit.Before;
import org.junit.Test;

public class TestSolution {
  private List<Integer> expect, actual;
  private Solution sol;
  private String s, p;

  @Before
  public void setUp() {
    sol = new Solution();
  }

  @Test
  public void testCompile() {
    assertTrue(true);
  }

  @Test
  public void testLeetCode() {
    s = "abab";
    p = "ab";
    actual = Arrays.asList(0, 1, 2);

    myTest();
  }

  private void myTest() {
    expect = sol.findAnagrams(s, p);

    assertThat(expect, is(actual));
  }

  private String getFailMsg() {
    return "";
  }
}
