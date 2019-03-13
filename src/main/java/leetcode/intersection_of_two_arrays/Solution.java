package leetcode.intersection_of_two_arrays;

import java.util.*;

class Solution {
  public int[] intersection(int[] nums1, int[] nums2) {
    int i1, i2, count;
    int[] result;

    Arrays.sort(nums1);
    Arrays.sort(nums2);

    if (nums1.length > nums2.length)
      result = new int[nums1.length];
    else
      result = new int[nums2.length];

    i1 = 0;
    i2 = 0;
    count = 0;

    while (i1 < nums1.length && i2 < nums2.length) {
      if (nums1[i1] == nums2[i2]) {
        result[count] = nums1[i1];
        count++;

        i1++;
        while (i1 < nums1.length && nums1[i1] == nums1[i1 - 1])
          i1++;

        i2++;
        while (i2 < nums2.length && nums2[i2] == nums2[i2 - 1])
          i2++;
      } else if (nums1[i1] < nums2[i2]) {
        i1++;
        while (i1 < nums1.length && nums1[i1] == nums1[i1 - 1])
          i1++;
      } else {
        i2++;
        while (i2 < nums2.length && nums2[i2] == nums2[i2 - 1])
          i2++;
      }
    }

    return Arrays.copyOfRange(result, 0, count);
  }
}
