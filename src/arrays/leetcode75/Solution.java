package arrays.leetcode75;

/**
 * @Author darmon.pan
 * @Date 2021/4/4 19:03
 * @PACKAGE_NAME arrays.leetcode75
 * @Description:
 *
 * 给定一个包含红色、白色和蓝色，一共 n 个元素的数组，原地对它们进行排序，使得相同颜色的元素相邻，并按照红色、白色、蓝色顺序排列。
 *
 * 此题中，我们使用整数 0、 1 和 2 分别表示红色、白色和蓝色。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/sort-colors
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

//三路快排
public class Solution {
    //时间复杂度O(n)
    //空间复杂度O(1)
    public void sortColors(int[] nums) {
        int zero = -1; //nums[0...zero] == 0
        int two = nums.length; //nums[two...nums.length] == 2
        int i = 0;
        while (i < two) { //这里的范围必须为two 不然变量到two之后会与之前的元素交换出现错误
            if(nums[i] == 0) {
                zero ++;
                int j = nums[zero];
                nums[zero] = nums[i];
                nums[i] = j;
                i++;
            } else if (nums[i] == 2) {
                two--;
                int j = nums[two];
                nums[two] = nums[i];
                nums[i] = j;
            } else {
                i++;
            }
        }
    }

    public static void main(String[] args) {
        int[]  arr = {2,0,2,1,1,0};
        Solution solution = new Solution();
        solution.sortColors(arr);
        System.out.println(arr.length);
    }
}
