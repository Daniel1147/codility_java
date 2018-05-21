package daniel1147.util;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import org.junit.Test;

public class TestIntLinkList {
  @Test
  public void simpleTest() {
    IntLinkList root;
    root = new IntLinkList(0);
    root.next = new IntLinkList(1);
    root.next.next = new IntLinkList(2);

    assertEquals(root.val, 0);
    assertEquals(root.next.val, 1);
    assertEquals(root.next.next.val, 2);
  }
}
