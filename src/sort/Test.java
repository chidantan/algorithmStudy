package sort;

import common.Swap;

import java.lang.ref.WeakReference;

/**
 * Created by lyn on 18-3-22.
 */
public class Test {


    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9};
        int n = dd(a,8,0,8);
        System.out.println(n);

    }

    private static int dd(int[] a,int target,int start,int end){
        int mid = (start+end)>>>1;
        if(start>end){
            return -1;
        }
        if(a[mid]>target){
            end = mid-1;
            return dd(a,target,start,end);
        }else if(a[mid]<target){
            start = mid+1;
            return dd(a,target,start,end);
        }else {
            return mid;
        }
    }

}
