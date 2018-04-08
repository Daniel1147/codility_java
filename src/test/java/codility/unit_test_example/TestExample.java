package codility.unit_test_example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestExample{
  @Test
  public void TestSolution() {
    Solution solution = new Solution();

    String failMsg = "Junit fails.";
    String actual = solution.solution();
    String expected = "Junit is working fine.";
    assertEquals(failMsg, expected, actual);
  }
}
