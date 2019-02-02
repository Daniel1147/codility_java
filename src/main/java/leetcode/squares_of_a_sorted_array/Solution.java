package leetcode.squares_of_a_sorted_array;

import java.util.*;

class Solution {
  public int[] sortedSquares(int[] A) {
    int mid, i, n, left, right, leftV, rightV;
    int[] ans;

    n = A.length;
    ans = new int[n];

    for (i = 0; i < n; i++)
      if (A[i] >= 0)
        break;

    left = i - 1;
    right = i;
    i = 0;

    while(left >= 0 && right < n) {
      leftV = A[left] * A[left];
      rightV = A[right] * A[right];

      if (leftV < rightV) {
        ans[i] = leftV;
        left--;
      } else {
        ans[i] = rightV;
        right++;
      }
      i++;
    }

    while(left >= 0) {
      ans[i] = A[left] * A[left];
      left--;
      i++;
    }

    while(right < n) {
      ans[i] = A[right] * A[right];
      right++;
      i++;
    }

    return ans;
  }
}
