package leetcode.battleships_in_a_board;

import static org.junit.Assert.*;

import java.util.Arrays;
import org.junit.Before;
import org.junit.Test;
import com.google.gson.Gson;

public class TestSolution {
  char[][] board;
  String[] sBoard;
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
    sBoard = new String[] {
      "X..X",
      "...X",
      "...X"
    };
    board = toCharArray(sBoard);
    expected = 2;

    myTest();
  }

  private char[][] toCharArray(String[] sBoard) {
    char[][] result;

    result = new char[sBoard.length][];
    for (int i = 0; i < sBoard.length; i++)
      result[i] = sBoard[i].toCharArray();

    return result;
  }

  private void myTest() {
    actual = s.countBattleships(board);

    assertEquals(getFailMsg(), expected, actual);
  }

  private String getFailMsg() {
    return g.toJson(board);
  }
}
