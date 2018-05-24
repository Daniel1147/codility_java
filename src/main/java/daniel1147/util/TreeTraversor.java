package daniel1147.util;

class TreeTraversor
{
  private ITree tree;

  public TreeTraversor(ITree tree) {
    this.tree = tree;
  }

  public int[] preOrder() {
    return preOrderTree(tree);
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

  private int[] concatIntArr(int[] a, int[] b, int[] c) {
    int[] result;

    result = new int[a.length + b.length + c.length];

    System.arraycopy(a, 0, result, 0, a.length);
    System.arraycopy(b, 0, result, a.length, b.length);
    System.arraycopy(c, 0, result, a.length + b.length, c.length);

    return result;
  }
}
