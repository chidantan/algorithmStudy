package sort;

import common.Constants;
import common.Swap;

import java.util.Arrays;

/**
 * Created by lyn on 18-3-22.
 */
public class HeapSort {

    public static void main(String[] args) {
        heapSort(Constants.INT_ARRAY,10);
        System.out.println(Arrays.toString(Constants.INT_ARRAY));
    }

    public static void heapSort(int[]a ,int n){
        buildMinHeap(a,n);
        for (int i = a.length-1;i>=0;i--){
            Swap.swapNum(a,0,i);
            minHeap(a,0,i);
        }
    }

    public static void buildMinHeap(int[]a,int n){
        for (int i = a.length/2;i>=0;i--){
            minHeap(a,i,n);
        }
    }

    public static void minHeap(int[]a,int i,int n){
        int j = 2 *i+1;
        while (j<n){
            if(j+1<n&&a[j+1]<a[j]){
                j++;
            }
            if(a[i]<=a[j]){
                return;
            }
            Swap.swapNum(a,i,j);
            i = j;
            j = 2*i+1;
        }
    }























//
//    public static void heapSort(int[] a){
//        createMinHeap(a);
//        for (int i = a.length-1;i>=0;i--){
//            Swap.swapNum(a,0,i);
//            minHeap(a,0,i);
//        }
//    }
//    public static void createMinHeap(int[] a){
//        for (int i = a.length/2;i>=0;i--){
//            minHeap(a,i,a.length);
//        }
//    }
//    public static void minHeap(int[]a,int i,int n){
//        int j = 2*i+1;
//        while (j<n){
//            if(j+1<n&&a[j+1]<a[j]){
//                j++;
//            }
//            if(a[i]<a[j]){
//                break;
//            }
//            Swap.swapNum(a,i,j);
//            i=j;
//            j=2*i+1;
//        }
//    }
}
