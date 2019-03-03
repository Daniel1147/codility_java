package leetcode.unique_email_addresses;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import org.junit.Before;
import org.junit.Test;
import com.google.gson.Gson;

public class TestSolution {
  private int expected, actual;
  private String[] input;
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
    input = new String[] {
      "test.email+alex@leetcode.com",
      "test.e.mail+bob.cathy@leetcode.com",
      "testemail+david@lee.tcode.com"
    };
    expected = 2;

    myTest();
  }

  private void myTest() {
    actual = s.numUniqueEmails(input);
    assertEquals(getFailMsg(), expected, actual);
  }

  private String getFailMsg() {
    Gson gson = new Gson();
    return gson.toJson(input);
  }
}
