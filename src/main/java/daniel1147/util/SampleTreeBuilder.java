package daniel1147.util;

class SampleTreeBuilder extends AbstractTreeBuilder {
  private SampleTree root;

  public ITree getITree() {
    return root;
  }

  public SampleTree getSampleTree() {
    return root;
  }

  protected ITree initRoot(int value) {
    root = new SampleTree(value);

    return root;
  }

  protected ITree lAppend(ITree parent, int value) {
    SampleTree n = (SampleTree) parent;
    n.lt = create(value);

    return n.lt;
  }

  protected ITree rAppend(ITree parent, int value) {
    SampleTree n = (SampleTree) parent;
    n.rt = create(value);

    return n.rt;
  }

  protected void lAppendNull(ITree parent) {
    SampleTree n = (SampleTree) parent;
    n.lt = null;
  }

  protected void rAppendNull(ITree parent) {
    SampleTree n = (SampleTree) parent;
    n.rt = null;
  }

  protected void setRootNull() {
    root = null;
  }

  private SampleTree create(int value) {
    return new SampleTree(value);
  }
}
