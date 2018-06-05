package sort;

import common.Constants;
import common.Swap;

import java.util.Arrays;

public class InsertSort {
    public static void main(String[] args) {
        insert(Constants.INT_ARRAY);
        System.out.println(Arrays.toString(Constants.INT_ARRAY));
    }

    public static void insert(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j > 0 && array[j] < array[j - 1]; j--) {
                Swap.swapNum(array, j, j - 1);
            }
        }
    }
}
