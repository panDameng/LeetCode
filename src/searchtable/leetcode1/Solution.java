package searchtable.leetcode1;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author darmon.pan
 * @Date 2021/4/10 17:11
 * @PACKAGE_NAME searchtable.leetcode1
 * @Description:
 * 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 的那 两个 整数，并返回它们的数组下标。
 *
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
 *
 * 你可以按任意顺序返回答案
 * 输入：nums = [2,7,11,15], target = 9
 * 输出：[0,1]
 * 解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1]
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/two-sum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    //通过map<值，索引方式>进行查找表
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            //3+3=6的情况
            if (map.containsKey(nums[i]) && target == nums[i] * 2) {
                result[0] = map.get(nums[i]);
                result[1] = i;
                return result;
            }
            map.put(nums[i], i);
            int complement = target - nums[i];
            //二次重复值判断排除
            if (map.containsKey(complement) && !map.get(complement).equals(map.get(nums[i]))) {
                result[0] = map.get(complement);
                result[1] = map.get(nums[i]);
                return result;
            }
        }
        return null;
    }

    public int[] twoSum1(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
            int complement = target - nums[i];
            if (map.containsKey(complement) && !map.get(complement).equals(map.get(nums[i]))) {
                result[0] = map.get(complement);
                result[1] = map.get(nums[i]);
                return result;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] a ={3, 3};
        solution.twoSum(a, 6);
    }
}
