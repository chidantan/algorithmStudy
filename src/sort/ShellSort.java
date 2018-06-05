package sort;

import common.Constants;
import common.Swap;

import java.util.Arrays;

public class ShellSort {
    public static void main(String[] args) {
        shellSort(Constants.INT_ARRAY);
        System.out.println(Arrays.toString(Constants.INT_ARRAY));
    }

    public static void shellSort(int[] array) {
        int k = (array.length - 1)/2;
        while (k >= 1) {
            for (int p = 0; p <= k; p++) {
                for (int i = p; i < array.length - k; i += k) {
                    for (int j = i + k; j > k-1 && array[j] < array[j - k]; j -= k) {
                        Swap.swapNum(array, j, j - k);
                    }
                }
            }
            k = k / 2;
        }
    }
}
