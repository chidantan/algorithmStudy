package book_interview_guide.chapter_01;

import java.util.Stack;

/**
 * Created by lyn on 18-5-2.
 * 设计一个有getMin功能的栈
 * 题目:实现一个特殊的栈，在实现栈的基本功能的基础上，再实现返回栈中最小元素的操作
 * 要求：1.pop，push，getMin的时间复杂度都是O（1）
 *      2.设计的栈类型可以使用现成的栈结构
 */
public class GetMin {

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(2);
        minStack.push(3);
        minStack.push(5);
        minStack.push(4);
        minStack.push(1);
        System.out.println(minStack.getMin());
        System.out.println(minStack.pop());
        System.out.println(minStack.pop());
        System.out.println(minStack.getMin());
    }
    static class MinStack{
        private Stack<Integer> stack1 = new Stack<>();
        private Stack<Integer> stack2 = new Stack<>();
        public Integer pop(){
            int i = stack1.pop();
            if (!stack2.isEmpty()&&stack2.peek()==i){
                stack2.pop();
            }
            return i;
        }

        public void push(int i){
            stack1.push(i);
            if(stack2.isEmpty()||i<stack2.peek()){
                stack2.push(i);
            }
        }

        public int getMin(){
            return stack2.peek();
        }
    }
}
