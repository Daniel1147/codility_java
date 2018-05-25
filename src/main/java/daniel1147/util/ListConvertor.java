package daniel1147.util;

import java.util.Queue;
import java.util.LinkedList;

public class ListConvertor {
  public int[] toIntArray(IListNode head) {
    Queue<Integer> q;
    IListNode current;

    current = head;
    q = new LinkedList<Integer>();
    while (current != null) {
      q.add(current.value());
      current = current.next();
    }

    return q.stream().mapToInt(i->i).toArray();
  }
}
