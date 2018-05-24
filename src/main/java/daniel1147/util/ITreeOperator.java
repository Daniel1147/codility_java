package daniel1147.util;

public interface ITreeOperator {
  public ITree initRoot(int value);
  public ITree lAppend(ITree parent, int value);
  public ITree rAppend(ITree parent, int value);
  public void lAppendNull(ITree parent);
  public void rAppendNull(ITree parent);
  public void setRootNull();
}
