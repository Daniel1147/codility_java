package daniel1147.util;

import java.util.*;

public class IntTree {
  public int x;
  public IntTree l;
  public IntTree r;

  private static final String nullNode = "x";

  public IntTree(int x) {
    this.x = x;
  }

  public static IntTree levelOrderConstruct(String s) {
    if (s.equals(""))
      return null;

    String[] nodeStrList;
    Queue<String> q;

    nodeStrList = s.split(" ");
    q = new ArrayDeque<String>(Arrays.asList(nodeStrList));

    String nodeStr;
    IntTree root, node, parentNode;
    Queue<IntTree> nodeQ;

    nodeQ = new ArrayDeque<IntTree>();
    nodeStr = q.poll();
    if (nodeStr.equals(nullNode))
      return null;

    root = new IntTree(Integer.parseInt(nodeStr));
    nodeQ.add(root);
    while(!q.isEmpty()) {
      nodeStr = q.poll();
      parentNode = nodeQ.poll();
      if (!nodeStr.equals(nullNode)) {
        node = new IntTree(Integer.parseInt(nodeStr));
        parentNode.l = node;
        nodeQ.add(node);
      } else {
        parentNode.l = null;
      }

      if (q.isEmpty())
        break;

      nodeStr = q.poll();
      if (!nodeStr.equals(nullNode)) {
        node = new IntTree(Integer.parseInt(nodeStr));
        parentNode.r = node;
        nodeQ.add(node);
      } else {
        parentNode.r = null;
      }
    }

    return root;
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
