package daniel1147.util;

public class ListNodeComparator {
  public boolean same(IListNode a, IListNode b) {
    while (a != null && b != null) {
      if (a.value() != b.value())
        return false;
      a = a.next();
      b = b.next();
    }

    if (a == null && b == null)
      return true;

    return false;
  }
}
