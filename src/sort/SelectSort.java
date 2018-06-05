package sort;

import common.Constants;
import common.Swap;

import java.util.Arrays;

public class SelectSort {
    public static void main(String[] args) {
        selectSort(Constants.INT_ARRAY);
        System.out.println(Arrays.toString(Constants.INT_ARRAY));
    }

    public static void selectSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            Swap.swapNum(array,i,minIndex);
        }
    }
}
