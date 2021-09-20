package arrays.leetcode283;

import java.util.Arrays;

/**
 * @Author darmon.pan
 * @Date 2021/4/4 16:09
 * @PACKAGE_NAME PACKAGE_NAME
 * @Description: 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 */
public class Solution {
    public void moveZeroes(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                j++;
            }
        }
        int[] noneZero = new int[j];
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                noneZero[k] = nums[i];
                k++;
            }
        }
        for (int i = 0; i < noneZero.length; i++) {
            nums[i] = noneZero[i];
        }
        for (int i = noneZero.length; i < nums.length; i++) {
            nums[i] = 0;
        }
        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        Solution solution = new Solution();
        solution.moveZeroes(nums);
    }
}
