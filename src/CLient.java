import common.Constants;
import common.ListNode;

/**
 * Created by lyn on 18-3-30.
 */
public class CLient {
    public static void main(String[] args) {
        ListNode node = ListNode.createDncreaseListNode();
        ListNode node1 = new Solution().ReverseList(node);
        ListNode.printListNode(node1);
    }
}
/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
 class Solution {
    ListNode node;
    public ListNode ReverseList(ListNode head) {
        if(head==null){
            return node;
        }
        ReverseList(head.next);
        if(node==null){
            node = head;
        }else{
            node.next = head;
            node = node.next;
        }
        return node;
    }

}