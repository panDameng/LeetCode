package searchtable.leetcode219;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @Author darmon.pan
 * @Date 2021/4/10 20:46
 * @PACKAGE_NAME searchtable.leetcode219
 * @Description:
 * 给定一个整数数组和一个整数 k，判断数组中是否存在两个不同的索引 i 和 j，使得 nums [i] = nums [j]，并且 i 和 j 的差的 绝对值 至多为 k。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/contains-duplicate-ii
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    //滑动窗口加Map
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> map = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.contains(nums[i])) {
                return true;
            }
            map.add( nums[i]);
            if (map.size() == k+1) {
                map.remove(nums[i-k]);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] num = {1,2,3,1,2,3};
        solution.containsNearbyDuplicate(num, 0);
    }
}
