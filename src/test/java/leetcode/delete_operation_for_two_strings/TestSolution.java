package leetcode.delete_operation_for_two_strings;

import static org.junit.Assert.*;

import java.util.Arrays;
import org.junit.Before;
import org.junit.Test;
import com.google.gson.Gson;

public class TestSolution {
  private String word1, word2;
  private int expected, actual;
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
    word1 = "sea";
    word2 = "eat";
    expected = 2;

    myTest();
  }

  private void myTest() {
    actual = s.minDistance(word1, word2);
    assertEquals(getFailMsg(), expected, actual);
  }

  private String getFailMsg() {
    return String.format("word1: %s, word2: %s", word1, word2);
  }
}
