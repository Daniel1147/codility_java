package codility.template;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import org.junit.Before;
import org.junit.Test;

public class TestSolutionTemplate {
  private int expected, actual;
  private Solution s;

  @Before
  public void setUp() {
    s = new Solution();
  }

  @Test
  public void TestTemplate() {
    expected = 0;
    actual = s.solution();
    assertEquals(getFailMsg(), expected, actual);
  }

  private String getFailMsg() {
    return "";
  }
}
