package codility.util;

import java.util.*;
import daniel1147.util.ITree;
import daniel1147.util.ITreeOperator;

public class TreeOperator implements ITreeOperator {
  Tree root;

  public TreeOperator() {
    root = null;
  }

  public Tree getTree() {
    return root;
  }

  public ITree getITree() {
    return root;
  }

  public ITree initRoot(int value) {
    root = new Tree(value);

    return root;
  }

  public void setRootNull() {
    root = null;
  }
}
