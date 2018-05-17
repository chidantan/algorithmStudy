/**
 * Created by lyn on 18-3-30.
 */
public class YaobaoList {
    int[] aa = new int[16];
    int currentIndex = 0;

    public void add(int data) {
        aa[currentIndex++] = data;
    }

    public int size(){
        return currentIndex;
    }
    public int add(int data, int index) {
        if(index>currentIndex){
            return -1;
        }else {
            ff(index);
            aa[index] = data;
            currentIndex++;
            return data;
        }
    }

    private void ff(int j){
        for (int i =j;i<currentIndex;i++){
            aa[i+1] = aa[i];
        }
    }

    public int get(int index) {
        if (index < currentIndex) {
            return aa[index];
        }else {
            return -1;
        }
    }

    public void clear() {
        currentIndex=0;
    }
}
