package codility.median_of_two_sorted_arrays;

import java.util.*;

class Solution {
  public double findMedianSortedArrays(int[] num1, int[] num2) {
    double ans;

    if ((num1.length + num2.length) % 2 == 1)
      ans = getMiddle(num1, num2);
    else
      ans = getAvgMiddle(num1, num2);

    return ans;
  }

  private double getMiddle(int[] num1, int[] num2) {
    int target, count, index1, index2, iter;

    index1 = 0;
    index2 = 0;
    count = 0;
    target = (num1.length + num2.length + 1) / 2;

    while (index1 < num1.length || index2 < num2.length) {
      count++;
      if (index1 == num1.length) {
        iter = num2[index2];
        index2++;
      } else if (index2 == num2.length) {
        iter = num1[index1];
        index1++;
      } else if (num1[index1] > num2[index2]) {
        iter = num2[index2];
        index2++;
      } else {
        iter = num1[index1];
        index1++;
      }

      if (count == target)
        return iter;
    }

    return -1.0;
  }

  private double getAvgMiddle(int[] num1, int[] num2) {
    int target1, target2, count, index1, index2, iter, mid1, mid2;

    index1 = index2 = 0;
    mid1 = mid2 = 0;
    count = 0;
    target1 = (num1.length + num2.length) / 2;
    target2 = target1 + 1;

    while (index1 < num1.length || index2 < num2.length) {
      count++;
      if (index1 == num1.length) {
        iter = num2[index2];
        index2++;
      } else if (index2 == num2.length) {
        iter = num1[index1];
        index1++;
      } else if (num1[index1] > num2[index2]) {
        iter = num2[index2];
        index2++;
      } else {
        iter = num1[index1];
        index1++;
      }

      if (count == target1)
        mid1 = iter;

      if (count == target2) {
        mid2 = iter;
        return ((double)mid1 + (double)mid2) / 2;
      }
    }

    return -1.0;
  }
}
