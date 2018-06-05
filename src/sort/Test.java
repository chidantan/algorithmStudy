package sort;

import common.Swap;

import java.lang.ref.WeakReference;
import java.util.ArrayList;

/**
 * Created by lyn on 18-3-22.
 */
public class Test {


    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        printListFromTailToHead(listNode);
    }

   static class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        if (listNode == null) {
            ArrayList<Integer> list = new ArrayList<Integer>();
        }
        ArrayList<Integer> list = printListFromTailToHead(listNode.next);
        list.add(listNode.val);
        return list;
    }
}
