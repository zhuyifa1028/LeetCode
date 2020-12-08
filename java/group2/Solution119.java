package group2;

// 给定一个非负索引 k，其中 k ≤ 33，返回杨辉三角的第 k 行。
//
// 在杨辉三角中，每个数是它左上方和右上方的数的和。
//
// 示例:
//
//   输入: 3
//   输出: [1,3,3,1]
//
// 进阶：
//
//   你可以优化你的算法到 O(k) 空间复杂度吗？
//
// 来源：力扣（LeetCode）
// 链接：https://leetcode-cn.com/problems/pascals-triangle-ii
// 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。

import java.util.ArrayList;
import java.util.List;

/**
 * 119. 杨辉三角 II
 *
 * @author zhuyifa
 * @version 2020-12-08
 */
public class Solution119 {

    public static void main(String[] args) {
        int numRows = 3;

        System.out.println("输入：" + numRows);
        System.out.println("输出：" + getRow(numRows));
    }

    public static List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();

        for (int i = 0; i <= rowIndex; i++) {
            row.add(1);
            for (int j = i - 1; j > 0; j--) {
                int left = row.get(j - 1);
                int right = row.get(j);
                row.set(j, left + right);
            }
        }
        return row;
    }

}
