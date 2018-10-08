package common;

public class ListNode {
    public int val;
    public ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }

    public static ListNode createIncreaseListNode() {
        ListNode node5 = new ListNode(5);
        ListNode node4 = new ListNode(4);
        ListNode node3 = new ListNode(3);
        ListNode node2 = new ListNode(2);
        ListNode node1 = new ListNode(1);
        node2.next = node1;
        node3.next = node2;
        node4.next = node3;
        node5.next = node4;
        return node5;
    }

    public static ListNode createDncreaseListNode() {
        ListNode node5 = new ListNode(5);
        ListNode node4 = new ListNode(4);
        ListNode node3 = new ListNode(3);
        ListNode node2 = new ListNode(2);
        ListNode node1 = new ListNode(1);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        return node1;
    }

    public static void printListNode(ListNode node) {
        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }
    }
}
