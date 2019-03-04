package leetcode.reveal_cards_in_increasing_order;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import org.junit.Before;
import org.junit.Test;
import com.google.gson.Gson;

public class TestSolution {
  private int[] expected, actual;
  private int[] deck;
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
    deck = new int[] {17, 13, 11, 2, 3, 5, 7};
    expected = new int[] {2, 13, 3, 11, 5, 17, 7};

    myTest();
  }

  private void myTest() {
    actual = s.deckRevealedIncreasing(deck);

    assertArrayEquals(getFailMsg(), expected, actual);
  }

  private String getFailMsg() {
    Gson gson = new Gson();

    return gson.toJson(deck);
  }
}
