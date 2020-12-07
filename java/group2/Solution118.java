package group2;

// 给定一个非负整数 numRows，生成杨辉三角的前 numRows 行。
//
// 在杨辉三角中，每个数是它左上方和右上方的数的和。
//
// 示例:
//
//   输入: 5
//   输出:
//   [
//         [1],
//        [1,1],
//       [1,2,1],
//      [1,3,3,1],
//     [1,4,6,4,1]
//   ]
//
// 来源：力扣（LeetCode）
// 链接：https://leetcode-cn.com/problems/pascals-triangle
// 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。

import java.util.ArrayList;
import java.util.List;

/**
 * 118. 杨辉三角
 *
 * @author zhuyifa
 * @version 2020-12-07
 */
public class Solution118 {

    public static void main(String[] args) {
        int numRows = 5;

        System.out.println("输入：" + numRows);
        System.out.println("输出：" + generate(numRows));
    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ret = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || i == j) {
                    row.add(1);
                } else {
                    int left = ret.get(i - 1).get(j - 1);
                    int right = ret.get(i - 1).get(j);
                    row.add(left + right);
                }
            }
            ret.add(row);
        }
        return ret;
    }

}
