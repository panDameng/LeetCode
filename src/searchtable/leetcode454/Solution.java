package searchtable.leetcode454;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author darmon.pan
 * @Date 2021/4/10 18:34
 * @PACKAGE_NAME searchtable.leetcode454
 * @Description:
 *
 * 给定四个包含整数的数组列表 A , B , C , D ,计算有多少个元组 (i, j, k, l) ，使得 A[i] + B[j] + C[k] + D[l] = 0。
 *
 * 为了使问题简单化，所有的 A, B, C, D 具有相同的长度 N，且 0 ≤ N ≤ 500 。所有整数的范围在 -228 到 228 - 1 之间，最终结果不会超过 231 - 1 。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/4sum-ii
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    //由于0 ≤ N ≤ 500，所以n^2的算法可以接收
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums3.length; i++) {
            for (int j = 0; j < nums4.length; j++) {
                if(!map.containsKey(nums3[i] + nums4[j])) {
                    map.put(nums3[i] + nums4[j], 1);
                } else {
                    map.put(nums3[i] + nums4[j], map.get(nums3[i] + nums4[j]) + 1);
                }
            }
        }
        int result = 0;
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (map.containsKey( - nums1[i] - nums2[j])) {
                    result =  map.get(-(nums1[i] + nums2[j])) + result;
                }
            }
        }
        return result;
    }
}
