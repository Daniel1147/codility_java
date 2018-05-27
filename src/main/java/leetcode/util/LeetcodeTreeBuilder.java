package leetcode.util;

import daniel1147.util.TreeBuilder;
import leetcode.util.TreeNodeOperator;

public class LeetcodeTreeBuilder {
  TreeNodeOperator tno;
  TreeBuilder tb;

  public LeetcodeTreeBuilder() {
    tno = new TreeNodeOperator();
    tb = new TreeBuilder(tno);
  }

  public TreeNode levelOrderConstruct(String s) {
    tb.levelOrderConstruct(s);

    return tno.getTreeNode();
  }
}
