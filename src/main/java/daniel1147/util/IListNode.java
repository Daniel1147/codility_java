package daniel1147.util;

public interface IListNode {
  public int value();
  public void setValue(int value);
  public void appendNull();
  public IListNode next();
  public IListNode append(int value);
}
