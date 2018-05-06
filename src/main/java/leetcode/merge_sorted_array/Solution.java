package leetcode.merge_sorted_array;

import java.util.*;

class Solution {
  public void merge(int[] nums1, int m, int[] nums2, int n) {
    int index1, index2, indexMerge;
    int[] result;

    result = nums1;
    nums1 = new int[m];
    System.arraycopy(result, 0, nums1, 0, m);

    // System.out.println(Arrays.toString(nums1));
    // System.out.println(Arrays.toString(nums2));

    index1 = 0;
    index2 = 0;

    while (index1 + index2 < m + n) {
      indexMerge = index1 + index2;
      if (index1 == m) {
        result[indexMerge] = nums2[index2];
        index2++;

        continue;
      }

      if (index2 == n) {
        result[indexMerge] = nums1[index1];
        index1++;

        continue;
      }

      if (nums1[index1] > nums2[index2]) {
        result[indexMerge] = nums2[index2];
        index2++;

        continue;
      }

      result[indexMerge] = nums1[index1];
      index1++;
    }
  }
}
