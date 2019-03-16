package leetcode.util;

import daniel1147.util.ListBuilder;

public class LeetcodeListNodeBuilder {
  public ListNode fromIntArray(int[] num) {
    ListNode result;
    ListNodeOperator operator = new ListNodeOperator();
    ListBuilder lb = new ListBuilder(operator);
    lb.fromNumArray(num);

    return operator.getConcreteRoot();
  }
}
