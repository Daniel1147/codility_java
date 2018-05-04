package daniel1147.util;

import java.util.Arrays;

public class IntTree {
  public int x;
  public IntTree l;
  public IntTree r;

  public IntTree(int x) {
    this.x = x;
  }

  public int[] inOrder() {
    int[] result, left, right;

    left = (l != null) ? l.inOrder() : new int[0];
    right = (r != null) ? r.inOrder() : new int[0];

    result = concat(left, new int[]{x}, right);

    return result;
  }

  public int[] postOrder() {
    int[] result, left, right;

    left = (l != null) ? l.postOrder() : new int[0];
    right = (r != null) ? r.postOrder() : new int[0];

    result = concat(left, right, new int[] {x});

    return result;
  }

  private int[] concat(int[] a, int[] b, int[] c) {
    int[] result;

    result = new int[a.length + b.length + c.length];

    System.arraycopy(a, 0, result, 0, a.length);
    System.arraycopy(b, 0, result, a.length, b.length);
    System.arraycopy(c, 0, result, a.length + b.length, c.length);

    return result;
  }
}
