package daniel1147.util;

public class SampleListNodeOperator implements IListNodeOperator {
  SampleListNode root, tail;

  public SampleListNodeOperator() {
    root = null;
    tail = null;
  }

  public IListNode getListNodeRoot() {
    return root;
  }

  public SampleListNode getSampleListNodeRoot() {
    return root;
  }

  public void add(int value) {
    if (root == null) {
      root = create(value);
      tail = root;

      return;
    }

    SampleListNode newNode;

    newNode = create(value);
    tail.next = newNode;
    tail = newNode;
  }

  private SampleListNode create(int value) {
    return new SampleListNode(value);
  }
}
