package daniel1147.util;

public interface ITree {
  public ITree left();
  public ITree right();
  public int value();
  public ITree lAppend(int value);
  public ITree rAppend(int value);
  public void lAppendNull();
  public void rAppendNull();
}
