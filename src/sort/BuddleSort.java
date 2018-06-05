package sort;

import common.Constants;
import common.Swap;

import java.util.Arrays;

/**
 * Created by lyn on 18-3-23.
 */
public class BuddleSort {
    public static void main(String[] args) {
        buddleSort(Constants.INT_ARRAY);
        System.out.println(Arrays.toString(Constants.INT_ARRAY));
    }

    public static void buddleSort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = a.length - 1; j > i; j--) {
                if (a[j] < a[j - 1]) {
                    Swap.swapNum(a, j, j - 1);
                }
            }
        }
    }
}
