package leetcode.available_captures_for_rook;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import org.junit.Before;
import org.junit.Test;
import com.google.gson.Gson;

public class TestSolution {
  private int expected, actual;
  private char[][] board;
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
    board = new char[][] {
      {'.','.','.','.','.','.','.','.'},
      {'.','.','.','p','.','.','.','.'},
      {'.','.','.','R','.','.','.','p'},
      {'.','.','.','.','.','.','.','.'},
      {'.','.','.','.','.','.','.','.'},
      {'.','.','.','p','.','.','.','.'},
      {'.','.','.','.','.','.','.','.'},
      {'.','.','.','.','.','.','.','.'}
    };
    expected = 3;

    myTest();
  }

  private void myTest() {
    actual = s.numRookCaptures(board);
    assertEquals(getFailMsg(), expected, actual);
  }

  private String getFailMsg() {
    String result = "\n";
    Gson gson = new Gson();

    for (int i = 0; i < board.length; i++) {
      result = result + gson.toJson(board[i]) + "\n";
    }

    return result;
  }
}
