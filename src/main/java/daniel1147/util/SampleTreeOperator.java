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

  public void setRootNull() {
    root = null;
  }
}
