package daniel1147.util;

class SampleTree implements ITree {
  SampleTree lt, rt;
  int v;

  public SampleTree(int value) {
    v = value;
  }

  public ITree left() {
    return lt;
  }

  public ITree right() {
    return rt;
  }

  public int value() {
    return v;
  }
}
