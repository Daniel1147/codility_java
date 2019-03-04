package leetcode.flipping_an_image;

import java.util.*;

class Solution {
  public int[][] flipAndInvertImage(int[][] A) {
    int pixel;
    int columnLen = A[0].length;
    int[][] result = new int[A.length][];
    for (int i = 0; i < A.length; i++) {
      result[i] = new int[columnLen];
    }

    for (int i = 0; i < A.length; i++) {
      for (int j = 0; j < A[i].length; j++) {
        if (A[i][j] == 0) {
          pixel = 1;
        } else {
          pixel = 0;
        }

        result[i][columnLen - j - 1] = pixel;
      }
    }

    return result;
  }
}
