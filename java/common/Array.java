package common;

import java.util.Arrays;
import java.util.Random;

/**
 * 数组类
 *
 * @author zhuyifa
 * @version 2020-11-16
 */
public class Array {

    public static int[] randomInt(int bound, int length) {
        int[] array = new int[length];

        Random random = new Random();
        for (int i = 0; i < length; i++) {
            array[i] = random.nextInt(bound);
        }
        return array;
    }

    public static void main(String[] args) {
        int[] ints = randomInt(3, 3);
        System.out.println("输出: " + Arrays.toString(ints));
    }

}
