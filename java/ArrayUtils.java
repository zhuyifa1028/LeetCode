import java.util.Random;

/**
 * 数组工具类
 *
 * @author zhuyifa
 * @version 2020-11-16
 */
public class ArrayUtils {

    public static int[] randomInt(int bound, int length) {
        int[] array = new int[length];

        Random random = new Random();
        for (int i = 0; i < length; i++) {
            array[i] = random.nextInt(bound);
        }
        return array;
    }

}
