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

  public ITree lAppend(int value) {
    SampleTree n = create(value);
    lt = n;

    return n;
  }

  public ITree rAppend(int value) {
    SampleTree n = create(value);
    rt = n;

    return n;
  }

  public void lAppendNull()
  {
    lt = null;
  }

  public void rAppendNull()
  {
    rt = null;
  }

  private SampleTree create(int value) {
    return new SampleTree(value);
  }
}
