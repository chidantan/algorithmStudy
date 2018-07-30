package jianzhioffer;

import java.util.Stack;

public class QueueByTwoStack {
    private Stack<Integer> stack1 = new Stack<>();
    private Stack<Integer> stack2 = new Stack<>();

    public static void main(String[] args) {
        QueueByTwoStack queueByTwoStack = new QueueByTwoStack();
        queueByTwoStack.push(1);
        queueByTwoStack.push(2);
        queueByTwoStack.push(3);
        System.out.println(queueByTwoStack.pop());
        System.out.println(queueByTwoStack.pop());
        queueByTwoStack.push(4);
        System.out.println(queueByTwoStack.pop());
        queueByTwoStack.push(5);
        System.out.println(queueByTwoStack.pop());
        System.out.println(queueByTwoStack.pop());
    }

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
//        if (stack2.size() > 0) {
//            return stack2.pop();
//        }
//        while (stack1.size() > 0) {
//            stack2.push(stack1.pop());
//        }
//        if (stack2.size() > 0) {
//            return stack2.pop();
//        }
//        return -1;
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        int first = stack2.pop();
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
        return first;
    }
}