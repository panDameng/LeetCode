package arrays.leetcode3;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @Author darmon.pan
 * @Date 2021/4/4 23:21
 * @PACKAGE_NAME arrays.leetcode3
 * @Description: 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 */
public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] freq = new int[256];
        int i = 0;
        int j = -1; //[i..j]表示滑动窗口的范围
        int res = 0;//返回值
        while (i < s.length()) {
            if (j + 1 < s.length() && freq[s.charAt(j + 1)] == 0) {
                j++;
                freq[s.charAt(j)]++;
            }else {
                freq[s.charAt(i)]--;
                i++;
            }
            res = res > j - i + 1 ? res : j - i + 1;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] freq = new int[256];
        Solution solution = new Solution();
        String s = "abcabcbb";
        solution.lengthOfLongestSubstring(s);
        freq[s.charAt(3)] = 10;
        System.out.println(s.charAt(3));
        System.out.println(Arrays.toString(freq));

    }
}
