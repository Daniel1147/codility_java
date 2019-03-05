package leetcode.find_and_replace_pattern;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import java.util.Arrays;
import org.junit.Before;
import org.junit.Test;
import java.util.List;

public class TestSolution {
  private String pattern;
  private String[] words, rawExpected;
  private List<String> expected, actual;
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
    words = new String[] {"abc", "deq", "mee", "aqq", "dkd", "ccc"};
    pattern = "abb";
    rawExpected = new String[] {"mee", "aqq"};

    myTest();
  }

  private void myTest() {
    expected = Arrays.asList(rawExpected);
    actual = s.findAndReplacePattern(words, pattern);

    assertEquals(getFailMsg(), expected, actual);
  }

  private String getFailMsg() {
    return "";
  }
}
