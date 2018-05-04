package daniel1147.util;

import java.util.Arrays;

public class IntTree {
  public int x;
  public IntTree l;
  public IntTree r;

  public IntTree(int x) {
    this.x = x;
  }

  public int[] postOrder() {
    int[] result, left, right;

    if (l == null)
      left = new int[0];
    else
      left = l.postOrder();

    if (r == null)
      right = new int[0];
    else
      right = r.postOrder();

    result = new int[left.length + right.length + 1];

    System.arraycopy(left, 0, result, 0, left.length);
    System.arraycopy(right, 0, result, left.length, right.length);
    result[left.length + right.length] = x;

    return result;
  }
}
