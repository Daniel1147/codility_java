package daniel1147.util;

class SampleTreeOperator implements ITreeOperator {
  private SampleTree root;

  public ITree getITree() {
    return root;
  }

  public SampleTree getSampleTree() {
    return root;
  }

  public ITree initRoot(int value) {
    root = new SampleTree(value);

    return root;
  }

  public ITree lAppend(ITree parent, int value) {
    SampleTree n = (SampleTree) parent;
    n.lt = create(value);

    return n.lt;
  }

  public ITree rAppend(ITree parent, int value) {
    SampleTree n = (SampleTree) parent;
    n.rt = create(value);

    return n.rt;
  }

  public void lAppendNull(ITree parent) {
    SampleTree n = (SampleTree) parent;
    n.lt = null;
  }

  public void rAppendNull(ITree parent) {
    SampleTree n = (SampleTree) parent;
    n.rt = null;
  }

  public void setRootNull() {
    root = null;
  }

  private SampleTree create(int value) {
    return new SampleTree(value);
  }
}
