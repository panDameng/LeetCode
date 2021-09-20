package arrays.leetcode167;

/**
 * @Author darmon.pan
 * @Date 2021/4/4 20:49
 * @PACKAGE_NAME arrays.leetcode167
 * @Description:
 *  * 给定一个已按照 升序排列  的整数数组 numbers ，请你从数组中找出两个数满足相加之和等于目标数 target 。
 *  *
 *  * 函数应该以长度为 2 的整数数组的形式返回这两个数的下标值。numbers 的下标 从 1 开始计数 ，所以答案数组应当满足 1 <= answer[0] < answer[1] <= numbers.length 。
 *  *
 *  * 你可以假设每个输入只对应唯一的答案，而且你不可以重复使用相同的元素。
 *  *
 *  * 来源：力扣（LeetCode）
 *  * 链接：https://leetcode-cn.com/problems/two-sum-ii-input-array-is-sorted
 *  * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution2 {
    //对撞指针   有序情况下 前后值一起进行对比之后按情况移动
    //时间复杂度 O(n)
    //空间复杂度 O(1)
    public int[] twoSum(int[] numbers, int target){
        int i = 0;
        int j = numbers.length - 1;
        int[] result = new int[2];
        while (i < j) {
            if (numbers[i] + numbers[j] == target) {
                result[0] = i + 1;
                result[1] = j + 1;
                return result;
            } else if (numbers[i] + numbers[j] > target) {
                j--;
            } else {
                i++;
            }
        }
        return null;
    }
}
