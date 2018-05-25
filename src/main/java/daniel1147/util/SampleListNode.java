package daniel1147.util;

class SampleListNode implements IListNode {
  int v;
  SampleListNode next;

  public SampleListNode(int value) {
    v = value;
  }

  public int value() {
    return v;
  }

  public void setValue(int value) {
    v = value;
  }

  public void appendNull() {
    next = null;
  }

  public IListNode next() {
    return next;
  }

  public IListNode append(int value) {
    next = create(value);

    return next;
  }

  private SampleListNode create(int value) {
    return new SampleListNode(value);
  }
}
