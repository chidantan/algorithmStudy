package sort;

import common.Constants;

import java.util.Arrays;

/**
 * Created by lyn on 18-3-22.
 */
public class RadixSort {
    public static void main(String[] args) {
        radixSort(Constants.INT_ARRAY,10,2);
        System.out.println(Arrays.toString(Constants.INT_ARRAY));
    }
    public static void radixSort(int[]a,int r,int k){
        int[] cnt = new int[r];
        int[] temp = new int[a.length];
        for (int i = 0 , rtok = 1 ;i<k;i++,rtok = rtok *r){
            for (int j=0;j<cnt.length;j++){
                cnt[j] = 0;
            }
            for (int j = 0;j<a.length;j++){
                cnt[(a[j]/rtok)%r]++;
            }
            for (int j = 1;j<a.length;j++){
                cnt[j] = cnt[j-1]+cnt[j];
            }
            for (int j =0;j<a.length;j++){
                cnt[(a[j]/rtok)%r]--;
                temp[cnt[(a[j]/rtok)%r]] = a[j];
            }
            for (int j=0;j<a.length;j++){
                a[j] = temp[j];
            }
        }
    }


































//    public static void radixSort(int[]a,int k ,int r){
//        int[] cnt = new int[r];
//        int[] temp = new int[a.length];
//        for (int i=0,rtok=1;i<k;i++,rtok = rtok*r){
//            for (int j=0;j<cnt.length;j++){
//                cnt[j] = 0;
//            }
//            for (int j=0;j<a.length;j++){
//                cnt[(a[j]/rtok)%r]++;
//            }
//            for (int j=1;j<a.length;j++){
//                cnt[j] = cnt[j]+cnt[j-1];
//            }
//            for (int j=0;j<a.length;j++){
//                cnt[(a[j]/rtok)%r]--;
//                temp[cnt[(a[j]/rtok)%r]] = a[j];
//            }
//            for (int j=0;j<a.length;j++){
//                a[j] = temp[j];
//            }
//        }
//    }
}
