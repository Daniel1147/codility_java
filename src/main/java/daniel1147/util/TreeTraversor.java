package daniel1147.util;

import java.util.*;

public class TreeTraversor
{
  private ITree root;

  public TreeTraversor(ITree root) {
    this.root = root;
  }

  public int[] preOrder() {
    return preOrderTree(root);
  }

  public int[] inOrder() {
    return inOrderTree(root);
  }

  public int[] postOrder() {
    return postOrderTree(root);
  }

  public int[] levelOrder() {
    Queue<ITree> q;
    List<Integer> result;

    q = new ArrayDeque<ITree>();
    result = new ArrayList<Integer>();

    if (root == null) {
      return new int[0];
    }

    q.add(root);

    ITree t;
    while (!q.isEmpty()) {
      t = q.poll();

      if (t.left() != null) q.add(t.left());

      if (t.right() != null) q.add(t.right());

      result.add(t.value());
    }

    int[] output;
    output = new int[result.size()];
    Iterator<Integer> iter = result.iterator();

    for (int i = 0; iter.hasNext(); i++) output[i] = iter.next();

    return output;
  }

  public boolean same(ITree t) {
    return same(root, t);
  }

  public int[] fullBinaryTreeArray() {
    List<Integer> resultList = new ArrayList<Integer>();
    int[] result;
    Queue<ITree> q = new LinkedList<ITree>();
    ITree node;
    int nodeCnt;

    q.add(root);
    if (root != null)
      nodeCnt = 1;
    else
      nodeCnt = 0;

    while(nodeCnt > 0) {
      node = q.poll();
      if (node == null) {
        resultList.add(-1);
        q.add(null);
        q.add(null);
      } else {
        nodeCnt--;
        resultList.add(node.value());
        if (node.left() != null)
          nodeCnt++;
        if (node.right() != null)
          nodeCnt++;
        q.add(node.left());
        q.add(node.right());
      }
    }

    result = new int[resultList.size()];
    for (int i = 0; i < resultList.size(); i++)
      result[i] = resultList.get(i);

    return result;
  }

  private int[] preOrderTree(ITree tree) {
    int[] result, lResult, rResult;
    ITree lTree, rTree;
    int currentValue;

    lTree = tree.left();
    rTree = tree.right();

    lResult = (lTree != null) ? preOrderTree(lTree) : new int[0];
    rResult = (rTree != null) ? preOrderTree(rTree) : new int[0];

    currentValue = tree.value();
    result = concatIntArr(new int[] {currentValue}, lResult, rResult);

    return result;
  }

  private int[] inOrderTree(ITree tree) {
    int[] result, lResult, rResult;
    ITree lTree, rTree;
    int currentValue;

    lTree = tree.left();
    rTree = tree.right();

    lResult = (lTree != null) ? inOrderTree(lTree) : new int[0];
    rResult = (rTree != null) ? inOrderTree(rTree) : new int[0];

    currentValue = tree.value();
    result = concatIntArr(lResult, new int[] {currentValue}, rResult);

    return result;
  }

  private int[] postOrderTree(ITree tree) {
    int[] result, lResult, rResult;
    ITree lTree, rTree;
    int currentValue;

    lTree = tree.left();
    rTree = tree.right();

    lResult = (lTree != null) ? postOrderTree(lTree) : new int[0];
    rResult = (rTree != null) ? postOrderTree(rTree) : new int[0];

    currentValue = tree.value();
    result = concatIntArr(lResult, rResult, new int[] {currentValue});

    return result;
  }

  private int[] concatIntArr(int[] a, int[] b, int[] c) {
    int[] result;

    result = new int[a.length + b.length + c.length];

    System.arraycopy(a, 0, result, 0, a.length);
    System.arraycopy(b, 0, result, a.length, b.length);
    System.arraycopy(c, 0, result, a.length + b.length, c.length);

    return result;
  }

  private boolean same(ITree t1, ITree t2) {
    if (t1 == null && t2 == null)
      return true;

    if (t1 == null || t2 == null)
      return false;

    if (t1.value() != t2.value())
      return false;

    if (!same(t1.left(), t2.left())) {
      return false;
    }

    if (!same(t1.right(), t2.right())) {
      return false;
    }

    return true;
  }
}
