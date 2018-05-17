package common;

/**
 * Created by lyn on 18-3-17.
 */
public class Swap {
    public int a;
    public static void swapNum(int[] array,int i1,int i2){
        int temp = array[i1];
        array[i1]= array[i2];
        array[i2]=temp;
    }
}
