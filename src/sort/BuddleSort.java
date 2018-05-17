package sort;

import common.Constants;

import java.util.Arrays;

/**
 * Created by lyn on 18-3-23.
 */
public class BuddleSort {
    public static void main(String[] args) {
        heapSort(Constants.INT_ARRAY);
        System.out.println(Arrays.toString(Constants.INT_ARRAY));
    }

    public static void heapSort(int[] a) {
        int n = a.length;
        while (true) {
            n = n / 2;
            for (int k = 0; k < n; k++) {
                for (int i = k+n; i < a.length; i+=n) {
                    int temp = a[i];
                    int j;
                    for (j = i - n; j >= 0; j-=n) {
                        if (a[j] > temp) {
                            a[j + n] = a[j];
                        } else {
                            break;
                        }
                    }
                    a[j + n] = temp;
                }
            }
            if (n == 1) {
                break;
            }
        }
    }
}
