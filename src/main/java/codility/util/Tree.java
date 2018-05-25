package codility.util;

import java.util.*;
import daniel1147.util.ITree;

public class Tree implements ITree {
  public int x;
  public Tree l;
  public Tree r;

  public Tree(int x) {
    this.x = x;
  }

  public ITree left() {
    return l;
  }

  public ITree right() {
    return r;
  }

  public int value() {
    return x;
  }

  public ITree lAppend(int value) {
    l = create(value);

    return l;
  }

  public ITree rAppend(int value) {
    r = create(value);

    return r;
  }

  public void lAppendNull() {
    l = null;
  }

  public void rAppendNull() {
    r = null;
  }

  private Tree create(int value) {
    return new Tree(value);
  }
}
