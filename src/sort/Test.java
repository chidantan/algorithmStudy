package sort;

import common.Data;
import common.Swap;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by lyn on 18-3-22.
 */
public class Test {
    private Stack<Integer> stack2 = new Stack<Integer>();

    public static void main(String[] args) {
        System.out.println(new Solution().minNumberInRotateArray(Data.getRouteArrayData()));
    }
}

class Solution {
    public int minNumberInRotateArray(int[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }
        return getTarget(array, 0, array.length - 1);
    }
    //6501, 6828, 6963, 7036, 7422, 7674, 8146, 8468, 8704, 8717, 9170, 9359, 9719, 9895, 9896, 9913, 9962,
    // 154, 293, 334, 492, 1323, 1479, 1539, 1727, 1870, 1943, 2383, 2392, 2996, 3282, 3812, 3903, 4465, 4605, 4665, 4772, 4828, 5142, 5437, 5448, 5668, 5706, 5725, 6300, 6335
    private int getTarget(int[] array, int low, int high) {
        if(low >= high){
            return 0;
        }
        int mid = (low+high)/2;
        if(array[mid]<array[mid-1]){
            return array[mid];
        }else if(array[0]>=array[mid]){
            return getTarget(array,low,mid-1);
        }else{
            return getTarget(array,mid+1,high);
        }
    }
}