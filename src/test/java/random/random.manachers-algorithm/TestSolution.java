package random.manachers_algorithm;

import static org.junit.Assert.*;

import java.util.Arrays;
import org.junit.Before;
import org.junit.Test;
import com.google.gson.Gson;

public class TestSolution {
  private String expected, actual;
  private String str;
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
  public void test1() {
    str = "";
    expected = "";

    myTest();
  }

  @Test
  public void test2() {
    str = "babcbabcbaccba";
    expected = "abcbabcba";

    myTest();
  }

  @Test
  public void test3() {
    str = "abaaba";
    expected = "abaaba";

    myTest();
  }

  @Test
  public void test4() {
    str = "abababa";
    expected = "abababa";

    myTest();
  }

  @Test
  public void test5() {
    str = "abcbabcbabcba";
    expected = "abcbabcbabcba";

    myTest();
  }

  @Test
  public void test6() {
    str = "forgeeksskeegfor";
    expected = "geeksskeeg";

    myTest();
  }

  @Test
  public void test7() {
    str = "caba";
    expected = "aba";

    myTest();
  }

  @Test
  public void test8() {
    str = "abacdfgdcaba";
    expected = "aba";

    myTest();
  }

  @Test
  public void test9() {
    str = "abacdfgdcabba";
    expected = "abba";

    myTest();
  }

  @Test
  public void test10() {
    str = "abacdedcaba";
    expected = "abacdedcaba";

    myTest();
  }

  private void myTest() {
    actual = s.LPS(str);

    assertEquals(getFailMsg(), expected, actual);
  }

  private String getFailMsg() {
    return str;
  }
}
