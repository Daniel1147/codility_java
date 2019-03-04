package leetcode.unique_morse_code_words;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import org.junit.Before;
import org.junit.Test;
import com.google.gson.Gson;

public class TestSolution {
  private int expected, actual;
  private String[] words;
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
    words = new String[] {"gin", "zen", "gig", "msg"};
    expected = 2;

    myTest();
  }

  private void myTest() {
    actual = s.uniqueMorseRepresentations(words);

    assertEquals(getFailMsg(), actual, expected);
  }

  private String getFailMsg() {
    Gson gson = new Gson();
    return gson.toJson(words);
  }
}
