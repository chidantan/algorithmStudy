package famous;

import common.Constants;

/**
 * 二分查找
 */
public class BinarySearch {
    private static final int TARGET = 5;

    public static void main(String[] args) {
        System.out.println(binarySearch(Constants.ORDERED_INT_ARRAY, 0, Constants.ORDERED_INT_ARRAY.length - 1, TARGET));
    }

    private static int binarySearch(int[] array, int low, int high, int target) {
        if (low > high) {
            return -1;
        }
        int middle = (low + high) >>> 1;
        if (array[middle] > target) {
            return binarySearch(array, low, middle - 1, target);
        } else if (array[middle] < target) {
            return binarySearch(array, middle + 1, high, target);
        } else {
            return middle + 1;
        }
    }
}
