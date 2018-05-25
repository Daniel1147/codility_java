package daniel1147.util;

public class ListBuilder {
  private IListNodeOperator o;

  public ListBuilder(IListNodeOperator o) {
    this.o = o;
  }

  public IListNode fromNumArray(int[] num) {
    IListNode current, head;

    for (int i = 0;i < num.length; i++) {
      o.add(num[i]);
    }

    return o.getListNodeRoot();
  }
}
