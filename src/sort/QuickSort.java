package sort;

import common.Constants;

import java.util.Arrays;

/**
 * Created by lyn on 18-3-16.
 */
public class QuickSort {

    public static void main(String[] args) {
        quickSort(Constants.INT_ARRAY, 0, Constants.INT_ARRAY.length - 1);
        System.out.println(Arrays.toString(Constants.INT_ARRAY));
    }

    public static void quickSort(int[] array, int low, int high) {
        if (low >= high) {
            return;
        }
        int l = low;
        int h = high;
        int temp = array[low];
        while (l < h) {
            while (l < h && array[h] > temp) {
                h--;
            }
            array[l] = array[h];
            while (l < h && array[low] <= temp) {
                l++;
            }
            array[h] = array[l];
        }
        array[l] = temp;
        quickSort(array,low,l-1);
        quickSort(array,l+1,high);
    }


//    public static void quickSort(int[] array,int low,int high){
//        if(low>=high){
//            return;
//        }
//        int l = low;
//        int h = high;
//        int temp = array[low];
//        while (l<h){
//            while (l<h&&array[h]>=temp){
//                h--;
//            }
//            array[l] = array[h];
//
//            while (l<h&&array[l]<=temp){
//                l++;
//            }
//            array[h] = array[l];
//        }
//        array[l] = temp;
//
//        quickSort(array,low,l-1);
//        quickSort(array,l+1,high);
//    }
}
