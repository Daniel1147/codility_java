package daniel1147.util;

public class ListBuilder {
  private IListNode head;

  public ListBuilder(IListNode head) {
    this.head = head;
  }

  public IListNode fromNumArray(int[] num) {
    IListNode current;

    if (num.length == 0) {
      head.appendNull();
      return null;
    }

    head.setValue(num[0]);
    current = head;

    for (int i = 1;i < num.length; i++) {
      current.append(num[i]);
      current = current.next();
    }

    return head;
  }
}
