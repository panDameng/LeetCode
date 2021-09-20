package searchtable.leetcode349;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

/**
 * @Author darmon.pan
 * @Date 2021/4/10 15:21
 * @PACKAGE_NAME searchtable.leetcode349
 * @Description:
 *
 * 给定两个数组，编写一个函数来计算它们的交集。
 * 说明：
 *  输出结果中的每个元素一定是唯一的。
 *  我们可以不考虑输出结果的顺序。
 */
public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> setNums1 = new HashSet<Integer>();
        for (int i : nums1) {
            setNums1.add(i);
        }
        Set<Integer> setResult = new HashSet<Integer>();
        for (int i : nums2) {
            if (setNums1.contains(i)) {
                setResult.add(i);
            }
        }
        int[] result = new int[setResult.size()];
        int i = 0;
        for (Integer integer : setResult) {
            result[i] = integer;
            i++;
        }
        return result;
    }
}
