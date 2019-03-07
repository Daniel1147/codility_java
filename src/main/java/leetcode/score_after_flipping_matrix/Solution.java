package leetcode.score_after_flipping_matrix;

import java.util.*;

class Solution {
  public int matrixScore(int[][] A) {
    int cnt;

    for (int i = 0; i < A.length; i++) {
      if (A[i][0] != 1) {
        rowFlip(A, i);
      }
    }

    for (int i = 0; i < A[0].length; i++) {
      cnt = countOnesInColumn(A, i);
      if (A.length - cnt > cnt)
        columnFlip(A, i);
    }

    return calculateScore(A);
  }

  private void rowFlip(int[][] A, int i) {
    for (int j = 0; j < A[i].length; j++) {
      if (A[i][j] == 0)
        A[i][j] = 1;
      else
        A[i][j] = 0;
    }
    return;
  }

  private void columnFlip(int[][] A, int i) {
    for (int j = 0; j < A.length; j++) {
      if (A[j][i] == 0)
        A[j][i] = 1;
      else
        A[j][i] = 0;
    }
    return;
  }

  private int countOnesInColumn(int[][] A, int i) {
    int cnt = 0;
    for (int j = 0; j < A.length; j++) {
      if (A[j][i] == 1)
        cnt++;
    }

    return cnt;
  }

  private int calculateScore(int[][] A) {
    int score = 0;
    for (int i = 0; i < A.length; i++)
      score += calculateRow(A[i]);

    return score;
  }

  private int calculateRow(int[] A) {
    int score = 0;
    for (int i = 0; i < A.length; i++) {
      score = score * 2 + A[i];
    }

    return score;
  }
}
