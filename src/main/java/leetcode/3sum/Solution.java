package leetcode._3sum;

import java.util.*;

class Solution {
  public List<List<Integer>> threeSum(int[] nums) {
    List<List<Integer>> result;
    int i1, i2, i3, sum, oldI1, oldI2, oldI3, layer1I3;

    result = new ArrayList<List<Integer>>();

    if (nums.length < 3)
      return result;

    Arrays.sort(nums);
    // System.out.println(Arrays.toString(nums));

    i1 = 0;
    layer1I3 = nums.length - 1;
    while (i1 < nums.length - 2) {
      i2 = i1 + 1;
      i3 = layer1I3;
      while (i2 < i3) {
        sum = -1 * (nums[i1] + nums[i2]);

        // find matched i3 and set i3 to last or the last one bigger than sum
        while (i3 > i2) {
          if (nums[i3] < sum) {
            // if (i3 < nums.length - 1)
            //   i3++;

            break;
          }

          // System.out.printf("a: %2d, b: %2d, c: %2d, i3: %2d, sum: %3d\n", nums[i1], nums[i2], nums[i3], i3, sum);

          if (nums[i3] == sum) {
            result.add(build(nums[i1], nums[i2], nums[i3]));
          }

          oldI3 = nums[i3];
          i3--;
          while (i3 > i2 && oldI3 == nums[i3])
            i3--;
        }

        if (i2 == i1 + 1)
          layer1I3 = i3;

        oldI2 = nums[i2];
        i2++;
        while (i2 < nums.length - 1 && nums[i2] == oldI2)
          i2++;

        // System.out.printf("i2: %2d, i3: %2d\n", i2, i3);
      }

      oldI1 = nums[i1];
      i1++;
      while (i1 < nums.length - 2 && nums[i1] == oldI1)
        i1++;
    }

    return result;
  }

  private List<Integer> build(int a, int b, int c) {
    List<Integer> result;

    result = new ArrayList<Integer>();
    result.add(a);
    result.add(b);
    result.add(c);

    return result;
  }
}
