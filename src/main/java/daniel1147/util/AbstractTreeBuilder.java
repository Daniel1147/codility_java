package daniel1147.util;

import java.util.*;

public abstract class AbstractTreeBuilder {
  private static final String nullNode = "x";

  public void levelOrderConstruct(String s) {
    if (s.equals("")) {
      setRootNull();

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

    root = initRoot(parseStr(nodeStr));
    nodeQ.add(root);
    while(!q.isEmpty()) {
      nodeStr = q.poll();
      parentNode = nodeQ.poll();
      if (!nodeStr.equals(nullNode)) {
        node = lAppend(parentNode, parseStr(nodeStr));
        nodeQ.add(node);
      } else {
        lAppendNull(parentNode);
      }

      if (q.isEmpty())
        break;

      nodeStr = q.poll();
      if (!nodeStr.equals(nullNode)) {
        node = rAppend(parentNode, parseStr(nodeStr));
        nodeQ.add(node);
      } else {
        rAppendNull(parentNode);
      }
    }
  }

  abstract protected ITree initRoot(int value);
  abstract protected ITree lAppend(ITree parent, int value);
  abstract protected ITree rAppend(ITree parent, int value);
  abstract protected void lAppendNull(ITree parent);
  abstract protected void rAppendNull(ITree parent);
  abstract protected void setRootNull();

  private int parseStr(String s) {
    return Integer.parseInt(s);
  }
}
