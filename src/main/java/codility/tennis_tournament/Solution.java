package codility.tennis_tournament;

import java.util.Arrays;

class Solution {
  public int solution(int P, int C) {
    int a, b;
    a = P / 2;
    b = C;

    return (a > b) ? b : a;
  }
}
