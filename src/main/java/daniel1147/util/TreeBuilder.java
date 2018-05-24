package daniel1147.util;

import java.util.*;

public class TreeBuilder {
  private static final String nullNode = "x";
  private ITreeOperator o;

  public TreeBuilder(ITreeOperator o) {
    this.o = o;
  }

  public void levelOrderConstruct(String s) {
    if (s.equals("")) {
      o.setRootNull();

      return;
    }

    // handle string
    String[] nodeStrList;
    Queue<String> q;

    nodeStrList = s.split(" ");
    q = new ArrayDeque<String>(Arrays.asList(nodeStrList));

    // init root
    String nodeStr;
    ITree root, node, parentNode;
    Queue<ITree> nodeQ;

    nodeQ = new ArrayDeque<ITree>();
    nodeStr = q.poll();
    if (nodeStr.equals(nullNode))
      return;

    root = o.initRoot(parseStr(nodeStr));
    nodeQ.add(root);

    // process child
    while(!q.isEmpty()) {
      nodeStr = q.poll();
      parentNode = nodeQ.poll();
      if (!nodeStr.equals(nullNode)) {
        node = parentNode.lAppend(parseStr(nodeStr));
        nodeQ.add(node);
      } else {
        parentNode.lAppendNull();
      }

      if (q.isEmpty())
        break;

      nodeStr = q.poll();
      if (!nodeStr.equals(nullNode)) {
        node = parentNode.rAppend(parseStr(nodeStr));
        nodeQ.add(node);
      } else {
        parentNode.rAppendNull();
      }
    }
  }

  private int parseStr(String s) {
    return Integer.parseInt(s);
  }
}
