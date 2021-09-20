package arrays.leetcode11;

import java.util.*;
import java.util.stream.Stream;

/**
 * @Author darmon.pan
 * @Date 2021/4/4 21:19
 * @PACKAGE_NAME arrays.leetcode11
 * @Description:
 * 给你 n 个非负整数 a1，a2，...，an，每个数代表坐标中的一个点 (i, ai) 。在坐标内画 n 条垂直线，垂直线 i 的两个端点
 * 分别为 (i, ai) 和 (i, 0) 。找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。
 *
 * 说明：你不能倾斜容器。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/container-with-most-water
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    //对撞指针
    public int maxArea(int[] height) {
        int i = 0;//数组左边滑动
        int j = height.length - 1;//数组右边滑动
        int high; //记录对撞成功时 短边宽度
        int length = height.length -1; //记录索引差值,在x轴1号数前的空间不存值的，所有长度最长为length -1
        int area = 0;
        while (i < j) {
            if (height[i] <= height[j]){
                high = i;
                area = area > length * height[high] ? area : length * height[high];
                length--;
                i++;

            } else if(height[i] > height[j]) {
                high =j;
                area = area > length * height[high] ? area : length * height[high];
                length--;
                j--;
            }
        }
        return area;
    }

    public static void main(String[] args) {
        int[] a = {1,8,6,2,5,4,8,3,7};
        Solution solution = new Solution();
        solution.maxArea(a);
    }
}
