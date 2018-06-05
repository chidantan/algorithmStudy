package sort;

import common.Constants;

import java.util.Arrays;

/**
 * Created by lyn on 18-3-22.
 */
public class MergeSort {
    public static void main(String[] args) {
        mergeSort(Constants.INT_ARRAY,0,9);
        System.out.println(Arrays.toString(Constants.INT_ARRAY));
    }

    public static void mergeSort(int[] a, int low, int high) {
        if(low<high){
            int mid = (low+high)/2;
            mergeSort(a,low,mid);
            mergeSort(a,mid+1,high);
            mergeArray(a,low,high,mid);
        }
    }

    public static void mergeArray(int[] a, int low, int high, int mid) {
        int l = low;
        int h = high;
        int m = mid;
        int j = m + 1;
        int k = 0;

        int[] temp = new int[a.length];

        while (l <= mid && j <= h) {
            if (a[l] < a[j]) {
                temp[k] = a[l];
                l++;
                k++;
            } else {
                temp[k] = a[j];
                j++;
                k++;
            }
        }

        while (l <= mid) {
            temp[k] = a[l];
            l++;
            k++;
        }
        while (j <= h) {
            temp[k] = a[j];
            j++;
            k++;
        }

        for (int jj =0;jj<k;jj++){
            a[low+jj] = temp[jj];
        }

    }


//    public static void mergeSort(int[]a,int start,int end){
//        if(start<end){
//            int mid = (start+end)/2;
//            mergeSort(a,start,mid);
//            mergeSort(a,mid+1,end);
//            mergeArray(a,start,mid,end);
//        }
//    }
//
//    public static void mergeArray(int[] a,int start,int mid,int end){
//        int[] temp = new int[a.length];
//        int i =start;
//        int j =mid+1;
//        int n = end;
//        int k = 0;
//        while (i<=mid&&j<=n){
//            if(a[i]<=a[j]){
//                temp[k] = a[i];
//                k++;
//                i++;
//            }else {
//                temp[k] = a[j];
//                k++;
//                j++;
//            }
//        }
//        while (i<=mid){
//            temp[k] = a[i];
//            i++;
//            k++;
//        }
//        while (j<=n){
//            temp[k] = a[j];
//            j++;
//            k++;
//        }
//        for (int c=0;c<k;c++){
//            a[start+c] = temp[c];
//        }
//    }
}
