package arrays.leetcode209;

/**
 * @Author darmon.pan
 * @Date 2021/4/4 22:30
 * @PACKAGE_NAME arrays.leetcode209
 * @Description:
 * 给定一个含有 n 个正整数的数组和一个正整数 target 。
 *
 * 找出该数组中满足其和 ≥ target 的长度最小的 连续子数组 [numsl, numsl+1, ..., numsr-1, numsr] ，并返回其长度。如果不存在符合条件的子数组，返回 0 。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/minimum-size-subarray-sum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    //滑动窗口，适合数组内小数组
    public int minSubArrayLen(int target, int[] nums) {
        int i = 0;
        int j = -1;//[i, j] 表示当前的滑窗在当前数组的范围, 初始j=-1保证数组无值
        int sum = 0;
        int result = nums.length + 1;//返回值
        while (i < nums.length -1) {
            if(j < nums.length - 1 && sum < target) {
                j++;
                sum += nums[j];
            } else {
                sum -= nums[i];
                i++;
            }
            if (sum >= target) {
                result = result >  j - i + 1 ?  j - i + 1 : result;
            }
        }
        if (result == nums.length + 1) {
            return 0;
        }
        return result;
    }

    public static void main(String[] args) {
        int i = 7;
        int[] nums = {2,3,1,2,4,3};
        Solution solution = new Solution();
        solution.minSubArrayLen(7, nums);
    }
}
