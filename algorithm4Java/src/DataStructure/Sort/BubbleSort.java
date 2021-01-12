package DataStructure.Sort;

import org.junit.Test;
import java.util.Arrays;

public class BubbleSort {

    /**
     * @param a
     * @param i
     * @param j 功能 ：  交换一数组中两个位置的数据
     */
    private static void exch(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    /**
     * @param v
     * @param w
     * @return 功能：   返回两个数字中较大的
     */
    private static boolean greater(int v, int w) {
        return v > w;
    }

    /**
     *
     */
    public static void Sort(int[] arr) {
        //外层循环控制排序的趟数
        for (int i = 0; i < arr.length - 1; i++) {
            //内层循环负责将本趟大的数沉底
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (greater(arr[j], arr[j + 1])) {
                    exch(arr, j, j + 1);
                }
            }
        }
    }

    @Test
    public void test() {
            int[] arr = {4, 5, 6, 3, 2, 1};
            BubbleSort.Sort(arr);
            System.out.println(Arrays.toString(arr));
    }
}

