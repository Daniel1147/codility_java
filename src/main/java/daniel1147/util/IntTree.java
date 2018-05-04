package daniel1147.util;

import java.util.*;

public class IntTree {
  public int x;
  public IntTree l;
  public IntTree r;

  public IntTree(int x) {
    this.x = x;
  }

  public int[] preOrder() {
    int[] result, left, right;

    left = (l != null) ? l.preOrder() : new int[0];
    right = (r != null) ? r.preOrder() : new int[0];

    result = concat(new int[] {x}, left, right);

    return result;
  }

  public int[] inOrder() {
    int[] result, left, right;

    left = (l != null) ? l.inOrder() : new int[0];
    right = (r != null) ? r.inOrder() : new int[0];

    result = concat(left, new int[] {x}, right);

    return result;
  }

  public int[] postOrder() {
    int[] result, left, right;

    left = (l != null) ? l.postOrder() : new int[0];
    right = (r != null) ? r.postOrder() : new int[0];

    result = concat(left, right, new int[] {x});

    return result;
  }

  public int[] levelOrder() {
    Queue<IntTree> q;
    List<Integer> result;

    q = new ArrayDeque<IntTree>();
    result = new ArrayList<Integer>();

    q.add(this);

    IntTree t;
    while (!q.isEmpty()) {
      t = q.poll();

      if (t.l != null) q.add(t.l);

      if (t.r != null) q.add(t.r);

      result.add(t.x);
    }

    int[] output;
    output = new int[result.size()];
    Iterator<Integer> iter = result.iterator();

    for (int i = 0; iter.hasNext(); i++) output[i] = iter.next();

    return output;
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
