package arrays.leetcode283;

/**
 * @Author darmon.pan
 * @Date 2021/4/4 16:52
 * @PACKAGE_NAME leetcode283
 * @Description: 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 */
public class Solution2 {
    public void moveZeroes(int[] nums) {
        int k = 0;//表示[0, k)区间的数都不为0
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != 0) {
                if(i!=k) {
                    int j = nums[i];
                    nums[i] = nums[k];
                    nums[k] = j;
                } else {
                    k++;
                }
            }
        }
    }
}
